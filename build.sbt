scalaVersion := "2.12.7"

scalacOptions ++= Seq(
  "-encoding", "UTF-8", // 2 args
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-unchecked",
  "-Yno-adapted-args",
  "-Ypartial-unification",
  "-Ywarn-value-discard"
)

libraryDependencies ++= Seq(
  "org.typelevel" %% "kittens" % "1.2.0",
  "org.tpolecat" %% "atto-core" % "0.6.3",
  "org.typelevel" %% "cats-effect" % "1.0.0"
)

enablePlugins(TutPlugin)

tutSourceDirectory := baseDirectory.value / "tut"

tutTargetDirectory := baseDirectory.value / "tut-out"
