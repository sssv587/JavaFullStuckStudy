package com.bytedance.java.java_senior_study.day08.exercise1;

import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/23 - 23:12
 * @Description 创建 DAO 类的对象，分别调用其 save、get、update、list、delete方法来操作User对象，使用Junit单元测试类进行测试。
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1001", new User(1001, 34, "zhouJieLun"));
        dao.save("1002", new User(1002, 20, "kunLing"));
        dao.save("1003", new User(1003, 25, "caiYiLin"));

        dao.update("1003", new User(1003, 30, "fangWenShan"));
        dao.delete("1002");

        List<User> list = dao.list();
        //System.out.println(list);
        list.forEach(System.out::println);
        System.out.println(dao.get("1001"));
    }
}
