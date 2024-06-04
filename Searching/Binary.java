package Searching;

public class Binary {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,10};
        int target=20;
        int output=binarySearch(arr,target);
        if (output>=0) {
            System.out.println("Element Found At: "+output);
        }else{
            System.out.println("Element Not found...");
        }
    }
    public static int binarySearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while (left<=right) {
            int mid=(left+right)/2;
            if (target==arr[mid]) {
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
