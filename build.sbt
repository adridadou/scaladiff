import sbt._

name := "scaladiff"

organization := "org.adridadou"

lazy val scalaV = "2.12.4"

libraryDependencies ++= Seq(
  "org.scalatest"            %% "scalatest"                 % "3.0.5"       % Test
)