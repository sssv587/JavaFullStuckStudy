package com.bytedance.java.study.day08.exercise;

/**
 * @author yuhang.sun
 * @date 2020/12/27 - 1:32
 * <p>
 * 4. 对象数组题目：
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
 * score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 * <p>
 * 此代码是对StudentTest.java的改进，将操作数组的功能封装到方法中。
 */
public class StudentTest1 {
    public static void main(String[] args) {
        //声明Student类型的数组
        Student1[] stus = new Student1[20];

        for (int i = 0; i < stus.length; i++) {
            //给数组元素赋值
            stus[i] = new Student1();
            //给Student对象的属性赋值
            stus[i].number = (i + 1);
            //年级，[1,6]
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            //成绩,[1,100]
            stus[i].score = (int) (Math.random() * (100 + 1));
        }

        StudentTest1 test = new StudentTest1();

        //遍历学生数组
        test.print(stus);

        System.out.println("--------------------");

        //问题一：打印出3年级(state值为3）的学生信息。
        test.searchState(stus, 3);

        System.out.println("--------------------");

        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        test.sort(stus);
        test.print(stus);
    }

    //遍历Student1[]数组的操作
    public void print(Student1[] stus) {
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }

    //问题一：打印出3年级(state值为3）的学生信息。
    public void searchState(Student1[] stus, int state) {
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == state) {
                System.out.println(stus[i].info());
            }
        }
    }

    /**
     * @param stus
     */
    public void sort(Student1[] stus) {
        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < stus.length; i++) {
            for (int j = 0; j < stus.length - i - 1; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    //如果需要换序，交换的是数组的元素，Student对象!!!
                    Student1 temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }

}

class Student1 {
    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生信息的方法
    public String info() {
        return "学号为:" + number + " 年级为：" + state
                + " 成绩为：" + score;
    }
}