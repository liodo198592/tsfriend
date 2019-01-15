
package com.zhouyu.dmutex.test;

import com.zhouyu.dmutex.Application;
import com.zhouyu.dmutex.entity.User;
import com.zhouyu.dmutex.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDB {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        System.out.println("===================testDB==============");
        System.out.println("===================testDB==============");
        System.out.println("===================testDB==============");
        System.out.println("===================testDB==============");
        System.out.println("===================testDB==============");
        User user = new User();
        user.setName("zhouyu2");
        user.setAge(20);
        try {
            userService.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}