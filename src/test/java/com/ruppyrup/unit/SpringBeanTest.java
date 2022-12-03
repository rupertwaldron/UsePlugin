package com.ruppyrup.unit;

import com.ruppyrup.SpringBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@SpringBootTest(properties = {"jwtToken=43", "dbPassword=monkey"})
class SpringBeanTest {

  @Autowired
  SpringBean springBean;

  @Test
  void printProperties() {
    Assertions.assertEquals("monkey43", springBean.printProperties());

  }
}
