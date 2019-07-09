package com.xk.j1902.service.impl;

import com.xk.j1902.mapper.ManagerMapper;
import com.xk.j1902.pojo.Manager;
import com.xk.j1902.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Qxk on 2019/6/29.
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;
    @Override
    public List<Manager> findAllManager() {
        return managerMapper.findAllManager();
    }

    @Override
    public Manager findOneByName(String name) {
        return managerMapper.findOneByName(name);
    }
}
