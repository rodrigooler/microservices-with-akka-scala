name := "microservices-with-akka-scala"
organization := "com.oler"
version := "0.0.1"
scalaVersion := "2.12.4"

resolvers += Resolver.jcenterRepo

val akkaHttp = "10.0.10"
val akka = "2.4.19"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % akkaHttp,
  "com.typesafe.akka" %% "akka-slf4j" % akka,
  "de.heikoseeberger" %% "akka-http-jackson" % "1.18.0",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.1.0",
)