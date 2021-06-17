package trabalho3;

public class Retangulo
{   private double base;
    private double altura;
    public Retangulo()
    {
        Retangulo retangulo = new Retangulo();
        this.base = base;
        this.altura = altura;
    }
    public double calculaArea(double base, double altura)
    {
        return base * altura;
    }
    public double calculaPerimetro(double base, double altura)
    {
        return (2 * base) + (2 * altura);
    }
}

