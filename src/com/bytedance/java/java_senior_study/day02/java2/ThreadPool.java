package com.bytedance.java.java_senior_study.day02.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/16 - 1:17
 * @Description 创建线程的方式四：使用线程池
 * <p>
 * 好处：
 * 1.提高响应速度（减少了创建新线程的时间）
 * 2.降低资源消耗（重复利用线程池中线程，不需要每次都创建）
 * 3.便于线程管理
 *      corePoolSize：核心池的大小
 *      maximumPoolSize：最大线程数
 *      keepAliveTime：线程没有任务时最多保持多长时间后会终止
 *    ...
 *
 * 面试题：创建多线程有几种方式？四种
 */
public class ThreadPool {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service = (ThreadPoolExecutor) executorService;
        //设置线程池的属性
        //System.out.println(executorService.getClass());
        service.setCorePoolSize(15);
        //service.setKeepAliveTime();
        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable实现类的对象
        executorService.execute(new NumberThread());//适合适用于Runnable
        executorService.execute(new NumberThread1());//适合适用于Runnable
        //executorService.submit();//适合适用于Callable
        //3.关闭连接池
        executorService.shutdown();
    }
}

class NumberThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}