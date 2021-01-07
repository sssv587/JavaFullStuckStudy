package com.bytedance.java.java_base_study.day15.java1;

/**
 * @author yuhang.sun
 * @date 2021/1/7 - 23:02
 * @Description 接口的应用：代理模式
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}

interface NetWork {
    public abstract void browse();
}

//被代理类
class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

//代理类
class ProxyServer implements NetWork{
    private NetWork work;

    public void check(){
        System.out.println("联网前的检查工作");
    }

    public ProxyServer(NetWork work) {
        this.work = work;
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }
}