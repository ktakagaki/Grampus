import sbt._
import Keys._

object Build extends Build {
  import BuildSettings._
  import Dependencies._
  
  // configure prompt to show current project
  override lazy val settings = super.settings :+ {
    shellPrompt := { s => Project.extract(s).currentProject.id + " > " }
  }
  
  // -------------------------------------------------------------------------------------------------------------------
  // Root Project
  // -------------------------------------------------------------------------------------------------------------------

  lazy val root = Project("root",file("."))
    .aggregate(core, gui)
    .settings(basicSettings: _*)
    .settings(
    libraryDependencies ++= backendDeps
	)
	
  // -------------------------------------------------------------------------------------------------------------------
  // Modules
  // -------------------------------------------------------------------------------------------------------------------

  lazy val core = Project("core", file("core"))
    .settings(grampusModuleSettings: _*)
    .settings(libraryDependencies ++=
      provided(akkaActor) ++
      compile(clHashMap) ++
      test(specs2)
    )



}