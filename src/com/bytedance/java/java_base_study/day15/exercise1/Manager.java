package com.bytedance.java.java_base_study.day15.exercise1;

/**
 * @author yuhang.sun
 * @date 2021/1/7 - 0:08
 * @Description
 */
public class Manager extends Employee{
    private double bonus;//奖金

    @Override
    public void work() {
        System.out.println("管理员工，提高公司运行的效率");
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }


}
