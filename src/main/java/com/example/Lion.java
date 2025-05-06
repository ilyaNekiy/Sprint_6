package com.example;

import java.util.List;

public class Lion {

    private final Feline feline;
    boolean hasMane;
    //Конструктор с параметром в который уже передается обьект класса Feline (Иньекция зависимостей).
    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    //Поскольку применяем инъекцию зависимостей
    //Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
