package com.xk.j1902.service;

import com.xk.j1902.pojo.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Qxk on 2019/6/29.
 */
public interface ManagerService {

    //查询全部管理员
    public List<Manager> findAllManager();
    //根据登录名查询管理员
    public Manager findOneByName(String name);
}
