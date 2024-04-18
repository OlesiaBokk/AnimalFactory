package cy.olesiabokk.animalfactoryapp.service;

import cy.olesiabokk.animalfactoryapp.entity.Cat;
import cy.olesiabokk.animalfactoryapp.service.interfaces.SortService;

import java.util.ArrayList;
import java.util.Comparator;

public class SortServiceImpl implements SortService {
    private final QuickSort<Cat> catSorter = new QuickSort<>();

    @Override
    public ArrayList<Cat> sortById(ArrayList<Cat> cats) {
        Comparator<Cat> comparator = (firstCat, secondCat) -> Long.compare(firstCat.getId(), secondCat.getId());
        ArrayList<Cat> sorted = new ArrayList<>(catSorter.sort(cats, comparator));
        return sorted;
    }

    @Override
    public ArrayList<Cat> sortByName(ArrayList<Cat> cats) {
        Comparator<Cat> comparator = (firstCat, secondCat) -> String.valueOf(firstCat.getName()).compareTo(secondCat.getName());
        ArrayList<Cat> sorted = new ArrayList<>(catSorter.sort(cats, comparator));
        return sorted;
    }

    @Override
    public ArrayList<Cat> sortByAge(ArrayList<Cat> cats) {
        Comparator<Cat> comparator = (firstCat, secondCat) -> Integer.compare(firstCat.getAge(), secondCat.getAge());
        ArrayList<Cat> sorted = new ArrayList<>(catSorter.sort(cats, comparator));
        return sorted;
    }

    @Override
    public ArrayList<Cat> sortByWeight(ArrayList<Cat> cats) {
        Comparator<Cat> comparator = (firstCat, secondCat) -> Integer.compare(firstCat.getWeight(), secondCat.getWeight());
        ArrayList<Cat> sorted = new ArrayList<>(catSorter.sort(cats, comparator));
        return sorted;
    }

    @Override
    public ArrayList<Cat> sortByColor(ArrayList<Cat> cats) {
        Comparator<Cat> comparator = (firstCat, secondCat) -> String.valueOf(firstCat.getColor()).compareTo(secondCat.getColor());
        ArrayList<Cat> sorted = new ArrayList<>(catSorter.sort(cats, comparator));
        return sorted;
    }
}