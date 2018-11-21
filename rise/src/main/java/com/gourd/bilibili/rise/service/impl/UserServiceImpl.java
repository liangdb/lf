package com.gourd.bilibili.rise.service.impl;

import com.gourd.bilibili.rise.mapper.UserMapper;
import com.gourd.bilibili.rise.model.User;
import com.gourd.bilibili.rise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:pengpeng
 * @Description:用户实现类
 * @Date: Create in 14:16 2018/11/20 0020
 * @Others:
 * @Version:1.0
 **/
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public void registered(User user) {
    userMapper.insert(user);
    }

    @Override
    public void deleteById(String userId) {
    userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public void update(User user) {
    userMapper.updateByPrimaryKeyWithBLOBs(user);
    }

    @Override//分页
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override//分页
    public List<User> findByRealNameLike(String userRealName) {
        return userMapper.findByUserNameLike(userRealName);
    }

    @Override
    public List<User> findByNameLike(String userName) {
        return userMapper.findByUserNameLike(userName);
    }

    @Override//男女比例
    public Double sexRadio() {
        return userMapper.sexRatio();
    }

    @Override//分页
    public List<User> findByAddressLike(String address) {
        return null;
    }
}
