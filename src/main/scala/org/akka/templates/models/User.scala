package org.akka.templates.models

import org.bson.types.ObjectId
import org.mongodb.scala.bson.ObjectId

case class FindByIdRequest(id: String) {
  require(ObjectId.isValid(id), "the informed id is not a representation of a valid hex string")
}

case class UserResource(
  id: String,
  username: String,
  email: String,
  password: String,
  firstName: String,
  lastName: String,
  age: Int) {
  require(username != null, "username not informed")
  require(email != null, "email not informed")
  require(password != null, "password not informed")
  require(firstName != null, "firstName not informed")
  require(lastName != null, "lastName not informed")
  require(username.nonEmpty, "username cannot be empty")
  require(email.nonEmpty, "email not informed")
  require(password.nonEmpty, "password not informed")
  require(firstName.nonEmpty, "firstName not informed")
  require(lastName.nonEmpty, "lastName not informed")
  require(age > 0, "age cannot be lower than 1")

  def asDomain = User(
    if (id == null) ObjectId.get()
    else new ObjectId(id), username, email, password, firstName, lastName, age)
}

case class User(
                 _id: ObjectId,
                 username: String,
                 email: String,
                 password: String,
                 firstName: String,
                 lastName: String,
                 age: Int) {
  def asResource = UserResource(
    _id.toHexString,
    username,
    email,
    password,
    firstName,
    lastName,
    age
  )
}