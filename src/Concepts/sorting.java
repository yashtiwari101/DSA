package Concepts;

import java.util.*;



public class sorting {

    public static void bubblesort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0 ; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionsort(int [] arr){
        for(int i =0;i<arr.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionsort(int []arr){
        for(int i=1;i<arr.length;i++){
            int curr =arr[i];
            int prev = i-1;
            //finding out correct pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
            }
        }
    public static void countingsort(int []arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i =0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int []arr = {1,4,5,2,3,4,2,1,3,3,4,2,4,5,5,4,8,6,7,7,7};
//        bubblesort(arr);
//        selectionsort(arr);
//        insertionsort(arr);
//        Arrays.sort(arr);
//        Arrays.sort(arr,0,3);
//        Arrays.sort(arr, Collections.reverseOrder());
        countingsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
