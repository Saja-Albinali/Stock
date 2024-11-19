package com.example.Account.bo;


import java.util.List;

public class CreateAccountResponse {
    private List<AccountResponse> stocks;


    public List<AccountResponse> getStocks() {
        return stocks;
    }

    public void setStocks(List<AccountResponse> stocks) {
        this.stocks = stocks;
    }
}
