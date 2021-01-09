package com.bytedance.java.java_base_study.day16.exercise;

/**
 * @author yuhang.sun
 * @date 2021/1/9 - 22:23
 * @Description 自定义异常类
 */
public class EcmDef extends Exception {
    static final long serialVersionUID = -3387516993124229948L;

    public EcmDef() {
    }

    public EcmDef(String msg) {
        super(msg);
    }
}
