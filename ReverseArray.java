// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReverseArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println("Before Reverse:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("After Reverse:");
        reverse(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
      public static void reverse(int[] arr){
          int start=0;
          int end=arr.length-1;
          while(start<end){
              int temp=arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
            start++;
            end--;
          }
         
        }
}
