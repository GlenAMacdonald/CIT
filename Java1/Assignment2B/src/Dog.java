/*
Author: Glen Macdonald
Date: 25-Feb-2023
Description:
Dog Class holds a name, age, gender and price which are accessable via get-methods. Representing a dog.
Dog Class age and price are settable via set-methods.
 */

public class Dog {
    private String name;
    private int age;
    private char gender;
    private double price;

    Dog(String name, int age, char gender, Double price){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }

    public String getName() {return this.name;}

    public int getAge() { return this.age; }

    public void setAge(int age) { this.age = age; }

    public char getGender() { return this.gender; }

    public double getPrice() { return this.price; }

    public void setPrice(double price) { this.price = price; }

    public String toString(){
        return this.name + ", " + this.age + ", " + this.gender + ", $" + String.format("%.2f", this.price);
    }
}