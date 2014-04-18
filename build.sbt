name := "asdf"

resolvers ++= Seq(
 "typesafe" at "http://repo.typesafe.com/typesafe/releases",
 "scalaz"   at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
 "org.scalaz" %% "scalaz-core" % "7.1.0-M6",
 "org.scalaz" %% "scalaz-effect" % "7.1.0-M6",
 "org.spire-math" %% "spire" % "0.7.3",
 "org.specs2" %% "specs2" % "2.3.10-scalaz-7.1.0-M6" % "test"
)
