package com.gourd.bilibili.rise.service;

import com.gourd.bilibili.rise.model.User;

import java.util.List;

/**
 * @Author:pengpeng
 * @Description:用户service接口
 * @Date: Create in 13:45 2018/11/16 0016
 * @Others:
 * @Version:1.0
 **/
public interface UserService  {
    //用户注册
  void registered(User user);
    //删除用户
  void deleteById(String userId);
    //用户修改
  void update(User user);
    //用户查询后端
  List<User> findAll();
    //通过姓名模糊查User
  List<User> findByRealNameLike(String userRealName);
    //通过userName模糊查用户
  List<User> findByNameLike(String userName);
    //通过性别来查
  Double sexRadio();
    //通过地址模糊查询
  List<User> findByAddressLike(String address);
}
