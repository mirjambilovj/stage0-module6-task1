package com.epam.mjc.stage0;

public class Bird extends Animal{
    public Bird() {
        super();
    }

    Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
        color = "blue";
        numberOfPaws = 2;
        hasFur = false;
    }

    @Override
    public String getDescription() {
        String myStr;
        myStr = "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
        return myStr;
    }
}
