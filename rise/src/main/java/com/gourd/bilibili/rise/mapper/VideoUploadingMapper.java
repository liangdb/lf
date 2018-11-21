package com.gourd.bilibili.rise.mapper;

import com.gourd.bilibili.rise.model.VideoUploading;
import com.gourd.bilibili.rise.model.VideoUploadingWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface VideoUploadingMapper {
    int deleteByPrimaryKey(String fileid);

    int insert(VideoUploadingWithBLOBs record);

    int insertSelective(VideoUploadingWithBLOBs record);

    VideoUploadingWithBLOBs selectByPrimaryKey(String fileid);

    int updateByPrimaryKeySelective(VideoUploadingWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VideoUploadingWithBLOBs record);

    int updateByPrimaryKey(VideoUploading record);
}