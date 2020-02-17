package map.rovnica;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Linearna
{
    static int getInt(boolean ajNula )
    {
        int cislo;
        while(true)
        {
            try
            {
                System.out.println("Zadaj cislo:");
                cislo = sc.nextInt();
                if (ajNula==false && cislo==0) throw new ArithmeticException();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Nebolo zadane cislo, skus znovu!");
                sc.nextLine();
            }
            catch (ArithmeticException e)
            {
                System.out.println("Nesmie byt nula!");
            }
        }
        return cislo;
    }

    private int koefA=0;
    private int koefB=0;
    private float koren;
    public static Scanner sc= new Scanner(System.in);

    public Linearna(int k1, int k2)
    {
        this.koefA=k1;
        koefB=k2;
    }

    public Linearna(int koef)
    {
        koefA=koefB=koef;
    }

    public Linearna()
    {
        System.out.println("Zadaj koeficient A:");
        koefA= sc.nextInt();
    }
}
