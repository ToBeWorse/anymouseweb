package com.example.anymouseweb.Service;

import com.example.anymouseweb.CommonUtill.Des;
import com.example.anymouseweb.Entity.EmployeeEntity;
import com.example.anymouseweb.Mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public void CreateEmployee(EmployeeEntity employeeEntity) {
        employeeMapper.CreateEmployee(employeeEntity);
    }

    public Boolean judgeUserPassword(String employee_number, String password) {
        String PasswordStr;
        try
        {
            Object passwordObj = employeeMapper.getPassword(employee_number);

            if (passwordObj == null) return false;
            byte[] passwordByte = (byte[]) passwordObj;
            passwordByte = Des.deencypt(passwordByte);
            PasswordStr = new String(passwordByte);
        } catch (Exception e)
        {
            return false;
        }
        if (password.equals(PasswordStr))
        {
            return true;
        } else
        {
            return false;
        }
    }
}
