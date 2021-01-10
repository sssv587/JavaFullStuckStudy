package com.bytedance.java.project.Project03.service;

import com.bytedance.java.project.Project03.domain.*;

import static com.bytedance.java.project.Project03.service.Data.*;

/**
 * @author yuhang.sun
 * @date 2021/1/10 - 16:44
 * @Description 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 */
public class NameListService {
    private Employee[] employees;

    public NameListService(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * 给employees及数组元素进行初始化
     */
    public NameListService() {
        //根据项目提供的Data类构建相应大小的employees数组
        //再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
        //将对象存于数组中
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < EMPLOYEES.length; i++) {
            //获取员工类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            //获取Employee的4个基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    /**
     * 获取指定index位置上的员工的设备
     *
     * @param index
     * @return
     */
    private Equipment createEquipment(int index) {
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        switch (type) {
            case PC://21
                return new PC(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
            case NOTEBOOK://22
                return new NoteBook(EQUIPMENTS[index][1], Double.parseDouble(EQUIPMENTS[index][2]));
            case PRINTER://23
                return new Printer(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
        }
        return null;
    }

    /**
     * 获取当前所有员工
     *
     * @return
     */
    public Employee[] getEmployees() {
        return employees;
    }


    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     * 获取指定ID的员工对象
     *
     * @param id
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
}
