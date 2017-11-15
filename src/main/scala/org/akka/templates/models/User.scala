package org.akka.templates.models

import com.fasterxml.jackson.annotation.JsonIgnore
import org.mongodb.scala.bson.ObjectId

import scala.annotation.meta.field

/**
  * @author Rodrigo Oler <roodrigoprogrammer@gmail.com>
  * @param id
  */
case class UserRequest(id: String)

/**
  * @author Rodrigo Oler <roodrigoprogrammer@gmail.com>
  * @param _id
  * @param username
  * @param age
  */
case class User(@(JsonIgnore@field)
                var _id: ObjectId,
                username: String,
                email: String,
                password: String,
                firstName: String,
                lastName: String,
                age: Int) {
  def id: String = _id.toString
}