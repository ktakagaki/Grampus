import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    "spray repo" at "http://repo.spray.io/",
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
	"Artima Maven Repository" at "http://repo.artima.com/releases"
  )

  val scalactic 	= "org.scalactic" 							%%  "scalactic" 				  % "2.2.6"
  val scalaTest 	= "org.scalatest" 							%%  "scalatest" 				  % "2.2.6" % "test"
  
  
  // Projects
  val backendDeps = 
    Seq(scalactic, scalaTest)
  
}