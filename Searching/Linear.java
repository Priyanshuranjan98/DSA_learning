package Searching;

/**
 * BinarySearch
 */
public class Linear {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,10};
        int target=1;
        int output=linearSearch(arr, target);
        if (output>=0) {
            System.out.println("Element Found At: "+output);
        }else{
            System.out.println("Element Not Found...");
        }
    }
    public static int linearSearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if (target==arr[i]) {
                return i;
            }
        }
        return -1;
    }
}