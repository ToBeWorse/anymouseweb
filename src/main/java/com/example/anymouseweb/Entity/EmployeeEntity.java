package com.example.anymouseweb.Entity;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * 表Hr_Employee的实体类
 */
public class EmployeeEntity {
    private int employee_id;
    private String employee_number;
    private String full_name;
    private String email_address;
    private java.sql.Timestamp birthday;
    private java.sql.Timestamp create_date;
    private java.sql.Timestamp last_update_date;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_number() {
        return employee_number;
    }

    public void setEmployee_number(String employee_number) {
        this.employee_number = employee_number;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
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
        EmployeeEntity that = (EmployeeEntity) o;
        return employee_id == that.employee_id &&
                Objects.equals(employee_number, that.employee_number) &&
                Objects.equals(full_name, that.full_name) &&
                Objects.equals(email_address, that.email_address) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(create_date, that.create_date) &&
                Objects.equals(last_update_date, that.last_update_date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(employee_id, employee_number, full_name, email_address, birthday, create_date, last_update_date);
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employee_id=" + employee_id +
                ", employee_number='" + employee_number + '\'' +
                ", full_name='" + full_name + '\'' +
                ", email_address='" + email_address + '\'' +
                ", birthday=" + birthday +
                ", create_date=" + create_date +
                ", last_update_date=" + last_update_date +
                '}';
    }
}
