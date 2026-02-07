package com.cache.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.cache.service.BalanceService;
@RestController
@RequestMapping("/balance")
public class BalanceController {
@Autowired
private BalanceService service;
@GetMapping("/{id}")
public double getBalance(@PathVariable Long id){
return service.getBalance(id);
}
}