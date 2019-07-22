package com.example.anymouseweb.Controller;

import com.example.anymouseweb.Entity.FlexValueEntity;
import com.example.anymouseweb.Entity.UploadFileEntity;
import com.example.anymouseweb.Service.FlexService;
import com.example.anymouseweb.Service.UploadFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/fileupload")
public class UploadFileController {
    //Log
    private final static Logger logger = LoggerFactory.getLogger(UploadFileController.class);

    @Autowired
    private UploadFileService uploadFileService;
    @Autowired
    private FlexService flexService;

    @RequestMapping("getUploadFileAddressByFileName/{file_name}")
    @ResponseBody
    public String getUploadFileAddressByFileName(@PathVariable String file_name) {
        UploadFileEntity uploadFileEntity = uploadFileService.getUploadFileAddressByFileName(file_name);
        if (uploadFileEntity != null)
        {
            String uploadFileAddress = uploadFileEntity.getFile_server_address();
            if ("".equals(uploadFileAddress) || uploadFileAddress == null)
            {
                return "ERROR:NO_DATA_FOUND";
            }
        }
        return "ERROR:NO_DATA_FOUND";
    }

    @RequestMapping("getUploadFileNameUUIDByFilename/{file_name}")
    @ResponseBody
    public String getUploadFileNameUUIDByFilename(@PathVariable String file_name) {
        UploadFileEntity uploadFileEntity = uploadFileService.getUploadFileNameUUIDByFilename(file_name);
        String fileNameUUID = uploadFileEntity.getFile_name_uuid();
        if ("".equals(fileNameUUID) || fileNameUUID == null)
        {
            return "ERROR:NO_DATA_FOUND";
        }
        return fileNameUUID;
    }

    @RequestMapping("getUploadFileSizeByFileName/{file_name}")
    @ResponseBody
    public String getUploadFileSizeByFileName(@PathVariable String file_name) {
        UploadFileEntity uploadFileEntity = uploadFileService.getUploadFileSizeByFileName(file_name);
        Integer file_size = uploadFileEntity.getFile_size();
        if ("".equals(file_size) || file_size == null)
        {
            return "ERROR:NO_DATA_FOUND";
        }
        return file_size + "";
    }

    @RequestMapping("getUploadFileAddressByFileNameUUID/{file_name_uuid}")
    @ResponseBody
    public String getUploadFileAddressByFileNameUUID(@PathVariable String file_name_uuid) {
        UploadFileEntity uploadFileEntity = uploadFileService.getUploadFileAddressByFileNameUUID(file_name_uuid);
        String file_server_address = uploadFileEntity.getFile_server_address();
        if ("".equals(file_server_address) || file_server_address == null)
        {
            return "ERROR:NO_DATA_FOUND";
        }
        return file_server_address;
    }

    @RequestMapping("savaUploadFileInfo")
    @ResponseBody
    public void savaUploadFileInfo() {
        UploadFileEntity uploadFileEntity = new UploadFileEntity();
        String file_name = "DO1.txt";
        uploadFileEntity.setFile_name(file_name);
        UUID uuid = UUID.randomUUID();
        String file_name_uuid = uuid.toString();
        uploadFileEntity.setFile_name_uuid(file_name_uuid);
        uploadFileEntity.setFile_server_address(System.getProperty("user.dir"));
        uploadFileEntity.setFile_size(10);
        uploadFileService.savaUploadFileInfo(uploadFileEntity);
        logger.info(uploadFileEntity.toString());
        String file_address = this.getUploadFileAddressByFileName(file_name);
        if ("".equals(file_address) || file_name == null)
        {
            logger.error("ERROR");
        }
    }
//上传文件流
    @RequestMapping("uploadfileStream")
    @ResponseBody
    public String uploadFileStream(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty())
        {
            return "false";
        }
        logger.info("文件的名称：" + file.getOriginalFilename());
        //获取文件的相关信息
        String file_name = file.getOriginalFilename();
        long file_size = file.getSize();
        UUID uuid = UUID.randomUUID();
        String suffixStr = file_name.substring(file_name.lastIndexOf("."), file_name.length());
        String file_name_uuid = uuid + suffixStr;
        logger.info("文件大小" + file_size + "\n" + "文件唯一标识名称:" + file_name_uuid);

        //获取文件的上传地址
        String uploadFilePath = null;
        FlexValueEntity flexValueEntity = flexService.getProfileById(3);
        if (flexValueEntity != null)
        {
            uploadFilePath = flexValueEntity.getFlex_Value();
            logger.info("文件上传的地址：" + uploadFilePath);
        }

        File newFile = new File(uploadFilePath + "/" + file_name_uuid);
        if (!newFile.getParentFile().exists())
        {
            newFile.getParentFile().mkdir();
        }
        try
        {
            file.transferTo(newFile);
            if (newFile.exists())
            {
                UploadFileEntity uploadFileEntity = new UploadFileEntity();
                uploadFileEntity.setFile_name(file.getOriginalFilename());
                uploadFileEntity.setFile_name_uuid(newFile.getName());
                uploadFileEntity.setFile_server_address(newFile.getAbsolutePath());
                uploadFileEntity.setFile_size(new Integer(file.getSize() + ""));
                uploadFileService.savaUploadFileInfo(uploadFileEntity);
            }
            return "true";
        } catch (Exception e)
        {

        }
        return "false";

    }


}
