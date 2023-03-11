package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void testSetName(){
        Cat cat = new Cat(null, null, null);
        String expected = "Tom";

        cat.setName(expected);

        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSpeak(){
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";

        String actual = cat.speak();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void setBirthDate(){
        Cat cat = new Cat(null, null, null);
        Date expected = new Date(2001, 7, 8);

        cat.setBirthDate(expected);

        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEatFood(){
        Cat cat = new Cat(null, null, null);
        int expected = 1;
        cat.eat(new Food());
        int actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetID(){
        Cat expected = AnimalFactory.createCat("adam", new Date(2001, 6, 7));
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void animalInheritance(){
        Cat cat = new Cat(null, null, null);
        boolean expected = true;
        boolean actual = cat instanceof Animal;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritance(){
        Cat cat = new Cat(null, null, null);
        boolean expected = true;
        boolean actual = cat instanceof Mammal;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
