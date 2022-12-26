package lab6java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Bouquet {

    public static void printFlowerParametrs(Flower f){
        System.out.println(f.toString());
    }

    public static void outputArray(Flower[] bouquet){
        for (Flower flower : bouquet) {
            printFlowerParametrs(flower);
        }
    }

    public static Flower searchByFlowerLength(Flower [] bouquet, double length1,double length2){
        Flower result = bouquet[0];
        for (Flower flower : bouquet) {
            if (flower.getLength() >= length1 && flower.getLength() <= length2)
                result = flower;
        }
        return result;
    }

    public static void totalBouquetPrice(Flower [] bouquet) {
        int totalPrice = 0;
        for (Flower flower : bouquet) {
            totalPrice += flower.getPrice();
        }
        System.out.println("Total bouquet price: " + totalPrice + " UAH");
    }

    public static void sortByFreshness(Flower[] bouquet) {
        System.out.println("Bouquet is sorted by decreasing of freshness:");
        Arrays.sort(bouquet, Comparator.comparingInt(Flower::getFreshness).reversed());
    }

    public static void main(String[] args) {

        Flower[] bouquet = new Flower[7];
        bouquet[0] = new Rose(3,50.5,80);
        bouquet[1] = new Rose(4,49.6,80);
        bouquet[2] = new Rose(3,48.0,80);
        bouquet[3] = new Tulip(2,28.3,110);
        bouquet[4] = new Tulip(2,27.9,100);
        bouquet[5] = new Lily(1,15.4,50);
        bouquet[6] = new Rose();

        System.out.println("Bouquet consist of:");
        outputArray(bouquet);
        System.out.println();

        sortByFreshness(bouquet);
        outputArray(bouquet);
        System.out.println();

        System.out.println("Searched Flower by length:");
        printFlowerParametrs(searchByFlowerLength(bouquet, 27.0, 28.0));
        System.out.println();

        totalBouquetPrice(bouquet);
    }
}
