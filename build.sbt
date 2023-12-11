name := """newproject"""
organization := "com.new"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)// new line

scalaVersion := "2.12.8"


libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.49"


libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += javaJdbc
//libraryDependencies += cache
libraryDependencies += javaWs
