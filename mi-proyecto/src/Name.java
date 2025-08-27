import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String name = sn.nextLine();

        System.out.print( "Hola "+ name );

    }
}
