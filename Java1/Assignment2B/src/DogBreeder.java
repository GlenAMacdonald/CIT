/*
Author: Glen Macdonald
Date: 25-Feb-2023
Description:
DogBreeder Class has a string 'name' representing the breeders companies name and a Dictionary/HashTable that stores the dogs
Dog Class objects can be retrieved from DogBreeder Class using the getDog method.
Dog Class objects can be added to DogBreeder Class using the addDog method.
DogBreeder Class has report functions that lists the contained dogs.
 */

import java.util.*;

public class DogBreeder {
    private String name;
    private Map<String,Dog> dogs = new Hashtable<String, Dog>();

    DogBreeder(String name){
        this.name = name;
    }

    public String getName(){ return this.name; }

    public void addDog(Dog newDog){
        if (!this.dogs.containsKey(newDog.getName())){
            this.dogs.put(newDog.getName(),newDog);
        } else {
            System.out.println("Error Entering Doggo: There is already a dog for sale called " + newDog.getName());
        }

    }

    public void addDog(List<Dog> newDogs){
        for(Dog newDog : newDogs){
            this.addDog(newDog);
        }
    }

    public void removeDog(String dogName){this.dogs.remove(dogName);}

    public void removeDog(Dog goneDog){this.dogs.remove(goneDog.getName());}

    public Dog getDog(String dogName){return this.dogs.get(dogName);}

    public Dog getDog(Dog dog){return this.dogs.get(dog.getName());}

    public Map<String,Dog> getDogs(){return this.dogs;}

    public void reportForSale(){
        String returnString = "Report of Dogs For Sale at " + this.getName() + ':';
        for (Map.Entry<String,Dog> entry : this.dogs.entrySet()){
            returnString +=  '\n' + entry.getValue().toString();
        }
        returnString += "\nEnd of Report.\n";
        System.out.println(returnString);
    }

    public void reportTotalPrice(){
        String returnString = "Total value of Dogs for sale at " + this.getName() + " is:" + '\n' + '$';
        double returnPrice = 0;
        for (Map.Entry<String,Dog> entry : this.dogs.entrySet()){
            returnPrice +=  entry.getValue().getPrice();
        }
        returnString += String.format("%.2f", returnPrice);
        returnString += "\nEnd of Report.\n";
        System.out.println(returnString);
    }

    public void reportDogsCheaperThan(double price){
        String returnString = "List of Dogs for sale at " + this.getName() + " cheaper than $" + String.format("%.2f", price) + " is:";
        for (Map.Entry<String,Dog> entry : this.dogs.entrySet()){
            if (entry.getValue().getPrice() < price){
                returnString += '\n' + entry.getValue().toString();
            };
        }
        returnString += "\nEnd of Report.\n";
        System.out.println(returnString);
    }

    public void reportListPedigreeDogs(String breed){
        String returnString = "List of Dogs for sale at " + this.getName() + " of breed '" + breed + "' is:";
        for (Map.Entry<String,Dog> entry : this.dogs.entrySet()){
            if (entry.getValue() instanceof PedigreeDog) {
                if (((PedigreeDog) entry.getValue()).getBreed() == breed){
                    returnString += '\n' + entry.getValue().toString();
                };
            }
        }
        returnString += "\nEnd of Report.\n";
        System.out.println(returnString);
    }
}