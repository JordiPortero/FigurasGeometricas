/**
 * Created by professor on 14/06/2016.
 */
public class Triangulo extends FiguraGeometrica {
    private double base; //private hace que no se pueda acceder externamente
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo (double base, double altura, double lado1, double lado2, long id) {
        super (id); //llamamos al constructor de figura geométrica
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calculaArea()
    {
        return (base*altura)/2;
    }


    public double calculaPerimetro()
    {
        return (lado1+lado2);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "id=" + id +
                ", base=" + base +
                ", altura=" + altura +
                ", lado1=" + lado1 +
                ", lado2=" + lado2 +
                "}";
    }

}







