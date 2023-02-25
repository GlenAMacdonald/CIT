/*
Author: Glen Macdonald
Date: 25-Feb-2023
Description:
GlenTest Class runs the 17 required automated tests requested in the Assignment Description
 */

import java.util.Arrays;
import java.util.List;

public class GlenTest {
    public static void main(String[] args){
        DogBreeder Glen = new DogBreeder("Glen's Dog Breeding");
        Dog Anna = new Dog("Anna", 4, 'F', 111.11);
        PedigreeDog Barry = new PedigreeDog("Barry", "beagle", 36, 'M', 22.22);
        PedigreeDog Cindy = new PedigreeDog("Cindy", "beagle", 2, 'F', 333.00);
        Dog Darryl = new Dog("Darryl", 5, 'M', 44.00);
        PedigreeDog Elsie = new PedigreeDog("Elsie", "poodle", 10, 'F', 555.00);
        List<Dog> Dogs = Arrays.asList(Anna, Barry, Cindy, Darryl, Elsie);
        Glen.addDog(Dogs);
        Glen.reportForSale();
        Glen.reportTotalPrice();
        Glen.reportDogsCheaperThan(50.00);
        Glen.reportDogsCheaperThan(30.00);
        Glen.reportListPedigreeDogs("beagle");
        Glen.reportListPedigreeDogs("poodle");
        Glen.removeDog("Cindy");
        Glen.reportForSale();
        Glen.reportTotalPrice();
        Glen.addDog(Elsie);
    }
}
