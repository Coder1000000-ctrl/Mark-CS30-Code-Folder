public class Farenheit {

    private double celsius;


    public void calculate(double input){
        celsius = (input-32) * ((double)5/9);
    }

    public void output(double input){
        System.out.println(input + "°f is " + celsius + "°c.");
    }

}
