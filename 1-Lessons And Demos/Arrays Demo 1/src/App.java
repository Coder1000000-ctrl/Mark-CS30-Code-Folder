public class App {
    public static void main(String[] args) throws Exception {
        // Declare the array
        //int[] scores = null;
        //String[] names = null;

        // Create or Initialize Array
        //scores = new int[10];
        //names = new String[10];

        // Assign Values of Array
         // List of data (solution set)
        String[]names = {"wolf", "Sutter", "Cook", "fox", "golden"};
        int[] scores = {9000,7001,1337,2048,4096};

        // Individual posistions
        names[0] = "wolf";
        scores[0] = 9000;
        //Array Length Property
        System.out.println("scores length is " + names.length);

        //Outputting or Accessing Arrays
        for (int i=0;i<names.length;i++) {
            System.out.println(i + names[i] + " " + scores[i]);
        }
        //Output in reverse order
        for (int i = names.length-1; i >=0;i--) {
            System.out.println(i + names[i] + " " + scores[i]);
        }
        //find the sum of the array
        int sum = 0;
        for (int i = 0; i <scores.length; i++) {
            sum = sum + scores[i];

        }

       System.out.println(sum);

        // count elements of an array (eg.even numbers)
        int count = 0;
        for ( int i = 0; i< scores.length; i++) {
            if (scores[i] % 2 == 0){
                count++;
            }


        }
        System.out.println(count);
       
    }
}
