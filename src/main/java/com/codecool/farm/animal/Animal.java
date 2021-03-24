package com.codecool.farm.animal;

public abstract class Animal {

    int size = 0;

    public Animal() { }

    public abstract void feed();

    public int getSize() {
        return size;
    }
}
