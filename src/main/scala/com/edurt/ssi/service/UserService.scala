package com.edurt.ssi.service

import com.edurt.ssi.model.UserModel

trait UserService {

  /**
    * save model to db
    */
  def save(model: UserModel): UserModel;

}
