package com.example.Account.controller;


import com.example.Account.bo.CreateAccountResponse;
import com.example.Account.bo.AccountResponse;
import com.example.Account.bo.CreateStockRequest;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/addItems")
    public void addItems(@RequestBody CreateStockRequest stock) {
        stockService.addItems(stock);
    }
    @PostMapping("/updateStock")
    public UpdateStockResponse updateStock(@RequestBody CreateStockRequest request) {
        return stockService.updateStock(request);
    }
    @GetMapping("/account")
    public AccountResponse account() {
        return new AccountResponse(stockService.getStocks());
    }

}
