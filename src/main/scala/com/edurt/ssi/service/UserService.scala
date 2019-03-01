package com.edurt.ssi.service

import com.edurt.ssi.model.UserModel
import org.springframework.data.domain.{Page, Pageable}

trait UserService {

  /**
    * save model to db
    */
  def save(model: UserModel): UserModel;

  /**
    * get all model
    */
  def getAll(page: Pageable): Page[UserModel]

}
