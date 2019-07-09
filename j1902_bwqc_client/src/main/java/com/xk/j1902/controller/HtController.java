package com.xk.j1902.controller;

import com.xk.j1902.pojo.Manager;
import com.xk.j1902.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Qxk on 2019/6/26.
 */
@Controller
public class HtController {
    @Autowired
    private ManagerService managerService;
    @ResponseBody
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(@RequestParam("name") String name, @RequestParam("upw")
            String upw, @RequestParam("imgcode") String imgcode){
        System.out.println(name+"--"+upw+"--"+imgcode);
        Manager manager = managerService.findOneByName(name);
        String account = manager.getAccount();
        String password = manager.getPassword();
       if(account.equals(name) && password.equals(upw)){
           return "main";
       }else {
           return "index";
       }

    }


}
