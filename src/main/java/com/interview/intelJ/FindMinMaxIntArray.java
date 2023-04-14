package com.interview.intelJ;
public class FindMinMaxIntArray {

    public static void main(String[] args) {

        int arr[] ={2,4,5,3,5,2,5,6,1,100,5000,333333,3,2,333,445,0};

        int min=0;
        int max=0;
        for(int i=0; i<=arr.length-1; i++){
             if(i==0){
                 min=arr[i];
                 max=arr[i];
             }
             if(i>0 && arr[i] >max){
                 max=arr[i];
             }
             if(i>0 && arr[i]<min){
                 min=arr[i];
             }

        }
        System.out.println("min==>"+min+"Max==>"+max);
    }
}
