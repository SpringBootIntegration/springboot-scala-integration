package com.edurt.ssi.service

import com.edurt.ssi.model.UserModel
import com.edurt.ssi.support.UserSupport
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service(value = "userService")
class UserServiceImpl @Autowired() (
                                   val userSupport: UserSupport
                                 ) extends UserService {

  /**
    * save model to db
    */
  override def save(model: UserModel): UserModel = {
    return this.userSupport.save(model)
  }

}
