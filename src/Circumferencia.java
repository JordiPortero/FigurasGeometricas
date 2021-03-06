import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by professor on 13/06/2016.
 */
public class Circumferencia extends FiguraGeometrica {

    private double radio;

    public Circumferencia(double radio,long id) {
        super (id);
        this.radio = radio;
    }

    public double calculaArea() {
        return (Math.PI * (Math.pow(radio, 2)));
    }

    public double calculaPerimetro() {
        return (2 * Math.PI * radio);
    }

    @Override
    public String toString() {
        return "Circumferencia{" +
                "id=" + id +
                ", radio=" + radio +
                "}";
    }




}