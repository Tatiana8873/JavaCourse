package com.geekbrains.homework1;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Primes {
    public static void main(String[] args) {
        System.out.println(getAllPrimes(1000));
    }
        public static List<Integer> getAllPrimes ( int sieveSize){
            var sieve = new BitSet(sieveSize);
            sieve.set(0, sieveSize - 1, true);
            sieve.set(0, false);
            sieve.set(1, false);
            for (int i = 2; i * i < sieve.length(); i++) {
                if (sieve.get(i)) {
                    for (int j = i * i; j < sieve.length(); j += i) {
                        sieve.set(j, false);
                    }
                }
            }

            List<Integer> primes = new ArrayList<>();
            for (int i = 2; i < sieve.length(); i++) {
                if (sieve.get(i)) {
                    primes.add(i);
                }
            }
            return primes;
        }
    }

