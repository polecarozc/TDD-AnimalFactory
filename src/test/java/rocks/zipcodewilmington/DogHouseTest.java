package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testAddDog(){
        Dog expected = AnimalFactory.createDog("goerge", new Date(2003, 2, 1));
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(0);
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }
    @Test
    public void testRemoveInteger(){
        Dog tempdog = AnimalFactory.createDog("Finn", new Date(1130, 6, 4));
        DogHouse.add(tempdog);
        DogHouse.remove(tempdog.getId());
        Assert.assertEquals(0, (int) DogHouse.getNumberOfDogs());
        DogHouse.clear();
    }
    @Test
    public void testRemoveDog(){
        Dog tempdog = AnimalFactory.createDog("Jim", new Date(1000, 1, 14));
        DogHouse.add(tempdog);
        DogHouse.remove(tempdog);
        Integer expected = DogHouse.getNumberOfDogs();
        Integer actual = 0;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }
    @Test
    public void testGetDogByID(){
        Dog tempdog = AnimalFactory.createDog("Buddy", new Date(8092, 1, 4));
        DogHouse.add(tempdog);
        Dog expected = DogHouse.getDogById(0);
        Dog actual = tempdog;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }
    @Test
    public void testGetNumberOfDogs() {
        Dog Dog = AnimalFactory.createDog("Kim", new Date(2000, 1, 1));
        DogHouse.add(Dog);
        Integer expected = DogHouse.getNumberOfDogs();
        Integer actual = 1;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }
}
