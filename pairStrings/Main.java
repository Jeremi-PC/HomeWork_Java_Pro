package org.example.pairStrings;

public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair();
        Pair pair1 = new Pair("ONE", "TWO");
        }
    }
//First field init: null
//Second field init: null   выполняется блок инициализации
//First field: one
//Second field: two         выполняется конструктор по умолчанию
//First field init: null
//Second field init: null   снова выполняется блок инициализации
//First Field: ONE
//Second Field: TWO         выпоняется конструктор с параметрами
