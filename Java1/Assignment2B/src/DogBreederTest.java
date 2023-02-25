/*
Author: Glen Macdonald
Date: 25-Feb-2023
Description:
DogBreederTest runs one test -
    Test1: addDogTest, creates a DogBreeder, creates a Dog and ensures the dog can be added and retrieved correctly
*/

import org.junit.jupiter.api.Test;
import java.util.Dictionary;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogBreederTest {
    @Test
    public void addDogTest(){
        DogBreeder Jim = new DogBreeder("Jim");
        assertEquals("Jim",Jim.getName());
        Dog ruby = new Dog("ruby",12,'M',12.20);
        Jim.addDog(ruby);
        Dog testDog = Jim.getDog("ruby");
        assertEquals("ruby",testDog.getName());
        assertEquals(12,testDog.getAge());
        assertEquals('M',testDog.getGender());
        assertEquals(12.20,testDog.getPrice());
    }
}
