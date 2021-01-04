package com.bytedance.java.java_base_study.day14.java2;

import org.jetbrains.annotations.NotNull;

/**
 * @author yuhang.sun
 * @date 2021/1/5 - 1:02
 * @Description
 */
public class MainDemo {
    public static void main(String @NotNull [] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("****" + args[i]);

            int num = Integer.parseInt(args[i]);
            System.out.println("####" + num);
        }
    }
}
