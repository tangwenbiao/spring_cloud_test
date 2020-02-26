package com.test.cloud.client.test;

import com.test.cloud.client.service.BusinessService;

/**
 * @author: TangFenQi
 * @description:
 * @date：2020/2/24 10:50
 */
public class TestReference<T> {

  public static class TestReference2<T> extends TestReference<TestClient> {

  }

  public static class TestReference3 extends TestReference2<BusinessService> {

  }


}
