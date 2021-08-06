package dev.haenara.test.kmmsample

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}