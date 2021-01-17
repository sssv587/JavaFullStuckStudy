package com.bytedance.java.java_senior_study.day04.java;

import org.junit.Test;

import java.time.*;
import java.util.Date;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/17 - 17:49
 * @Description jdk8中的日期时间API测试
 */
public class JDK8DateTest {
    @Test
    public void testDate() {
        //偏移量
        Date date1 = new Date(2020 - 1900, 9 - 1, 8);
        System.out.println(date1);//Tue Sep 08 00:00:00 GMT+08:00 2020
    }

    /*
    LocalDate、LocalTime、LocalDateTime的使用

    说明：1.LocalDateTime相较于LocalDate、LocalTime，使用频率高
         2.类似于Calendar
     */
    @Test
    public void test1() {
        //now():获取当前的日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():设置指定的年、月、日、时、分、秒，没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 06, 13, 23, 43);
        System.out.println(localDateTime1);

        //getXxx()
        //获取相关的属性
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //体现不可变性
        //withXxx:设置相关的属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.minusDays(6);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);
    }

    /*
    Instant的使用
    类似于 java.util.Date类
     */
    @Test
    public void test2() {
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2021-01-17T12:53:14.380Z

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2021-01-17T20:53:14.380+08:00

        //toEpochMilli():获取自1970年1月1日0时0分0秒（UTC）开始的毫秒数。--> Date类的getTime()
        long milli = instant.toEpochMilli();
        System.out.println(milli);//1610888145447

        //ofEpochMilli():通过给定的毫秒数，获取Instant实例
        Instant instant1 = Instant.ofEpochMilli(1610888145447L);
        System.out.println(instant1);
    }
}