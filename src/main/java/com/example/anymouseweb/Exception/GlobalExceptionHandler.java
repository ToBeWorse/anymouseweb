package com.example.anymouseweb.Exception;

import com.example.anymouseweb.Controller.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;


/**
 * 全局的异常处理
 */
//@ControllerAdvice
public class GlobalExceptionHandler {

//    private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
//
//    @ExceptionHandler(Exception.class)
//    public String HandlerException(Exception e) {
//        Map<String, Object> map = new HashMap();
//        map.put("error_code", e.getMessage());
//        map.put("error_msg", e.getMessage());
//        logger.info(map.toString());
//        return "Exception";
//    }
}
