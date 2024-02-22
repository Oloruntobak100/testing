package com.system_testing.unit_testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

  @GetMapping("/start")
  public String first_api() {
    return "Welcome to my first API project - I changed my directory";
  }
}
