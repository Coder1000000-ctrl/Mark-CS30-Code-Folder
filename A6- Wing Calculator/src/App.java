/*Program name: Wing Calculator
Student name: Mark Tucker
Date: Sept. 18, 2024
Program Description: A calculator used the find how many wings you can buy.*/



public class App {
    public static void main(String[] args) throws Exception {
        int wings;
        double cost;
        double money;
        money = 4.75;
        cost = 0.75;
        wings = (int)(money /cost);
        System.out.println("You can afford to buy " + wings + " wings, if you have " + money + " dollars and each wing costs " + cost + " dollars.");
    }
}
