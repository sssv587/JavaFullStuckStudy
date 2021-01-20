package com.bytedance.java.java_senior_study.day05.java;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/18 - 0:38
 * @Description 使用enum关键字定义枚举类
 * <p>
 * 说明：定义的枚举类默认继承于java.lang.Enum类
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        //toString():返回枚举类对象的名称
        System.out.println(summer.toString());

        //System.out.println(Season1.class.getSuperclass());

        //values():返回所有的枚举类对象构成的数组
        Season1[] values = Season1.values();
        for (Season1 value : values) {
            System.out.println(value);
            value.show();
        }

        System.out.println("*********************");

        Thread.State[] values1 = Thread.State.values();
        for (Thread.State state : values1) {
            System.out.println(state);
        }

        //valueOf(String objName)：返回枚举类中对象名是objName的对象。
        //如果没有objName的枚举类对象，则抛异常：IllegalArgumentException
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        winter.show();
    }
}

interface Info {
    void show();
}

//使用enum关键字枚举类
enum Season1 implements Info{
    //3.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
    SPRINT("春天", "春暖花开"){
        @Override
        public void show(){
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show(){
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show(){
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show(){
            System.out.println("大约在冬季");
        }
    };

    //1.声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器，并给对象属性赋值
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    //4.其他诉求1：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }

//    @Override
//    public void show() {
//        System.out.println("这是一个季节!");
//    }

}