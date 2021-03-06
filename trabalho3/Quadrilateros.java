package trabalho3;

public abstract class Quadrilateros implements Poligono
{
    private double lado1, lado2, lado3, lado4;
    public Quadrilateros()
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
    public double getLado1()
    {
    return lado1;
    }
    public double getLado2()
    {
    return lado2;
    }
    public double getLado3()
    {
    return lado3;
    }
    public double getLado4()
    {
    return lado4;
    }
    public double calculaPerimetro(double lado1, double lado2, double lado3,
    double lado4)
    {
        return lado1 + lado2 + lado3 + lado4;
    }

}
