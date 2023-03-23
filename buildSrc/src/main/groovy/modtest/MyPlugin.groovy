package modtest

import org.gradle.api.Project
import org.gradle.api.Task

class MyPlugin {
  final Project project

  public MyPlugin(Project project) {
    this.project = project
  }

  def helloTask() {
    Task incomplete = project.task("alsoHello") {
      doLast {
        println("Hello again")
      }
    }
  }

  def toyNumberedFrom(String source, ArrayList<String> config) {
    config.each { from ->
      Task t1 = project.task("check-${source}-${from}-driver") {
        doLast {
          println("Check ${source} from ${from}")
        }
      }
    }
  }

/*
  def realNumberedFrom(String source, ArrayList<String> config) {
    config.each { from ->
      Task t1 = project.task("check-${source}-${from}-driver",
                             type: SaxonXsltTask) {
        ...
      }
    }
  }
*/
}
