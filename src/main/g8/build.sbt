organization := "$package$"

name := "$name;format="normalize"$"

version := "0.1.0"

scalaVersion := "2.10.0"

resolvers ++= Seq(
  "Sonatype OSS" at "https://oss.sonatype.org/content/groups/public/"
)

libraryDependencies ++= Seq(
  "org.enmas" %% "enmas-core" % "1.0.0"
)
