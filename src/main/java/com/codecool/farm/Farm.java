package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    List<Animal> animals = new ArrayList<>();

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        for (Animal a : animals) {
            a.feed();
        }
    }

    public void butcher(Butcher butcher) {
        for (int i = 0; i < animals.size(); i++) {
            if (butcher.canButcher(animals.get(i))) {
                animals.remove(i);
                i--;
            }
        }
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Animal a : animals) {
            result.add("There is a " + a.getSize() + " sized " +
                                       a.getClass().getSimpleName().toLowerCase() + " in the farm.");
        }
        return result;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
