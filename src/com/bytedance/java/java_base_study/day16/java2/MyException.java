package com.bytedance.java.java_base_study.day16.java2;

/**
 * @author yuhang.sun
 * @date 2021/1/9 - 22:07
 * @Description 如何自定义异常类？
 * <p>
 * 1. 继承于现有的异常结构：RuntimeException、Exception
 * 2. 提供全局常量：serialVersionUID
 * 3. 提供重载的构造器
 *
 */
public class MyException extends Exception {
    static final long serialVersionUID = -7034897190745766939L;

    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }

}
