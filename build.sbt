import sbtsonar.SonarPlugin.autoImport.sonarProperties

name := "ScalaProofOfConcept"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

sonarProperties ++= Map(
  "sonar.scoverage.reportPath" -> "target/scala-2.12/scoverage-report/scoverage.xml"
)

sonarProperties := Map(
  "sonar.projectName" -> "Hello World",
  "sonar.projectKey" -> "blah",
  "sonar.sources" -> "src/main/scala",
  "sonar.sourceEncoding" -> "UTF-8",
  "sonar.scoverage.reportPath" -> "target/scala-2.12/scoverage-report/scoverage.xml"
)

enablePlugins(SonarRunnerPlugin)
