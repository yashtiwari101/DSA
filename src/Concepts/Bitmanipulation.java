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
    public static int ithbit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }


    }
    public static int setithbit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateithbit(int n, int i, int bit){
        if (bit==0){
            return clearithbit(n,i);
        }
        else{
            return setithbit(n,i);
        }
    }
    public static int clearibits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
//        System.out.println(5 & 6);
//        System.out.println(5 | 6);
//        System.out.println(5 ^ 6);
//        System.out.println(~(6));
//        System.out.println(5<<2);
//        System.out.println(2>>1);
//            primecheck(-6);
//        System.out.println(ithbit(10,3));
//        System.out.println(setithbit(10,2));
//        System.out.println(clearithbit(10,1));
//        System.out.println(updateithbit(10,2,1));
        System.out.println(clearibits(15,2));

    }
}
