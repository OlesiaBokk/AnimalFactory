package cy.olesiabokk.animalfactoryapp.entity;

import cy.olesiabokk.animalfactoryapp.service.CatCreator;

import java.util.ArrayList;

public class Factory {
    private static Factory instance;
    private final ArrayList<Cat> cats;

    private Factory(CatCreator catCreator) {
        this.cats = catCreator.createCatsList();
    }

    public static Factory getInstance(CatCreator catCreator) {
        if (instance == null) {
            instance = new Factory(catCreator);
        }
        return instance;
    }

    public ArrayList<Cat> getCatsList() {
        return new ArrayList<>(cats);
    }
}