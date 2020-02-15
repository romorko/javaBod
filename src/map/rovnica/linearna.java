package map.rovnica;
import java.util.Scanner;

public class linearna
{
    private int koefA=0;
    private int koefB=0;
    private float koren;
    public static Scanner sc= new Scanner(System.in);

    public linearna(int k1,int k2)
    {
        this.koefA=k1;
        koefB=k2;
    }

    public linearna(int koef)
    {
        koefA=koefB=koef;
    }

    public linearna()
    {
        System.out.println("Zadaj koeficient A:");
        koefA= sc.nextInt();
    }
}
