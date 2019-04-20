package pruebas.classes

import org.koin.core.KoinComponent
import org.koin.core.inject

class DemoApplication: KoinComponent {
    private val demoMessage by inject<DemoClass>()

    fun printMsg() = println(demoMessage.outputMessage())
}