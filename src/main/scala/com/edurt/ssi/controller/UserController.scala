package com.edurt.ssi.controller

import com.edurt.ssi.model.UserModel
import com.edurt.ssi.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{PathVariable, PostMapping, RequestMapping, RestController}

@RestController
@RequestMapping(value = Array("user"))
class UserController @Autowired()(
                                   val userService: UserService
                                 ) {

  @PostMapping(value = Array("save/{name}"))
  def save(@PathVariable name: String): Long = {
    val userModel = {
      new UserModel()
    }
    userModel.name = name
    return this.userService.save(userModel).id
  }

}
