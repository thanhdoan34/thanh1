package com.example.exam.api;

import com.example.exam.entity.Stock;
import com.example.exam.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/stocks")
public class StockAPI {
    private final StockRepository stockRepository;

    @Autowired
    public StockAPI(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @GetMapping
    public ResponseEntity<List<Stock>> getStocks() {
        return ResponseEntity.ok(stockRepository.findAll());
    }

    @GetMapping(path = "/{symbol}/price")
    public ResponseEntity<Double> getStockPrice(@PathVariable String symbol) {
        Stock stock = stockRepository.findBySymbol(symbol);

        if (stock == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(stock.getPrice());

    }

    @GetMapping(path = "/{symbol}/name")
    public ResponseEntity<String> getStockName(@PathVariable String symbol) {
        Stock stock = stockRepository.findBySymbol(symbol);

        if (stock == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(stock.getName());

    }

}
