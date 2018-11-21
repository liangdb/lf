package com.gourd.bilibili.rise.mapper;

import com.gourd.bilibili.rise.model.Video;
import com.gourd.bilibili.rise.model.VideoWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface VideoMapper {
    int deleteByPrimaryKey(String videoid);

    int insert(VideoWithBLOBs record);

    int insertSelective(VideoWithBLOBs record);

    VideoWithBLOBs selectByPrimaryKey(String videoid);

    int updateByPrimaryKeySelective(VideoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VideoWithBLOBs record);

    int updateByPrimaryKey(Video record);
}