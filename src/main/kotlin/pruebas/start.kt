package pruebas

import org.koin.core.context.startKoin
import pruebas.classes.DemoApplication
import pruebas.di.messageModule

fun main(){
    startKoin {
        printLogger()
        modules(messageModule)
    }

    DemoApplication().printMsg()
}