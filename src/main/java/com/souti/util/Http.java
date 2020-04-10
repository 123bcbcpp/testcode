package com.souti.util;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@PropertySource({"classpath:application.properties"})
@Component
public class Http {
    @Value("${user.url}")
    private static String url="";

    public static JSONObject Http(String tm) throws Exception {
        System.out.println(url);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("tm",tm);
        String res;
        try{
            res = HttpUtil.get("http://149.129.113.103/wkapi.php", map);
            JSONObject jsonObject = JSON.parseObject(res);
            return jsonObject;
       }catch (Exception e){
            throw new Exception("第三方接口异常");
        }

    }


}
