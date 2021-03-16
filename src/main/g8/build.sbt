
lazy val `$name$` = (project in file("."))
  .settings(
    organization := "$organization$",
    name := "$name$",
    scalaVersion := "2.13.4",
    libraryDependencies ++= List(
      "org.typelevel" %% "cats-core" % "2.3.1",
      "org.scalatest" %% "scalatest" % "3.1.0" % Test
    ),
    addCompilerPlugin(("org.typelevel" %% "kind-projector" % "0.11.3").cross(CrossVersion.full)),
    scalacOptions ++= List(
      "-target:11",
      "-feature",
      "-encoding",
      "UTF-8",
      "-unchecked",
      "-deprecation",
      "-language:higherKinds",
      "-language:existentials",
      "-language:implicitConversions",
      "-Wdead-code",
      "-Wvalue-discard",
      "-Wunused:imports",
      "-Wunused:patvars",
      "-Wunused:implicits",
      "-Wunused:locals",
      "-Wunused:explicits",
      "-Wunused:params",
      "-Wunused:privates",
      "-Woctal-literal",
      "-Xlint:adapted-args",
      "-Xlint:infer-any",
      "-Xlint:nullary-unit",
      "-Xlint:inaccessible",
      "-Xlint:constant",
      "-Ywarn-macros:after"
    ),
    javaOptions += "--illegal-access=warn"
  )
