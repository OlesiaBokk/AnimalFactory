package cy.olesiabokk.animalfactoryapp.service;

import cy.olesiabokk.animalfactoryapp.entity.Cat;
import cy.olesiabokk.animalfactoryapp.entity.Factory;
import cy.olesiabokk.animalfactoryapp.service.interfaces.FactoryService;
import cy.olesiabokk.animalfactoryapp.service.interfaces.SortService;

import java.util.ArrayList;

public class FactoryServiceImpl implements FactoryService {
    private final Factory factory;
    private SortService sortService;

    public FactoryServiceImpl(CatCreator catCreator) {
        this.factory = Factory.getInstance(catCreator);
        this.sortService = new SortServiceImpl();
    }

    @Override
    public ArrayList<Cat> getCatsList() {
        return factory.getCatsList();
    }

    @Override
    public ArrayList<Cat> getCatsByName() {
        ArrayList<Cat> cats = getCatsList();
        ArrayList<Cat> sortedCats = sortService.sortByName(cats);
        return sortedCats;
    }

    @Override
    public ArrayList<Cat> getCatsByAge() {
        ArrayList<Cat> cats = getCatsList();
        ArrayList<Cat> sortedCats = sortService.sortByAge(cats);
        return sortedCats;
    }

    @Override
    public ArrayList<Cat> getCatsByWeight() {
        ArrayList<Cat> cats = getCatsList();
        ArrayList<Cat> sortedCats = sortService.sortByWeight(cats);
        return sortedCats;
    }

    @Override
    public ArrayList<Cat> getCatsByColorAlphabet() {
        ArrayList<Cat> cats = getCatsList();
        ArrayList<Cat> sortedCats = sortService.sortByColor(cats);
        return sortedCats;
    }

    @Override
    public ArrayList<Cat> getCatsById() {
        ArrayList<Cat> cats = getCatsList();
        ArrayList<Cat> sortedCats = sortService.sortById(cats);
        return sortedCats;
    }
}