package com.test.cloud.server.provider.controller;

import com.test.cloud.server.facade.impl.ITestService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: TangFenQi
 * @description:
 * @date：2019/7/10 17:00
 */
@RestController
public class TestService implements ITestService {

  @Override
  @RequestMapping("test/get")
  public String get(@RequestParam String name) {
    return "test get " + name;
  }
}
