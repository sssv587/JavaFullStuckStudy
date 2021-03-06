package com.bytedance.java.project.Project02.ui;

import com.bytedance.java.project.Project02.bean.Customer;
import com.bytedance.java.project.Project02.service.CustomerList;
import com.bytedance.java.project.Project02.util.CMUtility;

/**
 * @author yuhang.sun
 * @date 2021/1/1 - 15:10
 * @Description CustomerView为主模块，负责菜单的显示和处理用户操作
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("迪丽热巴", '女', 23, "13578541254", "4668424@163.com");
        customerList.addCustomer(customer);
    }

    public static void main(String[] args) {
        CustomerView cView = new CustomerView();
        cView.enterMainMenu();
    }

    /**
     * @Description 显示《客户信息管理软件》界面的方法
     */
    public void enterMainMenu() {
        boolean loopFlag = true;
        do {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");

            char key = CMUtility.readMenuSelection();
            System.out.println();
            switch (key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    char yn = CMUtility.readConfirmSelection();
                    if (yn == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        } while (loopFlag);
    }

    /**
     * @Description 添加客户的操作
     */
    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(15);
        System.out.print("邮箱：");
        String email = CMUtility.readString(15);

        //将上述数据封装到对象中
        Customer cus = new Customer(name, gender, age, phone, email);

        boolean isSuccess = customerList.addCustomer(cus);
        if (isSuccess) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("----------------记录已满,无法添加-----------------");
        }
    }

    /**
     * @Description 修改客户的操作
     */
    private void modifyCustomer() {
        int number = 0;
        Customer cust = null;
        System.out.println("---------------------修改客户---------------------");
        for (; ; ) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            number = CMUtility.readInt();

            if (number == -1) {
                return;
            }

            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户!");
            } else {//找到相应编号的客户
                break;
            }
        }
        //修改客户信息
        System.out.print("姓名(" + cust.getName() + ")：");
        String name = CMUtility.readString(4, cust.getName());

        System.out.print("性别(" + cust.getGender() + ")：");
        char gender = CMUtility.readChar(cust.getGender());

        System.out.print("年龄(" + cust.getAge() + ")：");
        int age = CMUtility.readInt(cust.getAge());

        System.out.print("电话(" + cust.getPhone() + ")：");
        String phone = CMUtility.readString(15, cust.getPhone());

        System.out.print("邮箱(" + cust.getEmail() + ")：");
        String email = CMUtility.readString(15, cust.getEmail());

        cust = new Customer(name, gender, age, phone, email);
        boolean isReplaced = customerList.replaceCustomer(number - 1, cust);
        if (isReplaced) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("----------无法找到指定客户,修改失败--------------");
        }
    }

    /**
     * @Description 删除客户的操作
     */
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        int number = 0;

        for (; ; ) {
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(number - 1);

            if (customer == null) {
                System.out.println("无法找到指定客户!");
            } else {
                break;
            }
        }

        //找到了指定的客户
        System.out.print("确认是否删除(Y/N)：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer(number-1);
            if(deleteSuccess){
                System.out.println("---------------------------删除成功!---------------------------");
            }else{
                System.out.println("---------------------------删除失败!---------------------------");
            }
        }
    }

    /**
     * @Description 查询客户的操作
     */
    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                System.out.println((i + 1) + "\t" + custs[i]);
            }
        }
        System.out.println("-------------------------客户列表完成-------------------------");
    }
}
