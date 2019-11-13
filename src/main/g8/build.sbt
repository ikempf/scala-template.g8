
lazy val `$name$` = (project in file("."))
  .settings(
    organization := "$organization$",
    name := "$name$",
    scalaVersion := "2.12.10",
    libraryDependencies ++= List(
      "org.typelevel" %% "cats-core" % "2.0.0",
      "org.scalatest" %% "scalatest" % "3.0.8" % Test
    ),
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.9"),
    scalacOptions ++= List(
      "-target:jvm-1.8",
      "-feature",
      "-encoding",
      "UTF-8",
      "-unchecked",
      "-deprecation",
      "-language:higherKinds",
      "-Xlint",
      "-Ypartial-unification",
      "-Ywarn-dead-code",
      "-Ywarn-infer-any",
      "-Ywarn-nullary-override",
      "-Ywarn-unused:implicits",
      "-Ywarn-unused:imports",
      "-Ywarn-unused:locals",
      "-Ywarn-unused:params",
      "-Ywarn-unused:patvars",
      "-Ywarn-unused:privates",
      "-Ywarn-value-discard"
    ),
  )
