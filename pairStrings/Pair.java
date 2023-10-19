package org.example.pairStrings;

public class Pair {
    private String first;
    private String second;

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }
    {
        System.out.println("First field init: " +first);
        System.out.println("Second field init: " +second);
        first = "one";
        second = "two";
    }
    // не понимаю как можно вывести в консоль значения полей из блока инициализации...

    public Pair() {
        System.out.println("First field: " +first);
        System.out.println("Second field: " +second);
    }

    public Pair(String first, String second) {
        this.first = first;
        this.second = second;
        System.out.println("First Field: " +first);
        System.out.println("Second Field: " +second);
    }

}
