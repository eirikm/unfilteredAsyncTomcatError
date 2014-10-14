import sbt._
import sbt.Keys._
import com.earldouglas.xsbtwebplugin.WebappPlugin.webappSettings

object Build extends sbt.Build {

  lazy override val settings = super.settings ++ Seq(scalaVersion := "2.11.2")

  lazy val root = Project(
    id = "root",
    base = file("."),
    settings =
      Defaults.coreDefaultSettings ++
        webappSettings ++
        Seq(
          libraryDependencies ++= Seq(
            "net.databinder" %% "unfiltered-filter" % "0.8.2",
            "net.databinder" %% "unfiltered-filter-async" % "0.8.2",

            "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
          )
        )
  )
}
