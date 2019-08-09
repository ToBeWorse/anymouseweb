package com.example.anymouseweb.Mapper;

import com.example.anymouseweb.Entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {

    /**
     * 创建用户
     * @param employeeEntity
     * @return
     */
    public void CreateEmployee(EmployeeEntity employeeEntity);

    public Object getPassword(String employee_number);
}
