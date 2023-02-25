package com.geekbrains.homework2;

public class ChangeLine {
    public static void main(String[] args) {
        String word = new String("Добрый день Как дела Все хорошо");
        word = word.replaceAll("\\s+([А-ЯЁ])", ".$1");
       char point = '.';
       if (word.charAt(word.length() - 1) != point) {
           word += point;
        }

        System.out.println(word);
    }
}
