package com.bytedance.java.project.Project03.service;

/**
 * @author yuhang.sun
 * @date 2021/1/10 - 19:35
 * @Description 自定义异常类
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -7034897190745766939L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
