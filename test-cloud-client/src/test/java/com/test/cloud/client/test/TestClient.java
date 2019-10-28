package com.test.cloud.client.test;

import com.test.cloud.client.SpringClientConfiguration;
import com.test.cloud.client.service.BusinessService;
import com.test.cloud.server.facade.ITest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: TangFenQi
 * @description:
 * @date：2019/10/28 19:09
 */
@SpringBootTest(classes = {SpringClientConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestClient {

  @Autowired
  private ITest test;

  @Test
  public void test() {
    test.test("abc");
  }

}
