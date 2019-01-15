package com.zhouyu.dmutex.controller;

import com.zhouyu.dmutex.redlock.AquiredLockWorker;
import com.zhouyu.dmutex.redlock.DistributedLocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedlockController {

    @Autowired
    private DistributedLocker distributedLocker;

    @RequestMapping("redlock")
    public String index()throws Exception{
        distributedLocker.lock("redlocktest",new AquiredLockWorker<Object>() {

            @Override
            public Object invokeAfterLockAquire() {
                try {
                    System.out.println("执行方法 redlock！");
                    Thread.sleep(5000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return null;
            }

        });
        return "hello world redlock!";
    }
}