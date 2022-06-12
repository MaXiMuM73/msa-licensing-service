package com.max.licensingservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "License", description = "License API")
@RestController
public class LicenseController {

    @Operation(description = "Тестовый метод")
    @GetMapping("test")
    public String test() {
        return "Test";
    }
}
