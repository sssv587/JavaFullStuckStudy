package com.bytedance.java.java_base_study.day13.exercise2;

import java.util.Objects;

/**
 * @author yuhang.sun
 * @date 2021/1/3 - 16:48
 * @Description
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // m1 != m2
        }
        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");// m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof MyDate) {
            MyDate myDate = (MyDate) obj;
            return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
        }
        return false;
    }

    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (o == null || getClass() != o.getClass()) return false;
    //    MyDate myDate = (MyDate) o;
    //    return day == myDate.day &&
    //            month == myDate.month &&
    //            year == myDate.year;
    //}

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
