package com.example.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.commoninterface.bean.User;
import com.example.commoninterface.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hongchanglin
 * @date 2022年09月02日 00:08
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
