package com.bytedance.java.project.Project03.domain;

/**
 * @author yuhang.sun
 * @date 2021/1/10 - 16:26
 * @Description
 */
public class Designer extends Programmer {
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t\t" + getEquipment().getDescription();
    }

    public String getDetailsForTeam() {
        return getTeamBaseDetails() + "\t设计师\t" + getBonus();
    }
}
