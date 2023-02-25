package com.geekbrains.homework1;

import java.util.Scanner;

public class Factorial {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = getInt();
        System.out.println(getFactorialNumbers(n));
    }
    public static int getInt(){
        System.out.println("Введите натуральное число: ");
        int n;
        if(scanner.hasNextInt()){
            n = scanner.nextInt();
        }else{
            System.out.println("Вы допустили ошибку, попробуйте ещё раз!: ");
            scanner.next();
            n = getInt();
        }
        return n;
    }
    public static int getFactorialNumbers(int n){
        int result = 1;
        for(int i = 1; i<=n; i++) {
            result *= i;
        }
        return result;
    }



}
