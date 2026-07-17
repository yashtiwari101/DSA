import java.sql.SQLOutput;

public class misc {
    public static void reverse(int n){
        int rev=0;
        int digit;
        while(n>0){
            rev = rev*10 + n%10;
            n=n/10;
        }
        System.out.println(rev);
    }

    public static void isprime(int n){
        boolean is = true;
        for (int i = 2; i<n;i++){
            if (n%i==0){
                is=false;
                break;
            }
        }
        if(is){
            System.out.println("number is prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    public static void primerange(int n){
        for (int i = 2; i<=n;i++){
           boolean istrue = true;
            for(int j = 2 ; j<=Math.sqrt(i);j++){
                if(i%j==0){
                    istrue = false;
                }
            }
            if (istrue){
                System.out.println(i);
            }
        }
    }

    public static int bintodec(int n){
        int count =0;
        int dec = 0;
        while (n>0){
            int digit = n%10;
            if(digit!=0 || digit!= 1){
                System.out.println("invalid number");
                return 0;
            }
            dec = dec + digit *(int) Math.pow(2,count);
            count++;
            n/=10;
        }
        return dec;
    }

    public static  int dectobin(int n){
        int count = 0;
        int bin = 0;
        while (n>0){
            int digit = n%2;
            bin = bin + digit*(int) Math.pow(10,count);
            count++;
            n/=2;
        }
        return bin;
    }
    public static void main(String[] args) {
//        reverse(10899);
  //      isprime(931);
//        primerange(20);
        System.out.println(dectobin(2));
    }
}
