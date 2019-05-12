ThisBuild / scalaVersion := "2.12.7"

lazy val app = (project in file("."))
  .settings(
    name := "Algorithms: 24-part Lecture Series",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )