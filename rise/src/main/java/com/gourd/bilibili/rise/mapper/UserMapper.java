package com.gourd.bilibili.rise.mapper;

import com.gourd.bilibili.rise.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);

    List<User> findAll();
    //男女比例
    Double sexRatio();
    //真实姓名的模糊查询需要+"%"
    List<User> findByRealNameLike(String realName);
    //通过userName来模糊查询需要+"%"
    List<User> findByUserNameLike(String userName);
    //通过地址来模糊查询需要+"%"
    List<User> findByAddressLike(String userAddress);

}