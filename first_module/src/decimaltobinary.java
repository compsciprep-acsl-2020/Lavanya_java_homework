import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args){
        int deci = 255;
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
        int decimal2 = 255;
        System.out.println(Integer.toBinaryString(decimal2));
    }
}
