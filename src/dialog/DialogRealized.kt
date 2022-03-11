package dialog

import button.*

class LinuxDialog : Dialog {
    constructor() : super()

    override fun createButton(): Button {
        return LinuxButton()
    }
}

class MacDialog : Dialog {
    constructor() : super()

    override fun createButton(): Button {
        return MacButton()
    }
}

class WinDialog : Dialog {
    constructor() : super()

    override fun createButton(): Button {
        return WindowsButton()
    }

}