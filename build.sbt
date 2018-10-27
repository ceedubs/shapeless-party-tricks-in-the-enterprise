scalaVersion := "2.12.7"

scalacOptions ++= Seq(
  "-encoding", "UTF-8", // 2 args
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-value-discard"
)

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.3.3"
)

enablePlugins(TutPlugin)

tutSourceDirectory := baseDirectory.value / "tut"

tutTargetDirectory := baseDirectory.value / "tut-out"
