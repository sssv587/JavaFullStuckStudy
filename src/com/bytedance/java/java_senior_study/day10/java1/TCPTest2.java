package com.bytedance.java.java_senior_study.day10.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/26 - 23:30
 * @Description 实现TCP的网络编程
 * 例题2：客户端发送文件给服务器端，服务器端将文件保存在本地。
 */
public class TCPTest2 {
    @Test
    public void client() throws IOException {
        //1.
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
        //2.
        OutputStream os = socket.getOutputStream();
        //3.
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("")));
        //4.
        byte[] buffer = new byte[1024];
        int len;
        while ((len = bis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        //5.
        bis.close();
        os.close();
        socket.close();
    }

    /*
    这里涉及到的异常，应该使用try-catch-finally
     */
    @Test
    public void server() throws IOException {
        //1.
        ServerSocket ss = new ServerSocket(9090);
        //2.
        Socket socket = ss.accept();
        //3.
        InputStream is = socket.getInputStream();
        //4.
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("beauty1.jpg")));
        //5.
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        //6.
        bos.close();
        socket.close();
        ss.close();
    }
}
