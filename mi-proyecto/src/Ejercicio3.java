import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        final double iva = 1.21;

        Scanner sn = new Scanner(System.in);

        System.out.println("Digite el precio del producto");
        double precio = sn.nextDouble();

        System.out.println("El precio total es: "+ precio*iva);

        System.out.println("el iva es:" + (iva-1) );

        sn.close();
    }
}
