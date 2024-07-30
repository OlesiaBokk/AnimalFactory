package cy.olesiabokk.animalfactoryapp.service;

import cy.olesiabokk.animalfactoryapp.entity.Cat;
import cy.olesiabokk.animalfactoryapp.entity.util.Randomizer;

import java.util.ArrayList;

public class CatCreator {

    public Cat createCat() {
        Cat cat = null;
        Randomizer randomizer = new Randomizer();

        switch (randomizer.getRandomNumColor()) {
            case WHITE:
                cat = new Cat(randomizer.getRandomCatName().toString(), randomizer.getRandomCatAge(), randomizer.getRandomCatWeight(), "White");
                break;
            case BLACK:
                cat = new Cat(randomizer.getRandomCatName().toString(), randomizer.getRandomCatAge(), randomizer.getRandomCatWeight(), "Black");
                break;
            case GINGER:
                cat = new Cat(randomizer.getRandomCatName().toString(), randomizer.getRandomCatAge(), randomizer.getRandomCatWeight(), "Ginger");
                break;
            case SMOKY:
                cat = new Cat(randomizer.getRandomCatName().toString(), randomizer.getRandomCatAge(), randomizer.getRandomCatWeight(), "Smoky");
        }
        return cat;
    }

    public ArrayList<Cat> createCatList() {
        ArrayList<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cats.add(createCat());
        }
        return cats;
    }
}