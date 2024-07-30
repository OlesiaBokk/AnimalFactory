package cy.olesiabokk.animalfactoryapp.factory;

import cy.olesiabokk.animalfactoryapp.entity.Cat;
import cy.olesiabokk.animalfactoryapp.entity.util.Randomizer;

import java.util.ArrayList;

public class CatFactory {
    private static CatFactory instance;
    private final ArrayList<Cat> cats;

    private CatFactory() {
        this.cats = createCatList();
    }

    public static CatFactory getInstance() {
        if (instance == null) {
            instance = new CatFactory();
        }
        return instance;
    }

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

    public ArrayList<Cat> getCatList() {
        return new ArrayList<>(cats);
    }
}