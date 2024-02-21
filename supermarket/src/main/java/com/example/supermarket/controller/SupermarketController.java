package com.example.supermarket.controller;


import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.supermarket.model.Supermarket;
import com.example.supermarket.service.SupermarketService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class SupermarketController {
@Autowired
SupermarketService supermarketService;
    @PostMapping("/addsuper")
    public Supermarket addSupermarket(@RequestBody Supermarket supermarket) {
        
        return supermarketService.addSupermarket(supermarket);
    }
    
    @GetMapping("/getsuper")
    public List<Supermarket> getSupermarkets() {
        return supermarketService.getSupermarkets();
    }
    
    @GetMapping("/getsuper/{userId}")
    public Optional<Supermarket> getSupermarketById(@PathVariable Long userId) {
        return supermarketService.getSupermarketById(userId);
    }
    @PutMapping("/putsuper/{userId}")
    public Supermarket editSupermarket(@PathVariable Long userId,@RequestBody Supermarket supermarket)
    {
        return supermarketService.editSupermarket(userId, supermarket);
    }
    @DeleteMapping("/delsuper/{userId}")
    public void deluser(@PathVariable Long userId)
    {
        supermarketService.deluser(userId);
    }
}