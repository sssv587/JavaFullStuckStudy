package com.bytedance.java.study.day12.java2;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 17:32
 * @Description 体会4中不同的权限修饰
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate() {
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }

    void methodDefault() {
    }

    protected void methodProtected() {
    }

    public void methodPublic() {
    }
}
