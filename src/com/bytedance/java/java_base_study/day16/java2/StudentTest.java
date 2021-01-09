package com.bytedance.java.java_base_study.day16.java2;

/**
 * @author yuhang.sun
 * @date 2021/1/9 - 21:56
 * @Description
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.register(-1001);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(s);
    }
}

class Student {
    private int id;

    public void register(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
            //System.out.println("您输入的数据非法!");
            //手动抛出异常对象
//            throw new Exception("您输入的数据非法!");
            throw new MyException("不能输入负数！");
            //错误的
            //throw new String("不能输入负数！");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
