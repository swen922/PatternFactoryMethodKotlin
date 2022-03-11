package button

class LinuxButton : Button {
    override fun render() {
        println("This is Linux Button")
    }

    override fun onClick() {
        println("Linux Button clicked!")
    }
}

class MacButton : Button {
    override fun render() {
        println("This is Mac Button")
    }

    override fun onClick() {
        println("Mac Button clicked!")
    }
}

class WindowsButton : Button {
    override fun render() {
        println("This is Windows Button")
    }

    override fun onClick() {
        println("Windows Button clicked!")
    }
}