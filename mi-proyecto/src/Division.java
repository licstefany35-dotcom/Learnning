import java.util.Scanner;

public class Division {
    public static void main(String[] args) {


        Scanner sn = new Scanner(System.in);


        System.out.println("Digite el primer numero: ");
        int num1 = sn.nextInt();

        System.out.println("Digite el Segundo numero: ");
        int num2 = sn.nextInt();


        if (num1 % num2 == 0) {
            System.out.println("El "+ num1 + "si es divisible por: " +num2);
        } else {
            System.out.println("No son Divisibles");
            }
        }
    }
