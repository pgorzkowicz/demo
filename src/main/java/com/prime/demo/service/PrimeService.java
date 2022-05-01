package com.prime.demo.service;

import com.prime.demo.model.PrimeResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class PrimeService {

    public PrimeResult getPrime(int limit) {
        return calculatePrime(limit);
    }

    /**
     * Return list with limit int value
     * @param limit
     * @return
     */
    private PrimeResult calculatePrime(int limit) {
        Stream<Integer> integers = IntStream.rangeClosed(0, limit).boxed();
        List<Integer> result = integers
                .filter(this::isPrime)
                .collect(Collectors.toList());

        return new PrimeResult(limit, result);
    }

    /**
     * Check digit is prime
     * @param number
     * @return
     */
    private boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

}
