package cy.olesiabokk.animalfactoryapp.service.interfaces;

import cy.olesiabokk.animalfactoryapp.entity.Cat;

import java.util.ArrayList;

public interface SortService {
    ArrayList<Cat> sortById(ArrayList<Cat> arrayList);

    ArrayList<Cat> sortByName(ArrayList<Cat> arrayList);

    ArrayList<Cat> sortByAge(ArrayList<Cat> arrayList);

    ArrayList<Cat> sortByWeight(ArrayList<Cat> arrayList);

    ArrayList<Cat> sortByColor(ArrayList<Cat> arrayList);
}