scalaVersion := "3.3.0"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"        % "2.0.15",
  "dev.zio" %% "zio-direct" % "1.0.0-RC7",
)

scalacOptions := Seq(
  "-Wunused:locals",
  "-Xfatal-warnings",
)