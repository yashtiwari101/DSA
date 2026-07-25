package Concepts;

public class Bitmanipulation {

    public static void primecheck(int n){
        if((n & 1)==1){
            System.out.println("number is odd");
        }
        else{
            System.out.println("number is even");
        }
    }
    public static void main(String[] args) {
//        System.out.println(5 & 6);
//        System.out.println(5 | 6);
//        System.out.println(5 ^ 6);
//        System.out.println(~(6));
//        System.out.println(5<<2);
//        System.out.println(2>>1);
            primecheck(-6);
    }
}
