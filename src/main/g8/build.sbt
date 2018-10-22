lazy val `$name$` = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      name := "$name$",
      scalaVersion := "2.12.7"
    )),
    scalacOptions += "-Ypartial-unification",
    libraryDependencies ++= List(
      "org.typelevel" %% "cats-core" % "1.4.0",
      "com.github.julien-truffaut" %% "monocle-core" % "1.5.0",
      "com.github.julien-truffaut" %% "monocle-macro" % "1.5.0"
    ),
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.6")
  )
