package com.bytedance.java.java_senior_study.day12.java4;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/1 - 22:42
 * @Description
 */
public class Boy {
    private Girl girl;

    public Boy(Girl girl) {
        this.girl = girl;
    }

    public Boy() {
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "girl=" + girl +
                '}';
    }
}
