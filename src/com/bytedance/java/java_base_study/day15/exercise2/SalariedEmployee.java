package com.bytedance.java.java_base_study.day15.exercise2;

/**
 * @author yuhang.sun
 * @date 2021/1/7 - 0:58
 * @Description 定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。该类包括：private成员变量monthlySalary；
 * 实现父类的抽象方法earnings(),该方法返回monthlySalary值；toString()方法输出员工类型信息及员工的name，number,birthday。
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, double number, MyDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, double number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }
}
