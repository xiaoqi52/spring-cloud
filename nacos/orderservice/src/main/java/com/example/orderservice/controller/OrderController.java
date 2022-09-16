package com.example.orderservice.controller;

import com.example.orderservice.config.OrderProperties;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongchanglin
 * @date 2022年09月16日 23:08
 * @description 订单服务控制器
 */
@RequestMapping(value = "/order")
@RestController
public class OrderController {

  @Resource private OrderProperties orderProperties;

  @GetMapping(value = "get")
  public String get() {
    return "id:" + orderProperties.getId() + "num:" + orderProperties.getNum();
  }
}
