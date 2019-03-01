package com.edurt.ssi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(value = Array(
  "com.edurt.ssi.controller"
))
class SpringBootScalaIntegration

object SpringBootScalaIntegration extends App {

  SpringApplication.run(classOf[SpringBootScalaIntegration])

}
