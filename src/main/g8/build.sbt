organization := "$package$"

name := "$name;format="normalize$"

version := "0.1.0"

scalaVersion := "2.10.0"

resolvers ++= Seq(
  "EnMAS Micro Repository" at "http://enmas.github.com/repo/"
)

libraryDependencies ++= Seq(
  "org.enmas" %% "enmas-core" % "1.0.0"
)
