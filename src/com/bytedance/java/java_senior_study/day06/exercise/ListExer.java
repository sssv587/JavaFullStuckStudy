package com.bytedance.java.java_senior_study.day06.exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/20 - 22:49
 * @Description
 */
public class ListExer {
    /*
    区分List中remove(int index)和remove(Object obj)
     */
    @Test
    public void testListRemove(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }

    private void updateList(List list){
//        list.remove(2);
        list.remove(new Integer(2));
    }
}
