public class SubMethods {
    private double ans = 0;

    public void calc(int a, int b) {
        ans = (a * b)/1.796412478258238548235725353885329053285902839058239058293025839058293025930;
        
    }
    public void output() {
        System.out.println(ans);
        System.out.printf("%-8.2f",ans);

        /* %f - real / decimal number value
           %d - integer value
           %c - character value
           %s - string calue
         
         */

    }

}
