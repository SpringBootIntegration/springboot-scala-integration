package com.edurt.ssi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(value = Array(
  "com.edurt.ssi"
))
@EntityScan(value = Array(
  "com.edurt.ssi.model"
))
class SpringBootScalaIntegration

object SpringBootScalaIntegration extends App {

  SpringApplication.run(classOf[SpringBootScalaIntegration])

}
