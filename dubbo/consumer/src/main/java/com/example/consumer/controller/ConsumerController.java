package com.example.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.common.bean.User;
import com.example.common.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hongchanglin
 * @date 2022年09月02日 10:08
 * @description 使用者控制器
 */
@Controller
public class ConsumerController {

  @Reference
  UserService userService;
  @ResponseBody
  @GetMapping("/get")
  public User get(){
    return userService.get();
  }
}
