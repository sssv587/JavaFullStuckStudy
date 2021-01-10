package com.bytedance.java.project.Project03.domain;

import com.bytedance.java.project.Project03.service.Status;

/**
 * @author yuhang.sun
 * @date 2021/1/10 - 16:16
 * @Description
 */
public class Programmer extends Employee {
    private int memberId;//开发团队id
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Programmer() {
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }

    public String getTeamBaseDetails(){
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }

    public String getDetailsForTeam() {
        return  getTeamBaseDetails() + "\t程序员";
    }
}
