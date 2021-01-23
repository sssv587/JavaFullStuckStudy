package com.bytedance.java.java_senior_study.day08.java1;

import org.junit.Test;

import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/23 - 20:34
 * @Description
 */
public class DAOTest {
    @Test
    public void test1() {
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> customerList = dao1.getForList(10);

        StudentDAO dao2 = new StudentDAO();
        Student student = dao2.getIndex(1);
    }
}
