package com.bytedance.java.java_base_study.day15.exercise3;

/**
 * @author yuhang.sun
 * @date 2021/1/8 - 0:12
 * @Description
 *
 * interface CompareObject{
 * public int compareTo(Object o); //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
 * }
 */
public interface CompareObject {
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}