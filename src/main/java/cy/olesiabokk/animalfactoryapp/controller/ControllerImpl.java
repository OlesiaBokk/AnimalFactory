package cy.olesiabokk.animalfactoryapp.controller;

import cy.olesiabokk.animalfactoryapp.entity.Cat;
import cy.olesiabokk.animalfactoryapp.service.interfaces.FactoryService;
import cy.olesiabokk.animalfactoryapp.view.View;

import java.util.ArrayList;

public class ControllerImpl implements Controller {
    public FactoryService factoryService;
    public View view;

    public void setViewInterface(View view) {
        this.view = view;
    }

    public void setCatFactoryService(FactoryService factoryService) {
        this.factoryService = factoryService;
    }

    @Override
    public ArrayList<Cat> requestCatList() {
        return factoryService.getCatsList();
    }

    @Override
    public ArrayList<Cat> requestCatsByName() {
        return factoryService.getCatsByName();
    }

    @Override
    public ArrayList<Cat> requestCatsByAge() {
        return factoryService.getCatsByAge();
    }

    @Override
    public ArrayList<Cat> requestCatsByWeight() {
        return factoryService.getCatsByWeight();
    }

    @Override
    public ArrayList<Cat> requestCatsById() {
        return factoryService.getCatsById();
    }

    @Override
    public ArrayList<Cat> requestCatsByColor() {
        return factoryService.getCatsByColorAlphabet();
    }
}