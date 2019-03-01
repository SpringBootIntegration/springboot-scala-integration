package com.edurt.ssi.controller

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class HelloController {

  @GetMapping(value = Array("hello"))
  def hello(): String = {
    return "hello,scala"
  }

}