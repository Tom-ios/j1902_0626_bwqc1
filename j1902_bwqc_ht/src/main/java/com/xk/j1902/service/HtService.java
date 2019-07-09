package com.xk.j1902.service;

import com.xk.j1902.service.impl.Mistakes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Qxk on 2019/6/28.
 */
@FeignClient(value = "bwqc-client",fallback = Mistakes.class)
public interface HtService {
        @RequestMapping("login")
    public String denglu(@RequestParam("name") String name,@RequestParam("upw")
                String upw,@RequestParam("imgcode") String imgcode);

}
