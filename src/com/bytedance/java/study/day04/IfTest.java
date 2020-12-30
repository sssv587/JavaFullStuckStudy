package com.bytedance.java.study.day04;

/**
 * @author yuhang.sun
 * @date 2020/12/20 - 16:40
 */

/*
岳小鹏参加Java考试，他和父亲岳不群达成承诺：
如果：
成绩为100分时，奖励一辆BMW；
成绩为(80，99]时，奖励一台iphone xs max；
当成绩为[60,80]时，奖励一个 iPad；
其它时，什么奖励也没有。
请从键盘输入岳小鹏的期末成绩，并加以判断

说明：
1.else 结构是可选的。
2.针对于条件表达式：
  > 如果多个条件表达式之间是“互斥”关机(或没有交际的关系)，哪个判断和执行语句声明在上面还是下面，无所谓。
  > 如果多个表达式之间有交集的关系，需要根据实际情况，考虑清楚应该将哪个结构声明在上面。
  > 如果多个条件表达式之间有包含关系，通常情况下，需要将范围小的声明在范围大的上面。否则，范围小的就没机会执行了。

*/

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入岳小鹏期末成绩：(0-100)");
        int score = scan.nextInt();

        if (score == 100) {
            System.out.println("奖励一辆BMW");
        } else if (score > 80) {
            System.out.println("奖励一台iphone xs max");
        } else if (score >= 60 ) {
            System.out.println("奖励一台ipad");
        } else {
            System.out.println("什么奖励都没有");
        }
    }
}
