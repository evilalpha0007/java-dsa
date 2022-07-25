package com.alphajava;

public class cyclicsort {
    public static void main(String args[]) {
        int[] arr={0,2,5,1,4};
        missingnumber(arr);
        /*sort(arr);
        printarr(arr);*/

    }

    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
            static void swap(int[] arr, int first ,int second){
                int temp=arr[first];
                arr[first]=arr[second];
                arr[second]=temp;
            }
            public static void printarr(int[] arr ){
                for (int i=0;i< arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            public static int missingnumber(int[] arr){   // for missing number between zero to n in an array if array is not sorted;
                int i=0;
                while(i< arr.length){
                    int correct=arr[i];
                    if(arr[i]< arr.length && arr[i]!=arr[correct]){
                        swap(arr,i,correct);
                    }
                    else {
                        i++;
                    }
                }
                for (int index=0;index< arr.length;index ++){
                    if (arr[index]!=index){
                        System.out.println(" missing number is "+ index);
                        return index;
                    }

                }
                System.out.println(" missing number is "+ arr.length);
                return arr.length;
            }
}
