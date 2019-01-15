package com.zhouyu.dmutex.controller;

import com.zhouyu.dmutex.zk.DistributedLock;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZkController {

    @RequestMapping("zk")
    public String index()throws Exception{
        DistributedLock lock   = new DistributedLock("192.168.1.202:2181","lock");
        lock.lock();
        //共享资源
        if(lock != null){
            System.out.println("执行方法 zk");
            Thread.sleep(5000);
            lock.unlock();
        }
        return "hello world zk!";
    }
}