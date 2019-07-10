package com.test.cloud.server.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: TangFenQi
 * @description:
 * @date：2019/7/10 16:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringProviderConfiguration {

  public static void main(String[] args) {
    SpringApplication.run(SpringProviderConfiguration.class);
  }

}
