package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author hongchanglin
 * @date 2022年09月16日 10:08
 * @description 用户服务启动器
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UserserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(UserserviceApplication.class, args);
  }
}
