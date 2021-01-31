package com.bytedance.java.java_senior_study.day12.java;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/30 - 23:36
 * @Description 静态代理举例
 *
 * 特点：代理类和被代理类在编译期间，就确定下来了。
 */
interface ClothFactory {
    void productCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory {
    private ClothFactory factory;//用被代理对象进行实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void productCloth() {
        System.out.println("代理工厂做一些准备工作");
        factory.productCloth();
        System.out.println("代理工厂做一些后续的收尾工作");
    }
}

//被代理类
class NikeClothFactory implements ClothFactory {

    @Override
    public void productCloth() {
        System.out.println("Nike工厂生产一批运动服");
    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        //创建被代理类对象
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        //创建代理类对象
        ClothFactory proxyClothFactory = new ProxyClothFactory(nikeClothFactory);

        proxyClothFactory.productCloth();
    }
}
