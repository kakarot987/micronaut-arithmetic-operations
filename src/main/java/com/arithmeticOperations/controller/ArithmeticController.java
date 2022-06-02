package com.arithmeticOperations.controller;

import com.arithmeticOperations.service.ArithmeticService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/arithmetic")
public class ArithmeticController {

    @Inject
    private ArithmeticService arithmeticService;

    @Get("/add/{number1}/{number2}")
    public float getAddition(float number1, float number2) {
        return arithmeticService.add(number1, number2);
    }

    @Get("/subtract/{number1}/{number2}")
    public float getDifference(float number1, float number2) {
        return arithmeticService.subtract(number1, number2);
    }

    @Get("/multiply/{number1}/{number2}")
    public float getMultiplication(float number1, float number2) {
        return arithmeticService.multiply(number1, number2);
    }

    @Get("/divide/{number1}/{number2}")
    public float getDivision(float number1, float number2) {
        return arithmeticService.divide(number1, number2);
    }
}