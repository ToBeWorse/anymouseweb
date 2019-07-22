package com.example.anymouseweb.Entity;


import java.util.Objects;

/**
 * 表FND_FLEX_VALUE的实体类
 */
public class FlexValueEntity {
    private Integer Flex_Id;
    private String Flex_Name;
    private String Flex_Value;
    private String Flex_Address;

    public Integer getFlex_Id() {
        return Flex_Id;
    }

    public void setFlex_Id(Integer flex_Id) {
        Flex_Id = flex_Id;
    }

    public String getFlex_Name() {
        return Flex_Name;
    }

    public void setFlex_Name(String flex_Name) {
        Flex_Name = flex_Name;
    }

    public String getFlex_Value() {
        return Flex_Value;
    }

    public void setFlex_Value(String flex_Value) {
        Flex_Value = flex_Value;
    }

    public String getFlex_Address() {
        return Flex_Address;
    }

    public void setFlex_Address(String flex_Address) {
        Flex_Address = flex_Address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlexValueEntity that = (FlexValueEntity) o;
        return Objects.equals(Flex_Id, that.Flex_Id) &&
                Objects.equals(Flex_Name, that.Flex_Name) &&
                Objects.equals(Flex_Value, that.Flex_Value) &&
                Objects.equals(Flex_Address, that.Flex_Address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Flex_Id, Flex_Name, Flex_Value, Flex_Address);
    }

    @Override
    public String toString() {
        return "FlexValueEntity{" +
                "Flex_Id=" + Flex_Id +
                ", Flex_Name='" + Flex_Name + '\'' +
                ", Flex_Value='" + Flex_Value + '\'' +
                ", Flex_Address='" + Flex_Address + '\'' +
                '}';
    }
}
