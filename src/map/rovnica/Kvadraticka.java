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
        System.out.printf("%dx^2%+dx%+d = 0",koefA,koefB,koefC);
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
}
