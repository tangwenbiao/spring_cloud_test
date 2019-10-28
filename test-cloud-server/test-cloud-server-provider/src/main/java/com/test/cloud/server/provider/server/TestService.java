package com.test.cloud.server.provider.server;


import com.test.cloud.server.facade.ITest;
import org.springframework.web.bind.annotation.RequestBody;
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
public class TestService implements ITest {

  @Override
  @RequestMapping(value = "/hello", method = RequestMethod.POST)
  public void test(@RequestBody String name) {
    System.out.println("hi !!" + name);
  }
}
