package com.xk.j1902.mapper;


import com.xk.j1902.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 86181 on 2019/5/27.
 */
@Mapper
public interface ManagerMapper {
    //测试方法
    //权限
    public List<String> findmenuName(String name);
    //查询全部管理员
    public List<Manager> findAllManager();
    //根据登录名查询管理员
    public Manager findOneByName(@Param("account") String name);


}
