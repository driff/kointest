package pruebas.classes

data class DemoClassData(val message: String = "Hello World")

class  DemoClass(private val messageData: DemoClassData) {
    fun outputMessage() = "Message: ${messageData.message}"
}