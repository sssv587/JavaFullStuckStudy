package com.bytedance.java.java_senior_study.day12.java4;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/1 - 22:42
 * @Description
 */
public class Girl {
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public Girl() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}
