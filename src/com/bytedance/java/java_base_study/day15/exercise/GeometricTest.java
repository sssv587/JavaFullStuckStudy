package com.bytedance.java.java_base_study.day15.exercise;


/**
 * @author yuhang.sun
 * @date 2021/1/3 - 13:50
 * @Description 定义三个类，父类GeometricObject代表几何形状，子类Circle代表圆形，MyRectangle代表矩形。
 * 定义一个测试类GeometricTest，编写equalsArea方法测试两个对象的面积是否相等（注意方法的参
 * 数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积（注意方法的参
 * 数类型，利用动态绑定技术）。
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("white", 1.0, 3.3);
        Circle c2 = new Circle("white", 1.0, 3.3);

        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);

        boolean isEquals = test.equalsArea(c1, c2);
        System.out.println("c1和c2的面积是否相等:" + isEquals);

        MyRectangle rect = new MyRectangle("black", 1.0, 2.0, 3.0);
        test.displayGeometricObject(rect);
        MyRectangle rect1 = new MyRectangle("black", 1.0, 2.0, 3.0);
        test.displayGeometricObject(rect1);
    }

    //测试两个对象的面积是否相等
    public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
        return o1.findArea() == o2.findArea();
    }

    public void displayGeometricObject(GeometricObject o1) {
        System.out.println("面积为:" + o1.findArea());
    }
}
