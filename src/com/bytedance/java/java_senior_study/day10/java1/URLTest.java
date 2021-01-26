package com.bytedance.java.java_senior_study.day10.java1;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/27 - 0:37
 * @Description URL网络编程
 * 1.URL:统一资源定位符，对应着互联网上的某一资源地址
 * 2.格式：
 * <传输协议>://<主机名>:<端口号>/<文件名>#片段名?参数列表
 */
public class URLTest {
    public static void main(String[] args) {
        URL url;
        {
            try {
                url = new URL("https://www.baidu.com");

                //public String getProtocol( ) 获取该URL的协议名
                System.out.println(url.getProtocol());
                //public String getHost( ) 获取该URL的主机名
                System.out.println(url.getHost());
                //public String getPort( ) 获取该URL的端口号
                System.out.println(url.getPort());
                //public String getPath( ) 获取该URL的文件路径
                System.out.println(url.getPath());
                //public String getFile( ) 获取该URL的文件名
                System.out.println(url.getPath());
                //public String getQuery( ) 获取该URL的查询名
                System.out.println(url.getQuery());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
