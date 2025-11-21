package Recursion;

public class fibbonicci {
    public static int fibbonicci(int n){

        if(n<=1) return n;
        else return fibbonicci(n-1) + fibbonicci(n-2);


    }
    public static void main(String[] args) {
        int count=10;

        for (int i = 0; i <= count; i++) {
            System.out.println(fibbonicci(i));

        }

    }
}
