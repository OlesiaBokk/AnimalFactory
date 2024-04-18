package cy.olesiabokk.animalfactoryapp.service;

import java.util.ArrayList;
import java.util.Comparator;

public class QuickSort<T> {

    public ArrayList<T> sort(ArrayList<T> arrayList, Comparator<T> comparator) {
        quickSort(arrayList, 0, arrayList.size() - 1, comparator);
        return arrayList;
    }

    private void quickSort(ArrayList<T> arrayList, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int divideIndex = partition(arrayList, low, high, comparator);
            quickSort(arrayList, low, divideIndex - 1, comparator);
            quickSort(arrayList, divideIndex, high, comparator);
        }
    }

    private void swap(ArrayList<T> arrayList, int index1, int index2) {
        T tmp = arrayList.get(index1);
        arrayList.set(index1, arrayList.get(index2));
        arrayList.set(index2, tmp);
    }

    private int partition(ArrayList<T> arrayList, int low, int high, Comparator<T> comparator) {
        int leftIndex = low;
        int rightIndex = high;

        T pivot = arrayList.get(low + (high - low) / 2);
        while (leftIndex <= rightIndex) {
            while (comparator.compare(arrayList.get(leftIndex), pivot) < 0) {
                leftIndex++;
            }
            while (comparator.compare(arrayList.get(rightIndex), pivot) > 0) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arrayList, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}