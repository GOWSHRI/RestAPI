package com.example.supermarket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.supermarket.model.Supermarket;

@Repository
public interface SupermarketRepository extends JpaRepository<Supermarket,Long>{
    
}
