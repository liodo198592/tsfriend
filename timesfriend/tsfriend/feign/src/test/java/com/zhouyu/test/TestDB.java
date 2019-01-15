package com.zhouyu.test;

import com.zhouyu.feign.Application;
import com.zhouyu.feign.ifapi.ApiService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDB {

    @Autowired
    private ApiService apiService;

    @Test
    public void test(){
        try {
            System.out.println("\n <=======>zhouyu test : " + apiService.index() + "==============>\n");
            System.out.println("\n <=======>zhouyu test : " + apiService.index() + "==============>\n");
            System.out.println("\n <=======>zhouyu test : " + apiService.index() + "==============>\n");
            System.out.println("\n <=======>zhouyu test : " + apiService.index() + "==============>\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}