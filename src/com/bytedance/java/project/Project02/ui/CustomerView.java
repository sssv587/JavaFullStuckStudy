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

    }

    /**
     * @Description 修改客户的操作
     */
    private void modifyCustomer() {
    }

    /**
     * @Description 删除客户的操作
     */
    private void deleteCustomer() {
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
