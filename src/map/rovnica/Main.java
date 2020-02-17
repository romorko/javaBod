package map.rovnica;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        Linearna Prva = new Linearna(0,1);
        Prva.vypisRovnicu();
        System.out.println("koren je:"+ Arrays.toString(Prva.getKorene()));

	// write your code here
    }
}
