package com.bytedance.java.java_base_study.day13.java;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 20:57
 * @Description 面向对象特征之三：多态性
 * <p>
 * 1.理解多态性：可以理解为一个事物的多种形态
 * 2.何为多态性：
 * 对象的多态性：父类的引用指向子类的对象(或子类的对象赋给父类的引用)
 * 3.多态的使用：虚拟方法调用
 * 有了对象的多态性以后，我们在编译器，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法
 * 总结：编译：看左边  运行：看右边
 * <p>
 * 4.多态性的使用前提：① 类的继承关系  ② 要有方法的重写
 * <p>
 * 5.对象的多态性：只适用于方法，不适用于属性(编译和运行都看左边)
 * <p>
 * ********************************************
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        System.out.println("============================================");

        //**********************************
        //对象多态性:父类的引用指向子类的对象
        Person p2 = new Man();
        System.out.println(p2);
        //多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法---虚拟方法调用
        p2.eat();
        p2.walk();
        System.out.println(p2.id);

        //Person p3 = new Women();
        //p3.eat();

        //p2.earnMoney();

        System.out.println("********************************************");

        //不能调用子类特有的方法、属性：编译时，p2是Person类型
        //p2.earnMoney();
        //p2.isSmoking = true;
        //有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于声明为变量声明为父类类型，导致
        //编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。

        //如何才能调用子类特有的属性和方法？
        //向下转型，使用强制类型转换
        Man m1 = (Man) p2;
        m1.earnMoney();
        m1.isSmoking = true;

        //使用强转时，可能出现ClassCastException的异常。
        //Women w1 = (Women) p2;
        //w1.goShopping();

        /**
         * instanceof关键字的使用
         * a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是。返回false。
         *
         * 使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先
         * 进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。
         *
         * 如果 a instanceof A返回true，则a instanceof B也返回true
         * 其中，类B是类A的父类。
         */
        if (p2 instanceof Women) {
            Women w1 = (Women) p2;
            w1.goShopping();
            System.out.println("*********Women***********");
        }

        if (p2 instanceof Man) {
            Man w2 = (Man) p2;
            w2.earnMoney();
            System.out.println("*********Man***********");
        }

        if (p2 instanceof Person) {
            System.out.println("*********Person***********");
        }

        if (p2 instanceof Object) {
            System.out.println("*********Object***********");
        }

        //练习：
        //问题一:编译通过，运行时不通过
        //举例一：
        //Person p3 = new Women();
        //Man m2 = (Man) p3;

        //举例二:
        //Person p4 = new Person();
        //Man m4 = (Man) p4;

        //问题二：编译通过，运行也通过
        Object obj = new Women();
        Person p = (Person) obj;

        //问题三：编译不过
        //Man m5 =  new Women();
        //String str = new Date();
    }
}
