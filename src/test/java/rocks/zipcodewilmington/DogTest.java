package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.*;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void testSpeak(){
        Dog dog = new Dog(null, null ,null);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSetBirthDate(){
        Dog dog = new Dog(null, null, null);
        Date expected = new Date(2001, 8,1);
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testEatFood(){
        Dog dog = new Dog(null ,null, null);
        Integer expected = 1;
        dog.eat(new Food());
        Integer actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetID(){
        Dog expected = AnimalFactory.createDog("Dino", new Date(2005, 6, 8));
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAnimalInheritance(){
        Dog dog = new Dog(null, null, null);
        boolean expected = true;
        boolean actual = dog instanceof Animal;
        Assert.assertEquals(expected, actual);
    }

}
