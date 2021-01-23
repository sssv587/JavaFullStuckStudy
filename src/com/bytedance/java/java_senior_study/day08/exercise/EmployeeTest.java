package com.bytedance.java.java_senior_study.day08.exercise;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/21 - 22:30
 * @Description 创建该类的5个对象，并把这些对象放入TreeSet集合中（下一章：TreeSet 需使用泛型来定义）
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 * 1). 使 Employee 实现 Comparable 接口，并按 name 排序
 * 2). 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序。
 */
public class EmployeeTest {
    //问题二：按生日日期的先后顺序
    @Test
    public void test2() {
        Comparator<Employee> com = new Comparator<Employee>() {
            //使用泛型以后的写法
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        };

        TreeSet<Employee> set = new TreeSet<>(com);
        Employee e1 = new Employee("deHua", 56, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("liMing", 44, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("xueYou", 45, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("fuCheng", 53, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("chaoWei", 78, new MyDate(1978, 12, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        for (Employee employee : set) {
            System.out.println(employee);
        }
    }

    //问题一：使用自然排序
    @Test
    public void test1() {
        //使用泛型以后的写法
        TreeSet<Employee> set = new TreeSet<>();
        Employee e1 = new Employee("deHua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("liMing", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("xueYou", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("fuCheng", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("chaoWei", 21, new MyDate(1978, 12, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        for (Employee employee : set) {
            System.out.println(employee);
        }
    }
}
