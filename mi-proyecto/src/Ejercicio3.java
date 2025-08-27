import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        final double IVA = 1.21;

        Scanner sn = new Scanner(System.in);

        System.out.println("Digite el precio del producto");
        double precio = sn.nextDouble();

        System.out.printf("El precio total es $ %.2f%n", precio * IVA);

        sn.close();
    }
}
