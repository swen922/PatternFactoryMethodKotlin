
import dialog.*

class App {
    private var dialog : Dialog

    constructor() {
        dialog = initDialog()
    }

    private fun initDialog() : Dialog {
        var result : Dialog
        val os = System.getProperty("os.name").toString().toLowerCase()
        if ("nix" in os) {
            result = LinuxDialog()
        }
        else if ("mac" in os) {
            result = MacDialog()
        }
        else {
            result = WinDialog()
        }
        return result
    }

    fun getDialog() : Dialog {
        return dialog
    }

}


fun main(args : Array<String>) {
    val app = App()
    app.getDialog().renderButton()
}