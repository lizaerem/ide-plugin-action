package com.github.lizaerem.idepluginaction

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class HelloWorldAction : AnAction() {
    override fun update(e: AnActionEvent) {
        e.presentation.isEnabled = true
    }

    override fun actionPerformed(e: AnActionEvent) {
        HelloWorldDialog().show()
    }
}
