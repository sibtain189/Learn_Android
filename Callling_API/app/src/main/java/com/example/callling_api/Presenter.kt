package com.example.callling_api

import java.net.InterfaceAddress

class Presenter(val model: Model, val flanaInterface: Interface) {

    fun downloading() {
        val result = model.download()
        flanaInterface.download(result)

    }

}