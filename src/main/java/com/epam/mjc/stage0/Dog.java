package com.epam.mjc.stage0;

public class Dog extends Animal{
    public Dog() {
        super();
    }

    Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
        color = "brown";
        numberOfPaws = 4;
        hasFur = true;
    }

    @Override
    public String getDescription() {
        String myStr;
        myStr = "This animal is mostly brown. It has 4 paws and a fur.";
        return myStr;
    }
}
