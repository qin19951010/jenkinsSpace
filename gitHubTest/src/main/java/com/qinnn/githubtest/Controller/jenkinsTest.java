package com.qinnn.githubtest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class jenkinsTest {
    @GetMapping("/jenkins/test")
    public Map gitTest(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","Qinnn");
//        map.put("email","1394323886@qq.com");
        //添加时间,1111
//        map.put("time",new Date());
//        map.put("status","success");
        return map;
    }
}
