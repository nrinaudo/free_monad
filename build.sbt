enablePlugins(GhpagesPlugin)

organization       := "com.nrinaudo"
scalaVersion       := "3.1.1"
graphvizStylesheet := Some(graphvizSourceDirectory.value / "style.dss")

scalacOptions ++= Seq("-source", "future", "-Ykind-projector:underscores", "-Xfatal-warnings")

SitePlugin.autoImport.makeSite / includeFilter :=
  "*.yml" | "*.md" | "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.eot" | "*.svg" | "*.ttf" |
    "*.woff" | "*.woff2" | "*.otf"

git.remoteRepo := "git@github.com:nrinaudo/free_monad.git"
