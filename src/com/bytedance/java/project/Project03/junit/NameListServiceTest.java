package com.bytedance.java.project.Project03.junit;

import com.bytedance.java.project.Project03.domain.Employee;
import com.bytedance.java.project.Project03.service.NameListService;
import com.bytedance.java.project.Project03.service.TeamException;
import org.junit.Test;

/**
 * @author yuhang.sun
 * @date 2021/1/10 - 19:45
 * @Description NameListService测试
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmployee() {
        NameListService service = new NameListService();
        Employee employee = null;
        try {
            employee = service.getEmployee(10);
            System.out.println(employee);
        } catch (TeamException e) {
            e.printStackTrace();
        }
    }
}
