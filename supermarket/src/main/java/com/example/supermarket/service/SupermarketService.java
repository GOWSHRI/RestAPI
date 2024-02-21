package com.example.supermarket.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supermarket.model.Supermarket;
import com.example.supermarket.repo.SupermarketRepository;

@Service
public class SupermarketService {
@Autowired
SupermarketRepository supermarketRepo;
public Supermarket addSupermarket(Supermarket supermarket)
{
    return supermarketRepo.save(supermarket);
}

public List<Supermarket> getSupermarkets()
{
    return supermarketRepo.findAll();
}
public Optional<Supermarket> getSupermarketById(Long userId)
{
    return supermarketRepo.findById(userId);
}
public void deluser(Long userId)
{
    supermarketRepo.deleteById(userId);
}
public Supermarket editSupermarket(Long userId,Supermarket supermarket)
{
    Supermarket supermarketAvail=supermarketRepo.findById(userId).orElse(null);
    if(supermarketAvail!=null)
    {
        supermarketAvail.setUserName(supermarket.getUserName());
        supermarketAvail.setEmailAddress(supermarket.getEmailAddress());
        supermarketAvail.setPassword(supermarket.getPassword());
        supermarketAvail.setConfirmPassword(supermarket.getConfirmPassword());
        return supermarketRepo.saveAndFlush(supermarketAvail);
    }
    else
    {
        return null;
    }
}



}