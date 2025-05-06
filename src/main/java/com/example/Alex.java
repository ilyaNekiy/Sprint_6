package com.example;

import java.util.List;

public class Alex extends Lion {

    private static final String sexAlex = "Самец";

    public Alex(Feline feline) throws Exception {
        super(sexAlex, feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }
    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
