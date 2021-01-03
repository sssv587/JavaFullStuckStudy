package com.bytedance.java.java_base_study.day12.exercise;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 0:26
 * @Description (1)定义一个ManKind类，包括
 * 成员变量int sex和int salary；
 * 方法void manOrWoman()：根据sex的值显示“man”(sex==1)或者“woman”(sex==0)；
 * 方法void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。
 */
public class ManKind {
    private int sex;//性别
    private int salary;//薪资

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ManKind() {
    }

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        } else {
            System.out.println("woman");
        }
    }

    public void employeed() {
        //if (salary == 0) {
        //    System.out.println("no job");
        //} else {
        //    System.out.println("job");
        //}
        //或
        String info = (salary == 0) ? "no job" : "job";
        System.out.println(info);
    }
}
