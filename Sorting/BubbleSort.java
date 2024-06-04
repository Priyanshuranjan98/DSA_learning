package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={1,10,3,2,5};
        System.out.println("Before Sorting....");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("After Sorting......");
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
