package com.geekbrains.homework1;

import java.util.Scanner;

public class Сalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int num1 = getInt();
       int num2 = getInt();
       char operation = getOperation();
       int result = calc(num1, num2, operation);
       System.out.print("Результат операции: " + result);

    }

    public static int getInt(){
        System.out.print("Введите число: ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }else{
            System.out.println("Вы допустили ошибку, попробуйте ещё раз!: ");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation(){
        System.out.print("Введите операцию: ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }else{
            System.out.println("Вы допустили ошибку, повторите ввод.: ");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch(operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ввод был не верный, повторите ещё раз. ");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

}
