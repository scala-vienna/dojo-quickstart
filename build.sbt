name := "dojo-quickstart"

organization := "org.scalavienna"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.4"



libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
)

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE17)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.eclipseOutput := Some(".target")

EclipseKeys.withSource := true

