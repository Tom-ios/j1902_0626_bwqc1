package com.xk.j1902;


import com.xk.j1902.mapper.ManagerMapper;

import com.xk.j1902.pojo.Manager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Qxk on 2019/6/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.xk.j1902.mapper")
public class Mappertest {
    @Autowired
    private ManagerMapper managerMapper;

    @Test
    public void test1() {
        List<String> qxk = managerMapper.findmenuName("qxk");
        for (String s : qxk) {
            System.out.println(qxk);
        }

    }
    @Test
    public void test2(){
        List<Manager> allManager = managerMapper.findAllManager();
        for (Manager m: allManager ) {
            System.out.println(m);
        }

    }

}