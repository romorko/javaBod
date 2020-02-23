package map.Test;

import map.rovnica.Kvadraticka;
import map.rovnica.Linearna;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearnaTest
{

    private Linearna prvaLn;
    private Kvadraticka prvaKv;
    private Kvadraticka druhaKv;
    private Kvadraticka tretiaKv;
    private float []maByt;

    @BeforeEach
    void setUp()
    {
        prvaLn = new Linearna(1,1);
        prvaKv = new Kvadraticka(1,-4,4);
        druhaKv = new Kvadraticka(1,-5,6);
        tretiaKv = new Kvadraticka(1,2,3);
        maByt = new float[]{2,3};
    }

    @Test
    void getKorene()
    {
        assertEquals(prvaLn.getKorene()[0], -1);
        assertEquals(prvaKv.getKorene()[0], 2);
        assertArrayEquals(druhaKv.getKorene(),maByt);
        assertEquals(tretiaKv.getKorene().length,0);

    }
}