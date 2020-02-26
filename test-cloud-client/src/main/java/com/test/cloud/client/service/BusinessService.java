package com.test.cloud.client.service;

import com.test.cloud.server.facade.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: TangFenQi
 * @description: 业务服务
 * @date：2019/10/28 19:04
 */
@RestController
public class BusinessService {

  @Autowired
  private ITest test;

  @RequestMapping(value = "say", method = RequestMethod.GET)
  public void say(@RequestParam String name) {
    test.test(name);
  }

}
