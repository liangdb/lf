package com.gourd.bilibili.rise.mapper;

import com.gourd.bilibili.rise.model.ForumReply;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface ForumReplyMapper {
    int deleteByPrimaryKey(String replyid);

    int insert(ForumReply record);

    int insertSelective(ForumReply record);

    ForumReply selectByPrimaryKey(String replyid);

    int updateByPrimaryKeySelective(ForumReply record);

    int updateByPrimaryKeyWithBLOBs(ForumReply record);

    int updateByPrimaryKey(ForumReply record);
}