package com.test.cloud.client.service;

import com.test.cloud.server.facade.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: TangFenQi
 * @description: 业务服务
 * @date：2019/10/28 19:04
 */
@Service
public class BusinessService {

  @Autowired
  private ITest test;

  public void say() {
    test.test("abc");
  }

}
