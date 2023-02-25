/*
Author: Glen Macdonald
Date: 25-Feb-2023
Description:
DogTest runs three tests -
    Test1: testGetDogAttributes, creates a dog and ensures each of the get methods returns the right data.
    Test2: testSetDogAttributes, creates a dog, sets attributes to different values and ensures the get method returns the right data.
    Test3: testToString, creates a dog and ensures the returned string is of a specific format.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DogTest {
    @Test
    public void testGetDogAttributes() {
        Dog ruby = new Dog("ruby",12,'M',12.20);
        assertEquals("ruby",ruby.getName());
        assertEquals(12,ruby.getAge());
        assertEquals('M',ruby.getGender());
        assertEquals(12.20,ruby.getPrice());
    }

    @Test
    public void testSetDogAttributes(){
        Dog ruby = new Dog("ruby",12,'M',12.20);
        assertEquals(12,ruby.getAge());
        ruby.setAge(1);
        assertEquals(1,ruby.getAge());
        assertEquals(12.20,ruby.getPrice());
        ruby.setPrice(13.13);
        assertEquals(13.13,ruby.getPrice());
    }

    @Test
    public void testToString(){
        Dog ruby = new Dog("ruby",12,'M',12.20);
        assertEquals("ruby, 12, M, $12.20",ruby.toString());
    }

}