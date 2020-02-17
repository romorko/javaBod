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
        koefA= nieNula(koef);
        koefB=koef;
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
        System.out.println(koefA+"x+"+koefB+"=0");
    }

    @Override
    protected float[] getKorene()
    {
        float[] k=new float[1];
        k[0]=-koefB/(float)koefA;
        return k;
    }
}
