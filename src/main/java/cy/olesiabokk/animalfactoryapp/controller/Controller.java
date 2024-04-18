package cy.olesiabokk.animalfactoryapp.controller;

import cy.olesiabokk.animalfactoryapp.entity.Cat;

import java.util.ArrayList;

public interface Controller {
    ArrayList<Cat> requestCatList();

    ArrayList<Cat> requestCatsByName();

    ArrayList<Cat> requestCatsByAge();

    ArrayList<Cat> requestCatsByWeight();

    ArrayList<Cat> requestCatsById();

    ArrayList<Cat> requestCatsByColor();
}