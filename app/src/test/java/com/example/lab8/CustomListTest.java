package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>()); return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void testHasCity() {
        CustomList list = MockCityList();
        City city = new City("Edmonton", "Alberta");
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void countCitiesTest() {
        CustomList list = MockCityList();
        assertEquals(0, list.getCount());
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(1, list.getCount());
        list.addCity(new City("Toronto", "ON"));
        assertEquals(2, list.getCount());
    }

    @Test
    public void deleteCityTest() {
        CustomList list = MockCityList();
        City city = new City("Vancouver", "BC");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }
}
