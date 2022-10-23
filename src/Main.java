import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a,b,c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        Triangle x = new Triangle(a, b, c);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        Triangle y = new Triangle(a, b, c);

        System.out.printf("Valor da area X: %f\n", x.area());
        System.out.printf("Valor da area Y: %f\n", y.area());
        sc.close();
    }
}