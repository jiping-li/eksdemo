package com.openlane.eksdemo.routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {
  
  @GetMapping("/hi")
  String hello() {
    return "hi,eks, hi eagles";
  }
}
