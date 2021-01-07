package com.bytedance.java.java_base_study.day15.java8;

/**
 * @author yuhang.sun
 * @date 2021/1/8 - 1:12
 * @Description
 */
public class Man extends Father implements Filial, Spoony {
    public static void main(String[] args) {
        Man man = new Man();
        man.help();
    }
//    @Override
//    public void help() {
//        System.out.println("我该怎么办呢？");
//        Filial.super.help();
//        Spoony.super.help();
//    }
}

class Father {
    public void help() {
        System.out.println("儿子，救我媳妇！");
    }
}

interface Filial {// 孝顺的

    default void help() {
        System.out.println("老妈，我来救你了");
    }
}

interface Spoony {// 痴情的

    default void help() {
        System.out.println("媳妇，别怕，我来了");
    }
}