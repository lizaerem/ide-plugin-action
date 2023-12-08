package com.github.lizaerem.idepluginaction

import com.intellij.openapi.ui.DialogWrapper
import javax.swing.*
import java.awt.*

class HelloWorldDialog : DialogWrapper(true) {

    init {
        title = "Hello World Dialog"
        init()
    }

    override fun createCenterPanel(): JComponent {
        val panel = JPanel(BorderLayout())
        panel.add(JLabel("Hello World!"), BorderLayout.CENTER)
        return panel
    }

    override fun createActions(): Array<Action> {
        return arrayOf(okAction)
    }
}
