package com.bytedance.java.java_base_study.day14.java;

import java.util.Objects;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 20:53
 * @Description
 */
public class Man extends Person {
    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("男人多吃肉，长肌肉");
    }

    @Override
    public void walk() {
        System.out.println("霸气走路");
    }

    public void earnMoney() {
        System.out.println("男人负责赚钱养家");
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Man中的equals方法---->");
        if (this == obj) return true;
        if (obj instanceof Man) {
            Man c = (Man) obj;
            return this.age == c.age && this.name.equals(c.name);
        }
        return false;
    }
}
