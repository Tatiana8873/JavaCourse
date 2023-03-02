package com.geekbrains.homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class EvenNumbers {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i ++){
            numbers.add(random.nextInt(0,100));
        }
        System.out.println("Список целых чисел: " + numbers);
        System.out.println("Отсортированный список: " + myArray(numbers));
    }
    public static ArrayList myArray(ArrayList<Integer> numbers){
        ArrayList<Integer> newNumbers = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i ++){
            if(numbers.get(i) % 2 != 0){
                newNumbers.add(numbers.get(i));
            }
        }
        return newNumbers;
    }

}
