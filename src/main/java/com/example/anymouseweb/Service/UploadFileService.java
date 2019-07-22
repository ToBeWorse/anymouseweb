package com.example.anymouseweb.Service;

import com.example.anymouseweb.Entity.UploadFileEntity;
import com.example.anymouseweb.Mapper.UploadFileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadFileService {
    @Autowired
    UploadFileMapper uploadFileMapper;

    public UploadFileEntity getUploadFileAddressByFileName(String file_name) {
        return uploadFileMapper.getUploadFileAddressByFileName(file_name);
    }

    public UploadFileEntity getUploadFileNameUUIDByFilename(String file_name) {
        return uploadFileMapper.getUploadFileNameUUIDByFilename(file_name);
    }

    public UploadFileEntity getUploadFileSizeByFileName(String file_name) {
        return uploadFileMapper.getUploadFileSizeByFileName(file_name);
    }

    public UploadFileEntity getUploadFileAddressByFileNameUUID(String file_name_uuid) {
        return uploadFileMapper.getUploadFileAddressByFileNameUUID(file_name_uuid);
    }

    public void savaUploadFileInfo(UploadFileEntity uploadFileEntity) {
        System.out.println("保存到数据库：" + uploadFileEntity.toString());
        uploadFileMapper.savaUploadFileInfo(uploadFileEntity);
    }
}
