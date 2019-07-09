package com.xk.j1902.service.impl;

import com.xk.j1902.service.HtService;
import org.springframework.stereotype.Service;

/**
 * Created by Qxk on 2019/6/28.
 */
@Service
public class Mistakes implements HtService {


    @Override
    public String denglu(String name, String upw, String imgcode) {
        return "mistake";
    }
}
