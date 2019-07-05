package com.test.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author: TangFenQi
 * @description:
 * @date：2019/7/5 16:23
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaConfiguration {

  public static void main(String[] args) {
    SpringApplication.run(SpringEurekaConfiguration.class);
  }

}
