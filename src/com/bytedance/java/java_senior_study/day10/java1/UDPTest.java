package com.bytedance.java.java_senior_study.day10.java1;

import org.junit.Test;
import sun.security.util.Length;

import java.io.IOException;
import java.net.*;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/27 - 0:24
 * @Description UDP协议的网络编程
 */
public class UDPTest {
    //发送端
    @Test
    public void send() throws IOException {
        DatagramSocket socket = new DatagramSocket();

        byte[] data = "我是UDP方式发送的导弹".getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data, 0, data.length, inet, 9090);
        socket.send(packet);
        socket.close();
    }

    //接收端
    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);

        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);

        socket.receive(packet);

        System.out.println(new String(packet.getData(), 0, packet.getLength()));

        socket.close();
    }
}
