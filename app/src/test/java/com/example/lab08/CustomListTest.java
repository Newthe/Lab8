package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCityRemoves() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testDeleteCityThrowsIfMissing() {
        CustomList list = new CustomList();
        City vancouver = new City("Vancouver", "BC");

        assertThrows(IllegalArgumentException.class, () -> {
            list.deleteCity(vancouver);
        });
    }
}
