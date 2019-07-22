package com.example.anymouseweb.Service;

import com.example.anymouseweb.CommonUtill.Des;
import com.example.anymouseweb.Entity.UserPwdAllEntity;
import com.example.anymouseweb.Mapper.UserPwdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.anymouseweb.CommonUtill.Des.deencypt;

@Service
public class UserPwdService {
    @Autowired
    UserPwdMapper userPwdMapper;

    /*
   传入从数据库获取的bytes 通过解码获得密码Str
     */
    public String get_user_pwd(String employee_number) {
        String PasswordStr = null;
        try
        {
            Object PassWordObj = userPwdMapper.get_pwd_bytes(employee_number);
            byte[] PassWordbyte = null;
            //从数据获取的object类型数据
            if (PassWordObj != null)
            {
                PassWordbyte = (byte[]) PassWordObj;
            } else
            {
                return "用户" + employee_number + "PassWord未设置";
            }
            //des解密
            byte[] PassWordbyteDes = deencypt(PassWordbyte);
            //des解密得到的byte[]转换成String
            PasswordStr = new String(PassWordbyteDes);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return PasswordStr;
    }
    /*
    向数据库中插入一条密码信息对象
     */
    public void CreatePassWordLine(UserPwdAllEntity userPwdAllEntity){
        userPwdAllEntity.setEmployess_id(6);
        userPwdAllEntity.setDes_pwd(Des.encypt("shanghai"));
        userPwdMapper.insert_into_pwd(userPwdAllEntity);
    }
}
