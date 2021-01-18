package com.bytedance.java.project.Project03.service;

/**
 * @author yuhang.sun
 * @date 2021/1/10 - 16:19
 * @Description 表示员工状态
 */
//public class Status {
//    private final String NAME;
//
//    private Status(String NAME) {
//        this.NAME = NAME;
//    }
//
//    public String getNAME() {
//        return NAME;
//    }
//
//    public static final Status FREE = new Status("FREE");
//    public static final Status BUSY = new Status("BUSY");
//    public static final Status VOCATION = new Status("VOCATION");
//
//    @Override
//    public String toString() {
//        return NAME;
//    }
//}


public enum Status {
    FREE, BUSY, VOCATION;
}
