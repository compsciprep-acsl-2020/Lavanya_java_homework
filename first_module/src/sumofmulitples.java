public class sumofmulitples {
    public static void main(String[] args){
        int fin=0;
        for(int i=0;i<=1000;i++){
            if (i%3==0||i%5==0){
                fin+=i;
            }
        }
        System.out.println(fin);
    }
}
