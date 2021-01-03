package com.bytedance.java.java_base_study.day10.java1;

/**
 * @author yuhang.sun
 * @date 2020/12/29 - 23:15
 *
 * JavaBean是一种Java语言写成的可重用组件。
 *
 * 所谓javaBean，是指符合如下标准的Java类：
 * 类是公共的
 * 有一个无参的公共的构造器
 * 有属性，且有对应的get、set方法
 */
public class Customer {
    private int id;
    private String name;

    public Customer(){}

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
