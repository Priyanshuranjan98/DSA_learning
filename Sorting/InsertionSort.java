package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={1,3,2,6,4,5,10,9,8};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("After Sorting......");
        insertionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
