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
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testAnimalCreateDog(){
        Dog expected = AnimalFactory.createDog("Jimmy", new Date(2000, 1, 2));
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAnimalCreateCat(){
        Cat expected = AnimalFactory.createCat("Andrew", new Date(1964, 1, 8));
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected, actual);
    }

}
