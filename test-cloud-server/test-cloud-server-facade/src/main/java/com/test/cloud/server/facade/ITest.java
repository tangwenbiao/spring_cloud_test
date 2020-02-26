package com.test.cloud.server.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: TangFenQi
 * @description:
 * @date：2019/10/18 17:28
 */
@FeignClient(name = "provider")
public interface ITest {


  @RequestMapping(value = "/hello", method = RequestMethod.POST)
  void test(@RequestBody String name);

}
