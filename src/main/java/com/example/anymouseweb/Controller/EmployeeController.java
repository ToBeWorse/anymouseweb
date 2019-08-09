package com.example.anymouseweb.Controller;

import com.example.anymouseweb.CommonUtill.Des;
import com.example.anymouseweb.Entity.EmployeeEntity;
import com.example.anymouseweb.Service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    private final static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeService employeeService;


    @RequestMapping("/create/{emp_number}&{emp_name}&{email}&{password}&{card_id}")
    public String CreateUser(@PathVariable String emp_number, @PathVariable String emp_name, @PathVariable String email, @PathVariable String password, @PathVariable String card_id) {

        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployee_number(emp_number);
        employeeEntity.setFull_name(emp_name);
        employeeEntity.setEmail_address(email);
        employeeEntity.setPassword(Des.encypt(password));
        employeeEntity.setCard_id(card_id);
        employeeService.CreateEmployee(employeeEntity);
        return "index";
    }

    @RequestMapping("/judgeUserPassWord/{employee_number}&{password}")
    public String judgeUserPassWord(@PathVariable String employee_number, @PathVariable String password) {
        Boolean flag = employeeService.judgeUserPassword(employee_number, password);
        if (flag) {
            return "index";
        }else
        {
            return "Exception";
        }

    }
}
