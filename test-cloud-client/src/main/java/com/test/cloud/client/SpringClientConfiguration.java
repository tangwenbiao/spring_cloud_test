package com.test.cloud.client;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.test.cloud.server.facade.config.TestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: TangFenQi
 * @description:
 * @date：2019/7/10 16:50
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({"com.test.cloud.server.facade"})
@EnableSwagger2
public class SpringClientConfiguration {

  public static void main(String[] args) {
    SpringApplication.run(SpringClientConfiguration.class, args);
  }

  @Bean
  public IRule feignRule() {
    return new RandomRule();
  }



}
