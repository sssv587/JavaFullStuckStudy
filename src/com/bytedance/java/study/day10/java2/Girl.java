package com.bytedance.java.study.day10.java2;

/**
 * @author yuhang.sun
 * @date 2020/12/30 - 0:35
 */
public class Girl {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Girl(int age) {
        this.age = age;
    }

    public Girl() {
    }

    public Girl(String name) {
        this.name = name;
    }

    public void marry(Boy boy) {
        System.out.println("我想嫁" + boy.getName());
        boy.marry(this);
    }

    /**
     * @param girl
     * @return 正数：当前对象大； 负数：当前对象小  0：当前对象与形参对象相等
     */
    public int compare(Girl girl) {
        return Integer.compare(this.age, girl.age);
    }
}
