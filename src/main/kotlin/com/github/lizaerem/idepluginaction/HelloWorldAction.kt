package com.github.lizaerem.idepluginaction

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction

class HelloWorldAction : DumbAwareAction() {
    override fun update(e: AnActionEvent) {
        e.presentation.isEnabled = true
    }

    override fun actionPerformed(e: AnActionEvent) {
        HelloWorldDialog().show()
    }
}
