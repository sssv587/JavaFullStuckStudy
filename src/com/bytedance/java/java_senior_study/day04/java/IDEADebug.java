package com.bytedance.java.java_senior_study.day04.java;

import org.junit.Test;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/17 - 15:33
 * @Description
 */
public class IDEADebug {
    @Test
    public void testStringBuffer() {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//"null"
        //StringBuffer sb1 = new StringBuffer(str);//抛异常NullPointerException
        //System.out.println(sb1);//
    }

}
