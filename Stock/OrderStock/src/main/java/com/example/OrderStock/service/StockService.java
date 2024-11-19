package com.example.OrderStock.service;

import com.example.OrderStock.bo.CreateStockRequest;
import com.example.OrderStock.bo.UpdateStockResponse;

public interface StockService {
        UpdateStockResponse updateStock(CreateStockRequest request);
        void addItems(CreateStockRequest stock);
    }
