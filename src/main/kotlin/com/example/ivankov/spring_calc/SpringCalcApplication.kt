package com.example.ivankov.spring_calc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCalcApplication

fun main(args: Array<String>) {
	runApplication<SpringCalcApplication>(*args)
}
