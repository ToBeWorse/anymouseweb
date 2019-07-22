package com.example.anymouseweb.Entity;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

/**
 * 表user_pwd_all的实体类
 */
public class UserPwdAllEntity {
    private int Password_id;
    private int employess_id;
    private byte[] des_pwd;
    private java.sql.Timestamp create_date;
    private java.sql.Timestamp last_update_date;

    public int getPassword_id() {
        return Password_id;
    }

    public void setPassword_id(int password_id) {
        Password_id = password_id;
    }

    public int getEmployess_id() {
        return employess_id;
    }

    public void setEmployess_id(int employess_id) {
        this.employess_id = employess_id;
    }

    public byte[] getDes_pwd() {
        return des_pwd;
    }

    public void setDes_pwd(byte[] des_pwd) {
        this.des_pwd = des_pwd;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public Timestamp getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(Timestamp last_update_date) {
        this.last_update_date = last_update_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPwdAllEntity that = (UserPwdAllEntity) o;
        return Password_id == that.Password_id &&
                employess_id == that.employess_id &&
                Arrays.equals(des_pwd, that.des_pwd) &&
                Objects.equals(create_date, that.create_date) &&
                Objects.equals(last_update_date, that.last_update_date);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(Password_id, employess_id, create_date, last_update_date);
        result = 31 * result + Arrays.hashCode(des_pwd);
        return result;
    }

    @Override
    public String toString() {
        return "UserPwdAllEntity{" +
                "Password_id=" + Password_id +
                ", employess_id=" + employess_id +
                ", des_pwd=" + Arrays.toString(des_pwd) +
                ", create_date=" + create_date +
                ", last_update_date=" + last_update_date +
                '}';
    }
}
