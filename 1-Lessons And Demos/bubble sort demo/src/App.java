public class App {
    public static void main(String[] args) throws Exception {
        int [] numList = {5,15,3,8,9,1,20,7};
        //Printing the original list
        for (int i = 0; i<numList.length;i++){
            System.out.println(numList[i] + ", ");
        }
        System.out.println("");
        // overwriting with the sorted list
        numList = selsort(numList);
        //printing the sorted data
        System.out.println("\nThe sorted veresion is: ");
        for (int i = 0; i<numList.length;i++){
            System.out.print(numList[i] + ", ");
        }
    }


    public static int[] selsort(int[] nums){
        int n = nums.length;

        //One by one every element of the array
        for (int i = 0; i < n; i++) {
            //Find the minimum element in the array
            //Assume i is min to start
            int minIdx = i;
            for (int j = i+1; j< n; j++){
                System.out.println("J = " + nums[j] + " min is = " + nums[minIdx]);
                
                if (nums[j] < nums[minIdx]){
                    System.out.println("New Min");
                    minIdx = j; //overwrite min if j is valued smaller than current
                    
                }
            }
            //Swap the found minimm element with first element
            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
            System.out.println("Swap, end of cycle " + i);
        }
        return nums;
    }
    public static int[] bsort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j< nums.length - i -1 ; j++){
                System.out.println("J = " + nums[j] + " J+1 = " + nums[j+1]);
                if  (nums[j] > nums[j+1] ) {
                    System.out.println("SWAP");
                    //Swap the elements
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums;

    }

}
