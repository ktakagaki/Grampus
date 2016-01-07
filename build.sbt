name := "Grampus"

lazy val commonSettings = Seq(
  organization := "de.lin.magdeburg",
  version := "0.1.0",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  aggregates(gui, core).
  settings(commonSettings: _*).
  settings(
    // other settings
  )

lazy val core = (project in file("core")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )

lazy val gui = (project in file("gui")).
  project.dependsOn(core).
  settings(commonSettings: _*).
  settings(
    // other settings
  )