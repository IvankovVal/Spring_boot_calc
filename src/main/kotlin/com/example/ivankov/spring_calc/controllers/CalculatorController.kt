package com.example.ivankov.spring_calc.controllers
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class CalculatorController {
    @GetMapping("/")
    fun index(model: Model):String
    {
return "index"
    }
    @PostMapping("/calculate")
    fun calculate(
        @RequestParam num1: Double,
        @RequestParam num2: Double,
        @RequestParam operation: String,
        model: Model
    ): String
    {
        val result = when (operation) {
            "add" -> "$num1 + $num2 = ${num1 + num2}"
            "subtract" -> "$num1 - $num2 = ${num1 - num2}"
            "multiply" -> "$num1 * $num2 = ${num1 * num2}"
            "divide" -> if (num2 != 0.0) "$num1 / $num2 = ${num1 / num2}"
            else "Ошибка: деление на ноль"
            else -> "Неправильная операция"
        }
        model.addAttribute("result", result)
        model.addAttribute("num1", num1)
        model.addAttribute("num2", num2)
        return "index"
    }
}