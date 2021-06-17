package trabalho3;

public class Circulo implements Poligono
{
    private double raio;
    public Circulo()
    {
        Circulo circulo = new Circulo();
        this.raio = 1;
    }
    public Circulo(double raio)
    {
        Circulo circulo = new Circulo();
        this.raio = raio;
    }
    public double calculaArea()
    {
        return 3.14 * (raio * raio);
    }
    public double calculaPerimetro()
    {
        return 2 * 3.14 * raio;
    }
}
