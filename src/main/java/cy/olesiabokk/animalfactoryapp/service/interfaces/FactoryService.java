package cy.olesiabokk.animalfactoryapp.service.interfaces;

import cy.olesiabokk.animalfactoryapp.entity.Cat;

import java.util.ArrayList;

public interface FactoryService {
    ArrayList<Cat> getCatsList();

    ArrayList<Cat> getCatsByName();

    ArrayList<Cat> getCatsByAge();

    ArrayList<Cat> getCatsByWeight();

    ArrayList<Cat> getCatsByColorAlphabet();

    ArrayList<Cat> getCatsById();
}