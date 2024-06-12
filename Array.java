// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // int[][] arr=new int[3][];
        // Scanner sc=new Scanner(System.in);
        // for(int row=0;row<arr.length;row++){
        //     for(int column=0;column<arr[row].length;column++){
        //         arr[row][column]=sc.nextInt();
        //     }
        // }
        
        //For Dynamic array
        int[][]arr=new int[3][];
        Scanner sc=new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            System.out.print("Enter the number of columns for row " + row + ": ");
            int columns = sc.nextInt();
            arr[row] = new int[columns]; // Initialize the row with the specified number of columns

            // Fill the array with input values
            for (int column = 0; column < columns; column++) {
                System.out.print("Enter value for arr[" + row + "][" + column + "]: ");
                arr[row][column] = sc.nextInt();
            }
        }
        
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                System.out.print(arr[row][column]+" ");
            }
            System.out.println(" ");
        }
    }
}
