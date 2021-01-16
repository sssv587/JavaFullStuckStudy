package com.bytedance.java.java_senior_study.day03.java;

import org.junit.Test;

import java.util.Date;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/16 - 21:01
 * @Description JDK8.0之前日期和时间的API测试
 */
public class DateTimeTest {
    /*
    java.util.Date类
           | --- java.sql.Date类

     1.两个构造器的使用
          > 构造器一：Date():创建一个对应当前时间的Date对象
          > 构造器二：创建指定毫秒数的Date对象

     2.两个方法的使用
          > toString():显式当前的年、月、日、时、分、秒
          > getTime():获取当前Date对象对应的毫秒数。(时间戳)

     3.java.sql.Date对应着数据库中的日期类型的变量
       > 如何实例化
       > java.util.Date ---> java.sql.Date对象
     */
    @Test
    public void test2() {
        //构造器一：Date():创建一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1);//Sat Jan 16 21:07:43 GMT+08:00 2021
        System.out.println(date1.getTime());//1610802989785

        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1610802989785L);
        System.out.println(date2);

        //创建java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(1610802989785L);
        System.out.println(date3);

        //如何将java.util.Date转换为java.sql.Date对va象
        //情况一：
//        Date date4 = new java.sql.Date(1610802989785L);
//        java.sql.Date date5 = (java.sql.Date) date4;

        //情况二：
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());
        System.out.println(date7);
    }


    //1.System类中的currentTimeMillis()
    @Test
    public void test1() {
        long time = System.currentTimeMillis();
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
        //称为时间戳
        System.out.println(time);
    }
}