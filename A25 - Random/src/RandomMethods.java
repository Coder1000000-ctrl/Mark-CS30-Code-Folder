public class RandomMethods {
    // random number generator
    public int randNumber() {
        double number = (Math.random() * 600) - 100;
        int newNumber = (int) number;
        return newNumber;
    }
    //compares two random nubmers then outputs the bigger and smaller
    public void calulateAndOutput() {
        int numberOne = randNumber();
        int numberTwo = randNumber();
        System.out.println("Here are two random numbers:");
            System.out.println(numberOne + " and " + numberTwo );
        if (numberOne > numberTwo) {
            System.out.println("The smallest is " + numberTwo);
            System.out.println("The biggest is " + numberOne);
        }
        else{
            System.out.println("The smallest is " + numberOne);
            System.out.println("The biggest is " + numberTwo);
        }
    }

}
