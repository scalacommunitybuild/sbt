lazy val root = (project in file("."))
  .settings(
    scalaVersion := "2.12.10",
    externalPom()
  )
