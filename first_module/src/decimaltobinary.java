import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int deci = S.nextInt();
        int deci2 = deci;
        String fin = "";
        int digit = 0;
        while(deci!=1){
            digit = deci%2;
            fin = Integer.toString(digit) + fin;
            deci = deci/2;
        }
        fin = "1" + fin;
        System.out.println(fin);
        //OR
        System.out.println(Integer.toBinaryString(deci2));
    }
}
