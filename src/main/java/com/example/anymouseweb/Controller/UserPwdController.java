package com.example.anymouseweb.Controller;

import com.example.anymouseweb.Entity.UserPwdAllEntity;
import com.example.anymouseweb.Service.UserPwdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserPwdController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    UserPwdService userPwdService;

    /**
     * 获取当前用户的密码
     *
     * @param employee_number
     * @return
     */
    @RequestMapping("/getUserPwd/{employee_number}")
    @ResponseBody
    public String get_user_pwd(@PathVariable String employee_number) {
        return userPwdService.get_user_pwd(employee_number);
    }

    /**
     * 插入密码行
     *
     * @return
     */
    @RequestMapping("/insertPwd")
    public String insert_into_pwd() {
        userPwdService.CreatePassWordLine(new UserPwdAllEntity());
        return "index";
    }

    @RequestMapping("/createUser/{employee_number}&{full_name}&{email_address}")
    public String create_new_user(@PathVariable String employee_number, @PathVariable String full_name, @PathVariable String email_address) {
        logger.info("获取到的三个参数：" + employee_number + "," + full_name + "," + email_address);

        return "index";
    }
}
