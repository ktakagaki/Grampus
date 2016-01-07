import sbt._
import Keys._

object BuildSettings {
  val VERSION = "0.1"

  lazy val basicSettings = seq(
    version               := "0.1",
    homepage              := Some(new URL("http://www.lin-magdeburg.de/en/departments/systemphysiology/index.jsp")),
    organization          := "de.lin_magdeburg",
    description           := "A Scala plotting library with inspirations from Wilkinsons Grammar " +
                             "of Graphics ",
    startYear             := Some(2016),
    licenses              := Seq("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    scalaVersion          := "2.11.7",
    resolvers             ++= Dependencies.resolutionRepos,
    scalacOptions         := Seq(
      "-encoding", "utf8",
      "-feature",
      "-unchecked",
      "-deprecation",
      "-target:jvm-1.8",
      "-language:_",
      "-Xlog-reflective-calls"
    )
  )
  
  lazy val grampusModuleSettings = 
  basicSettings ++ Seq(
  // other module settings
  )
  
}