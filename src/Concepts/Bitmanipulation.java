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
    public static int clearrangebits(int n, int i, int j){
        int bitmask = ~(~((~0)<<(j-i))<<i);
        return n & bitmask;
    }
    public static void checkpowerof2(int n){
        if(n >0 && (n&(n-1))==0){
            System.out.println("this is power of 2");
        }
        else{
            System.out.println("its not in power of 2");
        }
    }
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&(~1))!=n){     // 0111
                count++;       //   1110
                n=n>>1;
            }
            else {
                n = n >> 1;
            }
        }
        return count;
    }
    public static int fastexponent(int n, int p){
        int ans = 1;
        while(p>0){
            if((p&1)!=0){
                ans = ans*n;
            }
            n=n*n;
            p=p>>1;
        }
        return ans;
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
//        System.out.println(clearibits(15,2));
//        System.out.println(clearrangebits(10,2,4));
//        checkpowerof2(127);
//        System.out.println(countsetbits(1));
//        System.out.println(5<<3);
        System.out.println(fastexponent(3,5));
    }
}
