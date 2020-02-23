package map.rovnica;

public class Linearna extends Rovnica
{
    public Linearna(int k1, int k2)
    {
        this.koefA=nieNula(k1);
        koefB=k2;
    }

    public Linearna(int koef)
    {
        //this(koef,koef);
        koefA= nieNula(koef);
        koefB=koef;
    }

    public Linearna()
    {
        koefA= getInt(false,"Zadaj koeficient A:");
        koefB= getInt(true,"Zadaj koeficient B:");
    }

    public String toString()
    {
        return koefA+"x"+((koefB>0)?" + ":" - ")+koefB+" = 0";
    }

    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%dx%+d = 0\n",koefA,koefB);
    }

    @Override
    public float[] getKorene()
    {
        float[] k=new float[1];
        try
        {
            k[0]=-koefB/(float)koefA;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Zaregistrovan0 delenie nulou!");
            k[0]=0;
            return k;
        }
        return k;
    }

    @Override
    protected void vypisKorene()
    {
        System.out.printf("Koren je %.2f\n",getKorene()[0]);
    }
}
