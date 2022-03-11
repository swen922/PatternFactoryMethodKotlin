package dialog
import button.*

abstract class Dialog {

    public fun renderButton() {
        val button : Button = createButton()
        button.render()
        button.onClick()
    }

    // Это он и есть – фабричный метод
    abstract fun createButton() : Button
}


