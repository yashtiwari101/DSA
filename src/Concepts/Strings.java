package Concepts;

import java.util.Scanner;

public class Strings {
    public static void printletters(String str){
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i)+" ");
    }
    }
    public static void pallindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("Not A pallindrome");
                return;
            }
        }
        System.out.println("It is a pallindrome");
    }
    public static double shortpath(String str){
        //at origin
        int x=0,y=0;
        //travel
        for(int i=0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'N':
                    x++;
                    break;
                case 'S':
                    x--;
                    break;
                case 'W':
                    y--;
                    break;
                case 'E':
                    y++;
                    break;
                default:
                    System.out.println("Invalid direction");
                    return 0;
            }
        }
        return Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
    }
    public static String substring(String str, int si, int ei){
        String sub ="";
        for(int i = si;i<ei;i++){
            sub=sub+str.charAt(i);
        }
        return sub;
    }

    public static void main(String arg[]){
//        char arr[] = {'a','b','c','d'};
//        String str = "abcd";
//        String str1 = new String("xyz");
//
//
//        Scanner sc =new Scanner(System.in);
//        String name = sc.next();
//        String name1 = sc.nextLine();

//        String fullname = "tony stark";
//        System.out.println(fullname.length());

        String firstname = "Yash";
        String Lastname = "Tiwari";
        String fullname = firstname +" "+Lastname;
       // System.out.println(fullname.charAt(3));
      //  printletters(fullname);
//        pallindrome("racpar");
//        String str = "NSENSWNEEENSWE";
//        System.out.println(shortpath(str));


        // String Pool and heap memory
//        String s1 = "Tony";
//        String s2 = "Tony";
//        String s3 = new String("Tony");
//
//        // Using == (reference comparison)
//        if (s1 == s2) {
//            System.out.println("s1 and s2 are equal (==)");
//        } else {
//            System.out.println("s1 and s2 are not equal (==)");
//        }
//
//        if (s1 == s3) {
//            System.out.println("s1 and s3 are equal (==)");
//        } else {
//            System.out.println("s1 and s3 are not equal (==)");
//        }
//
//        // Using .equals() (value comparison)
//        if (s1.equals(s2)) {
//            System.out.println("s1 and s2 have same value (.equals)");
//        } else {
//            System.out.println("s1 and s2 have different value (.equals)");
//        }
//
//        if (s1.equals(s3)) {
//            System.out.println("s1 and s3 have same value (.equals)");
//        } else {
//            System.out.println("s1 and s3 have different value (.equals)");
//        }
//        System.out.println(substring(fullname,2,8)); or
//        fullname.substring(2,8);
//        String [] fruits = {"Apple", "Banana", "Mango"};
//        String largest = fruits[0];
//        for(int i =1;i<fruits.length;i++){
//           int a = largest.compareToIgnoreCase(fruits[i]);
//           if(a<0){
//               largest = fruits[i];
//           }
//        }
//        System.out.println(largest);


   }
}
