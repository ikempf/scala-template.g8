
lazy val `$name$` = (project in file("."))
  .settings(
    organization := "$organization$",
    name := "$name$",
    scalaVersion := "2.13.1",
    libraryDependencies ++= List(
      "org.typelevel" %% "cats-core" % "2.1.0",
      "org.scalatest" %% "scalatest" % "3.1.0" % Test
    ),
    addCompilerPlugin(("org.typelevel" %% "kind-projector" % "0.11.0").cross(CrossVersion.full)),
    scalacOptions ++= List(
      "-target:jvm-1.8",
      "-feature",
      "-encoding",
      "UTF-8",
      "-unchecked",
      "-deprecation",
      "-language:higherKinds",
      "-language:existentials",
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
      "-Xlint:nullary-override",
      "-Xlint:inaccessible",
      "-Xlint:constant"
    )
  )
