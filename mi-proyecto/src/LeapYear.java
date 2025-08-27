import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sn =new Scanner(System.in);


        System.out.println("Digite el año");
        int leapYear = sn.nextInt();


        if ((leapYear % 4 == 0 && leapYear % 100 != 0) || (leapYear % 400 == 0)) {
            System.out.println("El año " + leapYear + " sí es bisiesto");
        } else {
            System.out.println("El año " + leapYear + " no es bisiesto");
        }

    }
}
