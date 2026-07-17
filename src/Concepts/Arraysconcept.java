package Concepts;

import java.util.*;

public class Arraysconcept {
    public static int lsearch(int []arr, int key){
        for (int i =0; i<arr.length;i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static int largest(int arr[]){
        int max=arr[0]; // can also use Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int binsearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (end+start)/2;

            // comparison
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void rverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){

            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void pairs(int arr[]){
        int count=0;
        for (int i =0; i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
    public static void subarrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i+1;j<arr.length;j++){
             int end = j;
             for(int k = start;k<=end;k++){
                 System.out.print(arr[k]+" ");
             }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static int subsum(int arr[]){
        int msum=Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1; j<arr.length;j++){
                int csum=0;
                for(int k=i;k<=j;k++){
                    csum += arr[k];
                }
                if(msum<csum){
                    msum=csum;
                }
            }
        }
        return msum;
    }
    public static int prefixsum(int arr[]){
        int[] prefix = new int[arr.length];
        int csum = 0;
        int msum = Integer.MIN_VALUE;
        for (int i =0;i< arr.length;i++){
            csum = arr[i]+csum;
            prefix[i]=csum;
        }
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                csum = i==0 ? prefix[j] :prefix[j]-prefix[i-1];
                if(msum<csum){
                    msum=csum;
                }

            }
        }
        System.out.println(Arrays.toString(prefix));
        return msum;
    }
    public static int kadane(int arr[]){
        int csum=0;
        int msum=Integer.MIN_VALUE;
        int count=0;
        for(int i=0; i<arr.length;i++){
            csum=csum+arr[i];
            if (csum<0){
                csum = 0;
                count++;
            }
            msum = Math.max(csum,msum);

        }
        if (count==arr.length){
            msum=Integer.MIN_VALUE;
            for(int i = 0;i<arr.length;i++){
                if (arr[i]>msum){
                    msum=arr[i];
                }
            }
            return msum;
        }
        return msum;
    }
    public static int maxSubArraySum(int[] arr) {
        int csum = 0;
        int msum = Integer.MIN_VALUE;
        for (int num : arr) {
            csum = Math.max(num, csum + num);
            msum = Math.max(msum, csum);
        }

        return msum;
    }
    public static int trappedrainwater(int arr[]){
        int n = arr.length;
        //calculate left maax boundary
        int leftmax[]=new int [n];
        leftmax [0]=arr[0];
        for (int i=1;i<arr.length;i++){
            leftmax[i] = Math.max(arr[i],arr[i-1]);
        }
        //calculate right max boundary
        int rightmax []=new int [arr.length];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(arr[i],arr[i+1]);
        }
        //loop for rainwater
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            //trapped water
            trappedwater += waterlevel-arr[i];
        }
            return trappedwater;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int arr [] = {4,2,0,6,3,2,5};
        int key = 10;
//        lsearch(arr,key);
//        System.out.println(largest(arr));
//        System.out.println(binsearch(arr,key));
//        rverse(arr);
//        System.out.println(Arrays.toString(arr));
//            pairs(arr);
//        subarrays(arr);
//        System.out.println(subsum(arr));
//        System.out.println(prefixsum(arr));
//        System.out.println(kadane(arr));
//        System.out.println(maxSubArraySum(arr));
        System.out.println(trappedrainwater(arr));
    }
}
