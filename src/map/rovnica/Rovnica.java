package map.rovnica;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract public class Rovnica
{
    protected  int koefA;
    protected  int koefB;

    abstract protected void vypisRovnicu();
    abstract protected float [] getKorene();
    protected int nieNula(int c)
    {
        try
        {
            if(c==0) throw new Nula(c);
        }
        catch (Nula e)
        {
            e.sprava();
            return 1;
        }
        return c;
    }
    protected int getInt(boolean ajNula)
    {
        int cislo;
        Scanner sc= new Scanner(System.in);
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
            //catch(Nula e)
            {

            }
        }
        return cislo;
    }
}
