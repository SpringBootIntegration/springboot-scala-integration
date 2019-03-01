package com.edurt.ssi.view

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloView {

  @GetMapping(value = Array("hello_view"))
  def helloView: String = {
    return "hello";
  }

}
