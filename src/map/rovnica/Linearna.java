package map.rovnica;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Linearna extends Rovnica
{


    private int koefA;
    private int koefB;

    public Linearna(int k1, int k2)
    {
        this.koefA=nieNula(k1);
        koefB=k2;
    }

    public Linearna(int koef)
    {
        koefA=koefB=koef;
    }

    public Linearna()
    {
        System.out.println("Zadaj koeficient A:");
        koefA= getInt(false);
        System.out.println("Zadaj koeficient B:");
        koefB= getInt(true);

    }

    @Override
    protected void vypisRovnicu()
    {

    }

    @Override
    protected float[] getKorene()
    {
        return new float[0];
    }
}
