package com.souti.controller;

import com.alibaba.fastjson.JSONObject;
import com.souti.pojo.User;
import com.souti.service.UserAll;
import com.souti.util.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controll {
    @Autowired
    Http http;
    @Autowired
    UserAll userAll;
    @Autowired
    User user;
//    马克思主义理论从广义上说是
    @GetMapping("/index")
    public JSONObject index(String tm){
        try {
            JSONObject http = this.http.Http(tm);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = simpleDateFormat.format(new Date());
            user.setTm(http.getString("tm"));
            user.setAsk(http.getString("answer"));
            user.setDate(format);
            userAll.insert(user);
            System.out.println(format);
            return http;
        } catch (Exception e) {
            Map map = new HashMap();
            map.put("statuCode","500");
            return  JSONObject.parseObject("{statucode:500}");
        }
    }


}
