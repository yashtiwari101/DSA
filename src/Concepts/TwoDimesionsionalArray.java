package Concepts;

import java.util.Scanner;

public class TwoDimesionsionalArray {
    public static void printspiral(int [][]matrix){
        int startrow = 0;
        int startcol=0;
        int endrow = matrix.length-1;
        int endcol= matrix[0].length-1;

        while(startrow <= endrow && startcol<=endcol){
            //top
            for(int j = startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");

            }

            //left
            for(int i=endrow-1;i>=startcol+1;i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endrow--;
            endcol--;
        }

    }
    public static void main(String[] args) {
//    int [][] arr = new int[3][3];
//    Scanner sc = new Scanner(System.in);
//    for(int i = 0; i<3;i++){
//        for(int j =0; j<3;j++){
//            System.out.println("enter the element");
//            arr[i][j]= sc.nextInt();
//        }
//    }
//    sc.close();
//        for(int i = 0; i<3;i++){
//            for(int j =0; j<3;j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        int [] [] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printspiral(matrix);
    }


}