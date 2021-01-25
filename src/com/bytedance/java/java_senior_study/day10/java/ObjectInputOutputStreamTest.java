package com.bytedance.java.java_senior_study.day10.java;

import org.junit.Test;

import java.io.*;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/26 - 0:03
 * @Description 对象流的使用
 * 1.ObjectInputStream 和 ObjectOutputSteam
 * 2.作用：用于存储和读取基本数据类型数据或对象的处理流。它的强大之处就是可以把Java中的对象写入到数据源中，也能把对象从数据源中还原回来
 * 3.要想一个java对象是可序列化的，需要满足相应的要求。见Person类
 * 4.序列化机制：
 * ObjectInputStream和ObjectOutputSteam不能序列化static和transient修饰的成员变量
 */
public class ObjectInputOutputStreamTest {
    /*
    序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
    使用ObjectOutputStream实现
     */
    @Test
    public void testObjectOutputStream() {
        ObjectOutputStream oos = null;
        try {
            //1.
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            //2.
            oos.writeObject("我爱北京天安门");
            oos.flush();//刷新操作

            oos.writeObject(new Person("热巴", 18,1001,new Account(300.8)));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.
            try {
                assert oos != null;
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    反序列化：将磁盘文件中的对象还原为内存中的一个java对象
    使用ObjectInputStream来实现
     */
    @Test
    public void testObjectInputStream() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));
            Object obj = ois.readObject();
            String str = (String) obj;
            Person p = (Person) (ois.readObject());
            System.out.println(str);
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
