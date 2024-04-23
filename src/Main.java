import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.concurrent.atomic.AtomicLong;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double taksimetre = 10;
        double km = 0;
        final double kmBasina = 2.20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Km Giriniz :");
        km = scanner.nextDouble();



        double total = TaksimetreHesap(km ,taksimetre , kmBasina);

        System.out.println("Ücretiniz : " + total);


    }

    static double TaksimetreHesap(double km,double tm , double kmB ){
        double total = 10 + (km * kmB);

        return total < 20 ? 20 : total;


    }
}