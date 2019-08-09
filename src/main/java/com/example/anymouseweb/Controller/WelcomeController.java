package com.example.anymouseweb.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


@Controller
public class WelcomeController {

    private final static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    //http://localhost:8089/index
    @RequestMapping({"/index.thy","/","index.html"})
    public String index() {
        return "index";
    }


}
