package com.test.cloud.server.provider.server;


import com.test.cloud.server.facade.ITest;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class TestService implements ITest {

  @RequestMapping(value = "/hello", method = RequestMethod.POST)
  @Override
  public void test(@RequestBody String name) {
    log.info("hi !! {} (provider2)", name);
  }
}
