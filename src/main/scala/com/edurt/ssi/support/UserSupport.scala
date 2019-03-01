package com.edurt.ssi.support

import com.edurt.ssi.model.UserModel
import org.springframework.data.repository.PagingAndSortingRepository

trait UserSupport extends PagingAndSortingRepository[UserModel, Long] {

}
