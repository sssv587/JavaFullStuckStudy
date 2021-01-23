package com.bytedance.java.java_senior_study.day08.java;


import java.util.ArrayList;
import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/23 - 19:50
 * @Description
 */
public class SubOrder extends Order<Integer> {//SubOrder<T>不再是泛型类
    public static <E> List<E> copFromArrayToList(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (E e :
                arr) {
            list.add(e);
        }
        return list;
    }
}
