package com.example.anymouseweb.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Date;
import java.util.Map;


@Controller
public class WelcomeController {

    private final static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @RequestMapping("/index.thy")
    public String index(Map<String, Object> map) {
        map.put("time", new Date().toString());
        return "index";
    }
    //http://localhost:8089/upload.thy
    @RequestMapping("/upload.thy")
    public String fileupload(Map<String,Object> map){
        map.put("user_name","User");
        return "uploadfile";
    }

}
