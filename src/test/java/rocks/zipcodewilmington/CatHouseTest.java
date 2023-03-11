package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testAddCat(){
        Cat expected = AnimalFactory.createCat("Yugo", new Date(2001, 6, 1));
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testRemoveCat(){
        Cat tempcat = AnimalFactory.createCat("Jim", new Date(1000, 1, 14));
        CatHouse.add(tempcat);
        CatHouse.remove(tempcat);
        Integer expected = CatHouse.getNumberOfCats();
        Integer actual = 0;
        Assert.assertEquals(expected, actual);
        CatHouse.clear();


    }
    @Test
    public void testRemoveCatByID(){
        Cat tempcat = AnimalFactory.createCat("Jake", new Date(1800, 6, 3));
        CatHouse.add(tempcat);
        CatHouse.remove(tempcat.getId());
        Assert.assertEquals(0, (int) CatHouse.getNumberOfCats());
        CatHouse.clear();

    }
    @Test
    public void testGetCatByID(){
        Cat tempcat = AnimalFactory.createCat("Buddy", new Date(8092, 1, 4));
        CatHouse.add(tempcat);
        Cat expected = CatHouse.getCatById(0);
        Cat actual = tempcat;
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testGetNumberOfCats(){
        Cat cat = AnimalFactory.createCat("Kim", new Date(2000, 1, 1));
        CatHouse.add(cat);
        Integer expected = CatHouse.getNumberOfCats();
        Integer actual = 1;
        Assert.assertEquals(expected, actual);
        CatHouse.clear();

    }

}
