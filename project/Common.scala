import sbt._
import Keys._

object Common {
  def version = "dev-SNAPSHOT"
  def playVersion = System.getProperty("play.version", "2.3.5")
  def scalaVersion =  System.getProperty("scala.version", "2.10.4")
}
