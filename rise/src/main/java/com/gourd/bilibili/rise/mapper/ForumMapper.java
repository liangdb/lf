package com.gourd.bilibili.rise.mapper;

import com.gourd.bilibili.rise.model.Forum;
import com.gourd.bilibili.rise.model.ForumWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface ForumMapper {
    int deleteByPrimaryKey(String forumid);

    int insert(ForumWithBLOBs record);

    int insertSelective(ForumWithBLOBs record);

    ForumWithBLOBs selectByPrimaryKey(String forumid);

    int updateByPrimaryKeySelective(ForumWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ForumWithBLOBs record);

    int updateByPrimaryKey(Forum record);
}