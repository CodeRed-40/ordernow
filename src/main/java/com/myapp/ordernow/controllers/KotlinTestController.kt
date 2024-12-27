package com.myapp.ordernow.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinTestController {
    @GetMapping("/test/kotlin")
    fun test(): String {
        return "Hello from Kotlin"
    }
}