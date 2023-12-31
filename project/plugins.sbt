// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.22")
// Defines scaffolding (found under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"

addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.11.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "6.0.0")//new line
//addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "4.1.4")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
