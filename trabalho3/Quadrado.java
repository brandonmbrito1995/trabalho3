package trabalho3;

public class Quadrado extends Quadrilateros implements Poligono
{
    private double lado;
    public Quadrado()
    {
        Quadrado quadrado = new Quadrado();
        this.lado = lado;
    }
    public double calculaArea()
    {
        return lado * lado;
    }
    public double calculaPerimetro()
    {
        return 4 * lado;
    }
}
