public class CoolNumbers {
    int count;
    public boolean isCoolNum( int checkN ) {
        if (checkN%6 == 1 && checkN%5 == 1 && checkN%4 == 1 && checkN%3 == 1){
            return true;
        }
        else {
            return false;
        }
    }
    public int countCoolNumbers( int n ){
        for (int i=n; i >= 6; i--){
            if(isCoolNum(i)){
                count++;
            }
        }
        return count;
    }

}
