package com.edurt.ssi.view

import com.edurt.ssi.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UserView @Autowired()(
                             private val userService: UserService
                           ) {

  @GetMapping(value = Array("user_view"))
  def helloView(model: Model): String = {
    model.addAttribute("users", this.userService.getAll(PageRequest.of(0, 10)))
    return "user"
  }

}
