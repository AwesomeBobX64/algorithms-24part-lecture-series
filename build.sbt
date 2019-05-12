ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "algorithms"

lazy val app = (project in file("."))
  .settings(
    name                := "Algorithms: 24-part Lecture Series",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )
