package com.bytedance.java.java_base_study.day15.exercise2;

import java.util.Calendar;

/**
 * @author yuhang.sun
 * @date 2021/1/7 - 1:09
 * @Description 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 * 利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday。
 * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 */

public class PayrollSystem {
    public static void main(String[] args) {
        //方式一:
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("请输入当前月的月份:");
        //int month = scanner.nextInt();

        //方式二:
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;

        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("马森", 1002, new MyDate(1992, 2, 28), 10000.5);
        emps[1] = new HourlyEmployee("迪丽热巴", 2008, new MyDate(1998, 1, 10), 100, 240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为:" + salary);

            if(month == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐，奖励100块钱!");
            }
        }
    }
}
