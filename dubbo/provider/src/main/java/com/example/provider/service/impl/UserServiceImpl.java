package com.example.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.commoninterface.bean.User;
import com.example.commoninterface.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author hongchanglin
 * @date 2022年09月01日 18:35
 */
@Service
@Component
public class UserServiceImpl implements UserService {


  @Override
  public User get() {
    User user = new User();
    user.setUsername("张三");
    user.setPassword("Aa123456");
    return user;
  }
}
