package com.example.OrderStock.repository;


import com.example.OrderStock.entity.StockEntity;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<StockEntity, Long> {

    Iterable<StockEntity> findByItem(String item);
    //StockEntity findByItem(String item);
}