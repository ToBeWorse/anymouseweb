package com.example.anymouseweb.Mapper;

import com.example.anymouseweb.Entity.FlexValueEntity;
import org.springframework.stereotype.Repository;

/**
 * FND_FLEX_VALUE表的Mapper
 */
@Repository
public interface FlexValueMapper {
    /*
     *根据名字获取值
     */
    FlexValueEntity getProfileByName(String flex_name);
    /*
    根据ID获取值
     */
    FlexValueEntity getProfileById(int flex_id);
}
