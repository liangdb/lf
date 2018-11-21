package com.gourd.bilibili.rise.mapper;

import com.gourd.bilibili.rise.model.DataDictionary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface DataDictionaryMapper {
    int deleteByPrimaryKey(Integer dataid);

    int insert(DataDictionary record);

    int insertSelective(DataDictionary record);

    DataDictionary selectByPrimaryKey(Integer dataid);

    int updateByPrimaryKeySelective(DataDictionary record);

    int updateByPrimaryKey(DataDictionary record);
}