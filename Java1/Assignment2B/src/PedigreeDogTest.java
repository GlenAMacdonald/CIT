/*
Author: Glen Macdonald
Date: 25-Feb-2023
Description:
PedigreeDogTest runs two tests -
    Test1: testGetDogAttributes, creates a dog and ensures each of the get methods returns the right data.
    Test2: testToString, creates a pedigree dog and ensures the returned string is of a specific format.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedigreeDogTest {

    @Test
    public void testConstructor(){
        PedigreeDog Max = new PedigreeDog("Max","Schnauzer",103,'F',10000.01);
        assertEquals("Max",Max.getName());
        assertEquals("Schnauzer",Max.getBreed());
        assertEquals(103,Max.getAge());
        assertEquals('F',Max.getGender());
        assertEquals(10000.01,Max.getPrice());
    }

    @Test
    public void testToString(){
        PedigreeDog ruby = new PedigreeDog("ruby", "Shitzu", 12,'M',12.20);
        assertEquals("ruby, Shitzu, 12, M, $12.20",ruby.toString());
    }
}
