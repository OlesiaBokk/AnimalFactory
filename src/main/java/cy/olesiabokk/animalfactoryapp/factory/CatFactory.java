package cy.olesiabokk.animalfactoryapp.factory;

import cy.olesiabokk.animalfactoryapp.entity.Cat;
import cy.olesiabokk.animalfactoryapp.service.CatCreator;

import java.util.ArrayList;

public class CatFactory {
    private static CatFactory instance;
    private final ArrayList<Cat> cats;

    private CatFactory(CatCreator catCreator) {
        this.cats = catCreator.createCatList();
    }

    public static CatFactory getInstance(CatCreator catCreator) {
        if (instance == null) {
            instance = new CatFactory(catCreator);
        }
        return instance;
    }

    public ArrayList<Cat> getCatList() {
        return new ArrayList<>(cats);
    }
}