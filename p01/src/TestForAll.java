import java.util.Scanner;
public class TestForAll {
    public static void main (String[] args) {

        //факториал 4!=4*3*2*1
        //1!=1
        //2!=2*1
        //15!=15*14*13*12*11*10*9*8*7*6*5*4*3*2*1
        //0!=1
        System.out.println(fac(4));
    }
    private static int fac(int n) {
        if (n==1)
            return 1;
        return n*fac(n-1);
    }
}
