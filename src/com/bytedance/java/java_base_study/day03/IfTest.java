package com.bytedance.java.java_base_study.day03;

/**
 * @author yuhang.sun
 * @date 2020/12/16 - 23:15
 */

/*
分支结构中的if-else(条件判断结构)

一、三种结构

第一种：
if(条件表达式){
    执行表达式;
}

第二种：
if(条件表达式){
    执行表达式1;
}else{
    执行表达式2;
}

第三种:
if(条件表达式){
    执行表达式1;
}else if(条件表达式){
    执行表达式2;
}
...
else{
    执行表达式n;
}
*/

public class IfTest {
    public static void main(String[] args) {
        //举例1
        int heartBeats = 178;
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("需要做进一步检查");
        }

        System.out.println("检查结束");

        //举例2
        int age = 23;
        if (age < 18) {
            System.out.println("你还可以看动画片");
        } else {
            System.out.println("你可以看成人电影了");
        }

        //举例3
        if (age < 0) {
            System.out.println("您输入数据错误");
        } else if (age < 18) {
            System.out.println("青少年时期");
        } else if (age < 35) {
            System.out.println("青壮年时期");
        } else if (age < 60) {
            System.out.println("中年时期");
        } else if (age < 120) {
            System.out.println("老年时期");
        } else {
            System.out.println("你是要成仙啊~~");
        }
    }
}
