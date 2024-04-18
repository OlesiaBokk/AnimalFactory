package cy.olesiabokk.animalfactoryapp.view;

import cy.olesiabokk.animalfactoryapp.controller.Controller;

public class ViewImpl implements View {
    private Controller controller;

    public ViewImpl(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void printCatList() {
        System.out.println("Here is the List of Cats:");
        System.out.println(controller.requestCatList());
    }

    @Override
    public void printCatsByName() {
        System.out.println("Here is the List of Cats sorted by names:");
        System.out.println(controller.requestCatsByName());
    }

    @Override
    public void printCatsByAge() {
        System.out.println("Here is the List of Cats sorted by age:");
        System.out.println(controller.requestCatsByAge());
    }

    @Override
    public void printCatsByWeight() {
        System.out.println("Here is the List of Cats sorted by weight:");
        System.out.println(controller.requestCatsByWeight());
    }

    @Override
    public void printCatsById() {
        System.out.println("Here is the List of Cats sorted by Id:");
        System.out.println(controller.requestCatsById());
    }

    @Override
    public void printCatsByColor() {
        System.out.println("Here is the List of Cats sorted by color:");
        System.out.println(controller.requestCatsByColor());
    }
}