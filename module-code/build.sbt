name := "SecureSocial"

version := Common.version

scalaVersion := Common.scalaVersion

libraryDependencies ++= Seq(
  cache,
  ws,
  "com.typesafe.play.plugins" %% "play-plugins-util" % "2.3.0",
  "com.typesafe.play.plugins" %% "play-plugins-mailer" % "2.3.0",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "org.specs2" %% "specs2" % "2.3.12" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test"
)

scalariformSettings

resolvers ++= Seq(
  Resolver.typesafeRepo("releases")
)

organization := "ws.securesocial"

organizationName := "SecureSocial"

organizationHomepage := Some(new URL("http://www.securesocial.ws"))

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

publishTo := {
  val nexus = "http://nexus.revmetrix.com:8081/nexus/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/revmetrix_public_snapshots")
  else
    Some("releases"  at nexus + "content/repositories/revmetrix_public_releases")
}

startYear := Some(2012)

description := "An authentication module for Play Framework applications supporting OAuth, OAuth2, OpenID, Username/Password and custom authentication schemes."

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("http://www.securesocial.ws"))

pomExtra := (
  <scm>
    <url>https://github.com/revmetrix/securesocial</url>
    <connection>scm:git:git@github.com:revmetrix/securesocial.git</connection>
    <developerConnection>scm:git:https://github.com/revmetrix/securesocial.git</developerConnection>
  </scm>
  <developers>
    <developer>
      <id>revmetrix</id>
      <name>revmetrix</name>
      <email>jobs@revmetrix.com</email>
      <url>https://twitter.com/revmetrix</url>
    </developer>
  </developers>
)

scalacOptions := Seq("-feature", "-deprecation")

