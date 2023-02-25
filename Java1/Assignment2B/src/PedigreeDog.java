/*
Author: Glen Macdonald
Date: 25-Feb-2023
Description:
PedigreeDog Class inherits from Dog Class, extending it to contain attribute 'Breed' which is gettable.
 */

public class PedigreeDog extends Dog{
    private String Breed;

    PedigreeDog(String name, String Breed, int age, char gender, Double price) {
        super(name, age, gender, price);
        this.Breed = Breed;
    }

    public String getBreed(){ return this.Breed; }

    public String toString(){
        return this.getName() + ", " + this.getBreed() + ", " + this.getAge() + ", " + this.getGender() + ", $" + String.format("%.2f", this.getPrice());
    }
}
