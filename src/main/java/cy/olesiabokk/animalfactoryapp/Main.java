package cy.olesiabokk.animalfactoryapp;

import cy.olesiabokk.animalfactoryapp.controller.ControllerImpl;
import cy.olesiabokk.animalfactoryapp.service.FactoryServiceImpl;
import cy.olesiabokk.animalfactoryapp.view.ViewImpl;

public class Main {
    public static void main(String[] args) {
        ControllerImpl controllerImpl = new ControllerImpl();
        ViewImpl view = new ViewImpl(controllerImpl);
        FactoryServiceImpl factoryService = new FactoryServiceImpl();
        controllerImpl.setCatFactoryService(factoryService);
        controllerImpl.setViewInterface(view);
        view.printCatList();
        view.printCatsByName();
        view.printCatsByAge();
        view.printCatsByColor();
        view.printCatsById();
        view.printCatsByWeight();
    }
}