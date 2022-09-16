package com.example.orderservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hongchanglin
 * @date 2022年09月16日 23:11
 * @description 订单信息配置
 */
@Data
@Component
@ConfigurationProperties(prefix = "info")
public class OrderProperties {

  private Integer id;

  private Integer num;

}
