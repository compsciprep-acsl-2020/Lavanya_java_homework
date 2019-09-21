import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args){
        int decimal = 255;
        String fin = "";
        int digit = 0;
        while(decimal!=1){
            digit = decimal%2;
            fin = Integer.toString(digit) + fin;
            decimal = decimal/2;
        }
        fin = "1" + fin;
        System.out.println(fin);
        //OR
        int decimal2 = 255;
        System.out.println(Integer.toBinaryString(decimal2));
    }
}
