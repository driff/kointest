package pruebas.di

import org.koin.dsl.module
import pruebas.classes.DemoClass
import pruebas.classes.DemoClassData

val messageModule = module {
    single {DemoClassData()}
    single {DemoClass(get())}
}