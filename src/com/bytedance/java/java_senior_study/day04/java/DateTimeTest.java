package com.bytedance.java.java_senior_study.day04.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/17 - 15:52
 * @Description jdk8.0之前的日期时间的API测试
 * 1.System类中currentTimeMillis();
 * 2.java.util.Date和子类java.sql.Date
 * 3.SimpleDateFormat
 * 4.Calender
 */
public class DateTimeTest {
    /*
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析

    1.两个操作
    1.1 格式化：日期 ---> 字符串
    1.2 解析：格式化的逆过程：字符串 ---> 日期

    2.SimpleDateFormat的实例化
     */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat:使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化日期：日期 ---> 字符串
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        //解析：格式化的逆过程，字符串 ---> 日期
        String str = "21-3-17 下午4:00";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //***********按照指定的方式格式化和解析：调用带参的构造器**************
        //SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);//2021.01.17 16:07:21
        //解析：要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器的参数体现)，
        //否则，抛异常
        Date date2 = sdf1.parse("2021.01.17 16:07:21");
        System.out.println(date2);
    }

    /*
    练习一：字符串"2020-09-08"转换为java.sql.Date

    练习二："三天打鱼两天晒网" 1990-01-01   xxxx-xx-xx 打鱼？晒网？

    举例：2020-09-08 ? 总天数

    总天数 % 5 == 1,2,3：打鱼
    总天数 % 5 == 4,0：晒网

    总天数的计算？
    方式一：(date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) + 1
    方式二：1990-01-01 --> 2019-12-31  +  2020-01-01 --> 2020-09-08
    */
    @Test
    public void testExercise() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);
        //System.out.println(date);

        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }

    /*
    Calender日历类的使用(抽象类)的使用
     */
    @Test
    public void testCalendar() {
        //1.实例化
        //方式一：创建其子类对象(GregorianCalendar)的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar.getClass());

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set()
        //calendar是可变的
        calendar.set(Calendar.DAY_OF_MONTH, 22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH, -3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //getTime():日历类 --> Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime():Date --> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }

    /*
    DateTimeFormatter:格式化或解析日期、时间
    类似于SimpleDateFormatter
     */
    @Test
    public void test3() {
        //方式一：
        //预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化：日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(str1);//2021-01-17T21:04:05.071
        //解析：字符串-->日期
        TemporalAccessor parse = formatter.parse("2021-01-17T21:04:05.071");
        System.out.println(parse);

        //方式二：
        //本地化相关的格式。如：ofLocalizedDateTime()
        //FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT：适用于LocalDateTime
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //格式化
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);//2021年1月17日 下午09时12分09秒

        //本地化相关的格式。如：ofLocalizedDate()
        //FormatStyle.FULL/FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT：适用于LocalDateTime：适用于LocalDate
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        //格式化
        String str3 = formatter2.format(LocalDate.now());
        System.out.println(str3);//2021-1-17

        //重点：方式三：自定义的格式。如：ofPattern("yyyy-MM-dd hh:mm:ss")
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);//2021-01-17 09:21:44

        //解析
        TemporalAccessor accessor = formatter3.parse("2021-01-17 09:21:44");
        System.out.println(accessor);
    }
}
