package com.example.anymouseweb.Entity;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

/**
 * 表Hr_Employee的实体类
 */
public class EmployeeEntity {
    private int employee_id;
    private String employee_number;
    private String full_name;
    private String email_address;
    private byte[] password;
    private String card_id;

    public EmployeeEntity(String employee_number, String full_name, String email_address, byte[] password, String card_id) {
        this.employee_number = employee_number;
        this.full_name = full_name;
        this.email_address = email_address;
        this.password = password;
        this.card_id = card_id;
    }
    public EmployeeEntity() {

    }


    public EmployeeEntity(int employee_id) {
        this.employee_id = employee_id;
    }

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

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
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
                Arrays.equals(password, that.password) &&
                Objects.equals(card_id, that.card_id);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(employee_id, employee_number, full_name, email_address, card_id);
        result = 31 * result + Arrays.hashCode(password);
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employee_id=" + employee_id +
                ", employee_number='" + employee_number + '\'' +
                ", full_name='" + full_name + '\'' +
                ", email_address='" + email_address + '\'' +
                ", password=" + Arrays.toString(password) +
                ", card_id='" + card_id + '\'' +
                '}';
    }
}
