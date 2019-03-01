package com.edurt.ssi.model

import javax.persistence.{Entity, GeneratedValue, Id}

@Entity
class UserModel {

  @Id
  @GeneratedValue
  var id: Long = 0

  var name: String = null

}
