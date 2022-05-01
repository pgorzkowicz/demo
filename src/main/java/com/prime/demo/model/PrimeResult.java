package com.prime.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PrimeResult {

    private Integer limit;
    private List<Integer> primeList;

    public PrimeResult(Integer limit, List<Integer> primeList) {
        this.limit = limit;
        this.primeList = primeList;
    }
}
