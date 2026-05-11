import java.util.Scanner;

public class SineSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double degree = sc.nextDouble();

        double x = degree * Math.PI / 180.0;   // convert degree to radian

        double sum = x;
        double term = x;
        int n = 1;

        while (true) {
            double previousTerm = term;

            term = term * (-1) * x * x / ((2 * n) * (2 * n + 1));
            sum += term;

            if (Math.abs(Math.abs(previousTerm) - Math.abs(term)) < 1e-5) {
                break;
            }

            n++;
        }

        System.out.println("sin(" + degree + ") = " + sum);

        sc.close();
    }
}
