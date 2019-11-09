import java.util.List;
import java.util.Scanner;

public class rotate_left {
    public static int[] rotateLeft(int[] inp){
        int x=inp[0];
        int y=inp[1];
        int z=inp[2];
        inp[0]=y;
        inp[1]=z;
        inp[2]=x;
        return(inp);
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int[] inp = {0,0,0};
        System.out.println("Enter the first number:");
        inp[0] = S.nextInt();
        System.out.println("Enter the second number:");
        inp[1] = S.nextInt();
        System.out.println("Enter the third number:");
        inp[2] = S.nextInt();
        inp = rotateLeft(inp);
        System.out.println("[ " + inp[0] + ", "+inp[1] + ", "+inp[2]+" ]");
    }
}
