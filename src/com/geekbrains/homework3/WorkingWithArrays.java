package com.geekbrains.homework3;

import java.util.ArrayList;
import java.util.Random;

public class WorkingWithArrays {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i ++){
            numbers.add(random.nextInt(0,5));
        }
        System.out.println(numbers);
        int min = numbers.get(0);
        int max = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if(numbers.get(i) < min) {
                min = numbers.get(i);
            }
            if(numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        double sum = 0;
        for(int el: numbers){
            sum += el;
        }
        double average = sum / numbers.size();

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее арифметическое: " + average);



    }

}
