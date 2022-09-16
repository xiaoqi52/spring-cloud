package com.example.userservice.controller;

import com.example.userservice.config.UserProperties;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongchanglin
 * @date 2022年09月16日 22:51
 * @description 用户服务控制器
 */
@RequestMapping(value = "/user")
@RestController
public class UserController {

  @Resource private UserProperties userProperties;

  @GetMapping(value = "/get")
  public String get() {
    return "name:"
        + userProperties.getName()
        + " sex:"
        + userProperties.getSex()
        + " age:"
        + userProperties.getAge();
  }
}
