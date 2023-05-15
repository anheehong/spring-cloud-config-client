package com.cloud.config.client.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.RestController


@RestController
class SimpleController(
    @Value("\${example.name}")
    val name: String? = null,
    @Value("\${example.type}")
    val type: String? = null
){
    @GetMapping("")
    fun simple(): String {
        return "name : $name, type: $type"
    }

}