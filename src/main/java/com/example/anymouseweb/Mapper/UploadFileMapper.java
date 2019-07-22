package com.example.anymouseweb.Mapper;

import com.example.anymouseweb.Entity.UploadFileEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadFileMapper {
    /*
    通过文件名称获取文件地址
     */
    public UploadFileEntity getUploadFileAddressByFileName(String file_name);

    /*
    通过文件名称获取文件的UUID
     */
    public UploadFileEntity getUploadFileNameUUIDByFilename(String file_name);

    /*
    通过文件名称获取文件的大小
     */
    public UploadFileEntity getUploadFileSizeByFileName(String file_names);

    /*
    通过文件的UUID获取文件的地址
     */
    public UploadFileEntity getUploadFileAddressByFileNameUUID(String file_name_uuid);

    /*
    保存上传文件的信息
     */
    public void savaUploadFileInfo(UploadFileEntity uploadFileEntity);
}
