package com.xk.j1902;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Created by Administrator on 2019/6/25.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendMessage {
    @Test
    public void test1() throws IOException {
        HttpClient client = new HttpClient();  //client对象
        PostMethod post = new PostMethod("http://utf8.api.smschinese.cn/"); //该第三方短信服务地址
        post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");//在头文件中设置转码
        NameValuePair[] data ={ new NameValuePair("Uid", "muxinke"),new NameValuePair("Key", "d41d8cd98f00b204e980"),new NameValuePair("smsMob","18165011260"),new NameValuePair("smsText","屈小康【123456】")};
        post.setRequestBody(data);

        client.executeMethod(post);
        Header[] headers = post.getResponseHeaders();
        int statusCode = post.getStatusCode();
        System.out.println("statusCode:"+statusCode);
        for(Header h : headers)
        {
            System.out.println(h.toString());
        }
        String result = new String(post.getResponseBodyAsString().getBytes("utf-8"));
        System.out.println(result); //打印返回消息状态


        post.releaseConnection();

    }
    }
