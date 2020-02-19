package Testovanie;
import map.rovnica.Linearna;
import map.rovnica.Kvadraticka;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LinearnaTest
{
    @Test
    void getKorene()
    {
        Linearna prva = new Linearna(1, 1);
        assertEquals(prva.getKorene()[0], -1);
    }
}

class Kvadratickatest
{
    @Test
    void getKorene()
    {
        Kvadraticka prva = new Kvadraticka(1,-4,4);
        assertEquals(prva.getKorene()[0], 2);
        Kvadraticka druha = new Kvadraticka(1,-5,6);
        float maByt[] = {2,3};
        assertArrayEquals(druha.getKorene(),maByt);
        Kvadraticka tretia = new Kvadraticka(1,2,3);
        assertEquals(tretia.getKorene().length,0);
    }
}