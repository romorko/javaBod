package map.rovnica;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        Linearna Prva = new Linearna(3,6);
        Linearna Druha = new Linearna();
        Linearna Tretia = new Linearna(4);
        Prva.vypisRovnicu();
        Druha.vypisRovnicu();
        Tretia.vypisRovnicu();
        System.out.println("koren je:"+ Arrays.toString(Prva.getKorene()));
        System.out.printf("Koren je %s\n",Druha.getKorene()[0]);
        System.out.printf("Koren je %s",Tretia.getKorene()[0]);

	// write your code here
    }
}
