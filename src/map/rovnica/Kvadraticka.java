package map.rovnica;

import static java.lang.StrictMath.sqrt;

public class Kvadraticka extends Rovnica
{
    private int koefC;

    public Kvadraticka(int a, int b, int c)
    {
        koefA=nieNula(a);
        koefB=b;
        koefC=c;
    }

    Kvadraticka(int a)
    {
        koefA=nieNula(a);
        koefB=koefC=a;
    }

    Kvadraticka()
    {
        koefA=getInt(false,"Zadaj koeficient a:");
        koefB=getInt(true,"Zadaj koeficient b:");
        koefC=getInt(true,"Zadaj koeficient c:");
    }

    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%dx^2 %+dx %+d = 0\n",koefA,koefB,koefC);
    }

    @Override
    protected float[] getKorene()
    {
        float d=koefB*koefB-4*koefA*koefC;
        float[] k;
        if(d>0)
        {
            k= new float[2];
            k[0]= (float)(-koefB-sqrt(d))/(2*koefA);
            k[1]= (float)(-koefB+sqrt(d))/(2*koefA);
        }
        else if(d==0)
        {
            k= new float[1];
            k[0]=-koefB/(2*koefA);
        }
        else
        {
            k= new float[0];
        }
        return k;
    }

    @Override
    protected void vypisKorene()
    {
        switch (getKorene().length)
        {
            case 0:
                System.out.println("Rovnica nema realny koren!\n");
                break;
            case 1:
                System.out.printf("Rovnica ma jeden realny koren: x = %.2f\n",getKorene()[0]);
                break;
            default:
                System.out.printf("Rovnica ma dva realne korene: x1 = %.2f a x2 = %.2f\n",getKorene()[0],getKorene()[1]);
        }
    }
}
