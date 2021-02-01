package com.bytedance.java.java_senior_study.day12.java3;

import com.bytedance.java.java_senior_study.day12.java2.Employee;
import com.bytedance.java.java_senior_study.day12.java2.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/1 - 0:16
 * @Description 测试Stream的中间操作
 */
public class StreamAPITest1 {

    //1-筛选与切片
    @Test
    public void test1() {
        List<Employee> employeeList = EmployeeData.getEmployees();
        //filter(Predicate p) 接收 Lambda，从流中排除某些元素
        Stream<Employee> stream = employeeList.stream();
        //练习：查询员工表中薪资大于7000的员工信息。
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);

        System.out.println();

        //limit(long maxSize) 截断流，使其元素不超过给定数量
        employeeList.stream().limit(3).forEach(System.out::println);

        System.out.println();

        //skip(long n) 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足n个，则返回一个空流。与limit(n)互补
        employeeList.stream().skip(3).forEach(System.out::println);

        System.out.println();

        //distinct() 筛选，通过流所生成元素的hashCode()和equals()去除重复元素
        employeeList.add(new Employee(1010, "刘强东", 40, 8000));
        employeeList.add(new Employee(1010, "刘强东", 40, 8000));
        employeeList.add(new Employee(1010, "刘强东", 40, 8000));
        employeeList.add(new Employee(1010, "刘强东", 40, 8000));
        employeeList.add(new Employee(1010, "刘强东", 40, 8000));

        //System.out.println(employeeList);
        employeeList.stream().distinct().forEach(System.out::println);
    }

    //2-映射
    @Test
    public void test2() {
        //map(Function f) 接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd", "ee");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //练习1：获取员工姓名长度大于3的员工的姓名
        List<Employee> employeeList = EmployeeData.getEmployees();
        employeeList.stream().map(Employee::getName).filter(e -> e.length() > 3).forEach(System.out::println);


        //练习2：
        Stream<Stream<Character>> streamStream = list.stream().map(StreamAPITest1::fromStringToStream);
        streamStream.forEach(s -> s.forEach(System.out::println));

        System.out.println();

        //flatMap(Function f) 接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
        Stream<Character> characterStream = list.stream().flatMap(StreamAPITest1::fromStringToStream);
        characterStream.forEach(System.out::println);

        //mapToDouble(ToDoubleFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 DoubleStream。
        //mapToInt(ToIntFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 IntStream。
        //mapToLong(ToLongFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 LongStream。
    }

    //将字符串中的多个字符构成的集合转换为对应的Stream的实例
    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    @Test
    public void test3() {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.addAll(list2);
        //list1.add(list2);

        System.out.println(list1);
    }

    //3-排序
    @Test
    public void test4() {
        //sorted() 产生一个新流，其中按自然顺序排序
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 1, 2);
        list.stream().sorted().forEach(System.out::println);

        //抛异常，原因：Employee没有实现Comparable接口
//        List<Employee> employees = EmployeeData.getEmployees();
//        employees.stream().sorted().forEach(System.out::println);

        //sorted(Comparator com) 产生一个新流，其中按比较器顺序排序
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted((e1, e2) -> {
            int ageValue = Integer.compare(e1.getAge(), e2.getAge());
            if (ageValue != 0) {
                return ageValue;
            } else {
                return -Double.compare(e1.getSalary(), e2.getSalary());
            }
        }).forEach(System.out::println);
    }
}
