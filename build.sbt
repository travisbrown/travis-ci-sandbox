scalaVersion := "2.10.5"

resolvers += "Twitter's Repository" at "http://maven.twttr.com/"

ivyLoggingLevel := UpdateLogging.Full

libraryDependencies ++= Seq(
  "com.twitter" %% "finagle-stats" % "6.24.0",
  "com.twitter.common" % "io" % "0.0.64",
  "org.apache.thrift" % "libthrift" % "0.5.0-1"
)

