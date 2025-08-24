import java.util.*;
public class Que_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of rows=> ");
        int rows = sc.nextInt();
        System.out.println("");

        System.out.print("Enter number of columns=> ");
        int cols = sc.nextInt();
        System.out.println("");

       
        int[][] matrix = new int[rows][cols];

      
        System.out.println("Enter elements of the matrix=> ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        int[] array = new int[rows * cols];
        int idx = 0;

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[idx] = matrix[i][j];
                idx++;
            }
        }
         System.out.println("");
        System.out.println("Elements  into 1D array=>");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

