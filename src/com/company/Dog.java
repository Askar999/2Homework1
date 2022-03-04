package com.company;

public class Dog extends Mammals {
    private Massa massa;
    private Enum anEnum;

    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    public Massa getMassa() {
        return massa;
    }

    public Enum getAnEnum() {
        return anEnum;
    }
}
