package com.example.stock.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalesController {
    @GetMapping("/sales/sales-input")
    public String inputSales(Model model) {
        return "sales/salesInput";
    }
}
