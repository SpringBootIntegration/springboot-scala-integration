package com.edurt.ssi

import com.edurt.ssi.service.UserService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserServiceTest @Autowired()(
                                    private val userService: UserService) {

  @Test
  def `get all`() {
    println(">> Assert blog page title, content and status code")
    val entity = this.userService.getAll(PageRequest.of(0, 1))
    print(entity.getTotalPages)
  }

}