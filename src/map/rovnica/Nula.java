package map.rovnica;

public class Nula extends Exception
{
    int hodnota;
    public Nula(int c)
    {
        hodnota=c;
    }
    void sprava()
    {
        System.out.println("Nesmie to byt nula!");
    }
}
