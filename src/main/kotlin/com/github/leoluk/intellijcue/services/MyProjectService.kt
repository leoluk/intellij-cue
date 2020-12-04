package com.github.leoluk.intellijcue.services

import com.intellij.openapi.project.Project
import com.github.leoluk.intellijcue.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
