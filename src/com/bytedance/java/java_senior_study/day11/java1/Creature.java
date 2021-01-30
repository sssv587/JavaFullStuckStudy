package com.bytedance.java.java_senior_study.day11.java1;

import java.io.Serializable;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/28 - 23:34
 * @Description
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath() {
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}
