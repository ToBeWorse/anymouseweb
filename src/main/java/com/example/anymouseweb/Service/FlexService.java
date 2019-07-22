package com.example.anymouseweb.Service;

import com.example.anymouseweb.Mapper.FlexValueMapper;
import com.example.anymouseweb.Entity.FlexValueEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlexService {
    @Autowired
    FlexValueMapper flexValueMapper;

    public FlexValueEntity getProfileByName(String flex_name) {
        return flexValueMapper.getProfileByName(flex_name);
    }

    public FlexValueEntity getProfileById(Integer flex_id){
        return flexValueMapper.getProfileById(flex_id);
    }
}
