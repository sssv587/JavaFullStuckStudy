package com.bytedance.java.java_senior_study.day08.exercise;

import org.jetbrains.annotations.NotNull;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/21 - 22:28
 * @Description private 成员变量 year,month,day；并为每一个属性定义 getter, setter方法；
 */
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(@NotNull MyDate o) {
        //比较年
        int minusYear = this.getYear() - o.getYear();
        if (minusYear != 0) {
            return minusYear;
        }
        //比较月
        int minusMonth = this.getMonth() - o.getMonth();
        if (minusMonth != 0) {
            return minusMonth;
        }
        //比较日
        return this.getDay() - o.getDay();
    }
}
