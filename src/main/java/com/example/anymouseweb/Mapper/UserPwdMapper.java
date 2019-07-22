package com.example.anymouseweb.Mapper;

import com.example.anymouseweb.Controller.TestController;
import com.example.anymouseweb.Entity.UserPwdAllEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


@Repository
public interface UserPwdMapper {

    /**
     * 获取密码的byte[]
     * @param employees_number
     * @return 密码的Obj
     */
    public Object get_pwd_bytes(String employees_number);

    /**
     * 向user_pwd_all插入一行值
     * @param userPwdAllEntity
     * @return
     */
    public void insert_into_pwd(UserPwdAllEntity userPwdAllEntity);
}
