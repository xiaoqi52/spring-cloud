package com.example.userservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hongchanglin
 * @date 2022年09月16日 22:53
 * @description 用户信息配置
 */
@Data
@Component
@ConfigurationProperties(prefix = "info")
public class UserProperties {

  private String name;

  private String sex;

  private Integer age;


}
