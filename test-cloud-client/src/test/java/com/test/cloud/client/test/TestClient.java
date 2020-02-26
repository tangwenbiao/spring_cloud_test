package com.test.cloud.client.test;

import com.test.cloud.client.SpringClientConfiguration;
import com.test.cloud.client.service.BusinessService;
import com.test.cloud.client.test.TestReference.TestReference2;
import com.test.cloud.client.test.TestReference.TestReference3;
import com.test.cloud.server.facade.ITest;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.commons.util.SpringFactoryImportSelector;
import org.springframework.core.GenericTypeResolver;
import org.springframework.core.ResolvableType;
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
  public void access() {
    test.test("aa");
  }

  @Test
  public void reference() {
    TestReference2 testReference2 = new TestReference2();
    //无法识别当前类，只能找寻找父类
    Class<?> aClass = GenericTypeResolver
        .resolveTypeArgument(testReference2.getClass(), TestReference.class);
    Map<TypeVariable, Type> typeVariableMap = GenericTypeResolver
        .getTypeVariableMap(TestReference3.class);
    //ResolvableType 对于属性，方法泛型的获取的支持
  }

  @Test
  public void test() {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Math.pow(2, 31) - 1);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Math.pow(-2, 31));
  }

  public int reverse(int x) {
    int targetValue = 0;
    int rangeIndex = 0;
    int[] everyNumber = new int[10];
    while (!(x == 0)) {
      //current step
      int currentValue = x % 10;
      everyNumber[rangeIndex] = currentValue;
      //next step
      rangeIndex++;
      x = x / 10;
    }
    //reconstruct number
    int getIndex = 0;
    while (rangeIndex != 0) {
      int nextValue = (everyNumber[getIndex] * pow(10, rangeIndex - 1));
      if (targetValue > (Math.pow(2, 31) - 1)) {

      }
      targetValue = targetValue + nextValue;
      //next step
      rangeIndex--;
      getIndex++;
    }
    if (targetValue > (Math.pow(2, 31) - 1) || targetValue < pow(-2, 31)) {
      return 0;
    }
    return targetValue;
  }

  public int pow(int baseNumber, int index) {
    if (baseNumber == 0) {
      return 1;
    }
    int targetValue = 1;
    for (int i = 0; i < index; i++) {
      targetValue = targetValue * baseNumber;
    }
    return targetValue;
  }


}
