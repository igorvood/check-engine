package ru.vood.checkengin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CheckEngineApplication

fun main(args: Array<String>) {
    runApplication<CheckEngineApplication>(*args)
}
