package com.ruppyrup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringBean {

  @Value("${myJwtToken:oops}")
  private String jwtToken;

  @Value("${myDbPassword:nopassword}")
  private String dbPassword;


  public String printProperties() {
    log.info("Jwt Token = " + jwtToken);
    log.info("Db password = " + dbPassword);
    return dbPassword + jwtToken;
  }
}
