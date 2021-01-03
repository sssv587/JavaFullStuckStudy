package com.bytedance.java.java_base_study.day02;

/**
 * @author yuhang.sun
 * @date 2020/12/12 - 23:40
 */

/*
Java定义的数据类型

一、变量按照数据类型来分：
       基本数据类型：
            整型：byte\short\int\long
            浮点型:float\double
            字符型：char
            布尔型：boolean
       引用数据类型：
            类(class)
            接口(interface)
            数组(array)

二、变量在类中声明的位置：
    成员变量 vs 局部变量
*/

public class VariableTest1 {
    public static void main(String[] args) {
        //整型：byte(1字节=8bit)\short(2个字节)\int(4个字节)\long(8个字节)
        //① byte范围：-128 ~ 127
        byte b1 = 12;
        byte b2 = -128;
        System.out.println(b1);
        System.out.println(b2);

        //② 声明long型变量，必须以"l"或"L"结尾
        //③ 通常定义整型变量时，使用int类型
        short s1 = 128;
        System.out.println(s1);

        int i1 = 1234;
        System.out.println(i1);

        long l1 = 34141412312L;
        System.out.println(l1);

        //2.浮点型：float(4字节)\double(8字节)
        //① 浮点型：表示带小数点的数值
        //② float表示数值的范围比long还大
        double d1 = 123.3;
        System.out.println(d1 + 1);
        //③ 定义float类型变量时，变量要以"f"或"F"结尾
        float f1 = 12.3F;
        System.out.println(f1);
        //④通常定义浮点型变量时，使用double类型。

        //3.字符型：char(1字符=2字节)
        //① 定义char型变量，通常使用一对''
        char c1 = 'a';
        //编译不通过
        //c1 = 'AB';
        System.out.println(c1);

        char c2 = '1';
        char c3 = '中';
        System.out.println(c2);
        System.out.println(c3);

        //① 表示方式：1.声明一个字符 2.转义字符 3.直接使用Unicode值来表示字符型常量
        //换行符
        char c5 = '\n';
        //制表符
        c5 = '\t';
        System.out.print("hello" + c5);
        System.out.println("world");

        char c6 = '\u0043';
        System.out.println(c6);

        //4.布尔型：boolean
        //① 只能取两个值之一：true、false
        //② 常常在条件判断、循环结构中使用
        boolean bb1 = true;
        System.out.println(bb1);

        boolean isMarried = true;
        // if (isMarried) {
        //     System.out.println("你就不能参加单身party了!");
        // } else {
        //     System.out.println("你可以多谈谈女朋友");
        // }
    }
}
