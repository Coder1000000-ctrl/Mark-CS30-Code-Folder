public class Farenheit {

    // creates celsius
    private double celsius;


    // calculates farenheit to celsius
    public void calculate(double input){
        celsius = (input-32) * ((double)5/9);
    }

    // outputs celsius
    public void output(double input){
        System.out.println(input + "°f is " + celsius + "°c.");
    }

}
