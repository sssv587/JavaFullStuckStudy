package com.bytedance.java.java_senior_study.day12.java3;

import com.bytedance.java.java_senior_study.day12.java2.Employee;
import com.bytedance.java.java_senior_study.day12.java2.EmployeeData;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/1 - 21:59
 * @Description 测试Stream的终止操作
 */
public class StreamAPITest2 {
    //1-匹配与查找
    @Test
    public void test1() {
        List<Employee> employees = EmployeeData.getEmployees();

        //allMatch(Predicate p) 检查是否匹配所有元素
        //练习：是否所有的员工年龄都大于18岁
        boolean allMatch = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(allMatch);

        //anyMatch(Predicate p) 检查是否至少匹配一个元素
        //练习：是否存在员工的工资大于8000
        boolean anyMatch = employees.stream().anyMatch(e -> e.getSalary() > 10000);
        System.out.println(anyMatch);

        //noneMatch(Predicate p) 检查是否没有匹配所有元素
        //练习：是否存在员工姓"雷"
        boolean noneMatch = employees.stream().noneMatch(e -> e.getName().startsWith("雷"));
        System.out.println(noneMatch);

        //findFirst() 返回第一个元素
        Optional<Employee> employee = employees.stream().findFirst();
        System.out.println(employee);

        //findAny() 返回当前流中的任意元素
        Optional<Employee> employee1 = employees.parallelStream().findAny();
        System.out.println(employee1);
    }

    @Test
    public void test2() {
        List<Employee> employees = EmployeeData.getEmployees();

        //count() 返回流中元素总数
        long count = employees.stream().filter(e -> e.getSalary() > 5000).count();
        System.out.println(count);

        //max(Comparator c) 返回流中最大值
        //练习：返回最高的工资
        Optional<Double> maxSalary = employees.stream().map(Employee::getSalary).max(Double::compareTo);
        System.out.println(maxSalary);

        //min(Comparator c) 返回流中最小值
        //练习：返回最低工资的员工
        Optional<Employee> employee = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(employee);

        //forEach(Consumer c)
        //内部迭代(使用 Collection 接口需要用户去做迭代，称为外部迭代。相反，Stream API 使用内部迭代——它帮你把迭代做了)
        employees.stream().forEach(System.out::println);
        //使用集合的内部迭代
        employees.forEach(System.out::println);
    }

    //2-归约
    @Test
    public void test3() {
        //reduce(T iden, BinaryOperator b) 可以将流中元素反复结合起来，得到一个值。返回 T
        //练习1：计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        //reduce(BinaryOperator b) 可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
        //练习2：计算公司所有员工工资的总和
        List<Employee> employees = EmployeeData.getEmployees();
//        Optional<Double> sumMoney = employees.stream().map(Employee::getSalary).reduce(Double::sum);
        Optional<Double> sumMoney = employees.stream().map(Employee::getSalary).reduce((d1, d2) -> d1 + d2);
        System.out.println(sumMoney.get());
    }

    //3-收集
    @Test
    public void test4() {
        //collect(Collector c) 将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
        //练习1：查找工资大于6000的员工，结果返回为一个List或Set
        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> employeeList = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toList());
        employeeList.forEach(System.out::println);

        System.out.println();

        Set<Employee> employeeSet = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toSet());
        employeeSet.forEach(System.out::println);
    }
}
