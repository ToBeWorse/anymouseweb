package com.example.anymouseweb.Entity;

import java.util.Objects;

/**
 * UploadFile表的实体类
 */
public class UploadFileEntity {
    private Integer file_id;
    private String file_name;
    private String file_name_uuid;
    private String file_server_address;
    private Integer file_size;

    public Integer getFile_id() {
        return file_id;
    }

    public void setFile_id(Integer file_id) {
        this.file_id = file_id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFile_name_uuid() {
        return file_name_uuid;
    }

    public void setFile_name_uuid(String file_name_uuid) {
        this.file_name_uuid = file_name_uuid;
    }

    public String getFile_server_address() {
        return file_server_address;
    }

    public void setFile_server_address(String file_server_address) {
        this.file_server_address = file_server_address;
    }

    public Integer getFile_size() {
        return file_size;
    }

    public void setFile_size(Integer file_size) {
        this.file_size = file_size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UploadFileEntity that = (UploadFileEntity) o;
        return Objects.equals(file_id, that.file_id) &&
                Objects.equals(file_name, that.file_name) &&
                Objects.equals(file_name_uuid, that.file_name_uuid) &&
                Objects.equals(file_server_address, that.file_server_address) &&
                Objects.equals(file_size, that.file_size);
    }

    @Override
    public int hashCode() {

        return Objects.hash(file_id, file_name, file_name_uuid, file_server_address, file_size);
    }

    @Override
    public String toString() {
        return "UploadFileEntity{" +
                "file_id='" + file_id + '\'' +
                ", file_name='" + file_name + '\'' +
                ", file_name_uuid='" + file_name_uuid + '\'' +
                ", file_server_address='" + file_server_address + '\'' +
                ", file_size=" + file_size +
                '}';
    }
}
