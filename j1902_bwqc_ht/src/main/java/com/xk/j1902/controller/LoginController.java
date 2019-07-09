package com.xk.j1902.controller;

import com.xk.j1902.service.HtService;
import com.xk.j1902.utils.ImgCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.xk.j1902.utils.ImgCode.RANDOMCODEKEY;

/**
 * Created by Qxk on 2019/6/28.
 */
@Controller
public class LoginController {
    @Autowired
    private HtService htService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)

    public String login(@RequestParam("name") String name,@RequestParam("upw")
                        String upw,@RequestParam("imgcode") String imgcode,
                        HttpServletRequest request){

        HttpSession session = request.getSession(true);
        String code = (String) session.getAttribute(RANDOMCODEKEY);
        System.out.println(code);
        String xx="";
        if(imgcode.equals(code)){
             xx = htService.denglu(name,upw,imgcode);
            return xx;
        }else{
            return "index";
        }


    }
    @RequestMapping(value = "/getImg")
    public void getImgCode(HttpServletRequest request , HttpServletResponse response ){
        ImgCode imgCode = new ImgCode();
        imgCode.getRandcode(request,response);

    }
}
