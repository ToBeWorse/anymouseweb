package com.example.anymouseweb.Controller;

import com.example.anymouseweb.Entity.FlexValueEntity;
import com.example.anymouseweb.Service.FlexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/mybatis")
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private FlexService flexService;

    @RequestMapping("getProfileByName/{flex_name}")
    public String getProfileByName(@PathVariable String flex_name) {
        String queryStr = null;
        FlexValueEntity flexValueEntity = flexService.getProfileByName(flex_name);
        logger.info("获取到对象：" + flexValueEntity.toString());
        queryStr = flexValueEntity.getFlex_Value();
        return queryStr;
    }

    @RequestMapping("getProfileById/{flex_id}")
    public String getProfileById(Integer flex_id) {
        String queryStr = null;
        FlexValueEntity flexValueEntity = flexService.getProfileById(flex_id);
        logger.info("获取到对象：" + flexValueEntity.toString());
        queryStr = flexValueEntity.getFlex_Value();
        return queryStr;
    }


}
