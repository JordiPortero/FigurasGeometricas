import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by professor on 14/06/2016.
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<FiguraGeometrica> arrayList = new ArrayList<>();
        System.out.println("Introduce el numero de  figuras geometricas para cada tipo:  ");
        int numero = sc.nextInt();


        for (int i = 0; i < numero; i++)

        {
            System.out.println("Introduce los datos de la circumferencia " + i);
            System.out.println("Introduce el radio:");
            double radio = sc.nextDouble();

            arrayList.add(new Circumferencia(radio,i));

        }
        for (int i = 0; i < numero; i++) {
            System.out.println("Introduce los datos del rectangulo " + i);
            System.out.println("Introduce la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();

            Rectangulo rectangulo = new Rectangulo(base, altura,i+numero);
            arrayList.add(rectangulo);
        }

        for (int i = 0; i < numero; i++) {
            System.out.println("Introduce los datos del triangulo " + i);
            System.out.println("Introduce la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();
            System.out.println("Introduce el lado1:");
            double lado1 = sc.nextDouble();
            System.out.println("Introduce el lado2:");
            double lado2 = sc.nextDouble();

            Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, i+numero*2);
            arrayList.add(triangulo);
        }

        FiguraGeometrica max = null; //inicializar bloque. Es null pq no está apuntando a ninguna figura geométrica
        for (FiguraGeometrica figuraGeometrica : arrayList) // recorremos las figuras que están en el arrayList
        {
            double areaActual = figuraGeometrica.calculaArea();
            double perimetro = figuraGeometrica.calculaPerimetro();
            //double area = figuraGeometrica.calculaArea();
            System.out.println("El area de la figura geometrica " + figuraGeometrica.getId() + " es = " + areaActual);
            System.out.println("El perimetro de la figura geometrica " + " es =" + perimetro);

            if (max == null)
            {
                max = figuraGeometrica;

            } else
            {

                if (areaActual > max.calculaArea())
                {

                    max = figuraGeometrica;
                }
            }


        }
        System.out.println("La figura geometrica de area maxima es: " + max);
    }
}
