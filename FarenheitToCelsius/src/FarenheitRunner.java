import java.util.Scanner;

public class FarenheitRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        double farenheit;
        Farenheit converter = new Farenheit();

        System.out.print("What temperature in farenheit do you want to convert to celsius: ");
        farenheit = keys.nextDouble();
        converter. calculate(farenheit);
        converter. output(farenheit);
    }
}
