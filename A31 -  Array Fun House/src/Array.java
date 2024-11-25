import java.util.Arrays;

public class Array {
     int[] arrayList = null;
        public Array(int[] array) {
            arrayList = array;
        }
    
        public  int sum(int start, int stop){
            int sum = 0;
            for (int i = start; i<=stop;i++){
                sum = sum + arrayList[i];

        }
        return sum;
    }
    public  int countNumbers(int search) {
        int count = 0;
        for (int i= 0; i< arrayList.length; i++) {
            if (arrayList[i] == search) {
                count++;
            }
        }
        return count;
    }
    public  void removeSeven(){
        int[] newArray = null;
        int length = arrayList.length - countNumbers(7);
        newArray = new int[length];
        for (int i = 0; i<arrayList.length; i++){
            if (arrayList[i] != 7){
            newArray[i] = arrayList[i];
            }
    

        }
        System.out.println("\n" + Arrays.toString(newArray));
    }
    
}

