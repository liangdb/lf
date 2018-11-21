package com.gourd.bilibili.rise.mapper;

import com.gourd.bilibili.rise.model.VideoLeaveMessage;
import com.gourd.bilibili.rise.model.VideoLeaveMessageWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface VideoLeaveMessageMapper {
    int deleteByPrimaryKey(String messageid);

    int insert(VideoLeaveMessageWithBLOBs record);

    int insertSelective(VideoLeaveMessageWithBLOBs record);

    VideoLeaveMessageWithBLOBs selectByPrimaryKey(String messageid);

    int updateByPrimaryKeySelective(VideoLeaveMessageWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VideoLeaveMessageWithBLOBs record);

    int updateByPrimaryKey(VideoLeaveMessage record);
}