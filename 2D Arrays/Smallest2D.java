import java.util.Scanner;

public class Smallest2D {
    public static int Smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(smallest >  matrix[i][j]  ){
                    smallest =  matrix[i][j] ;
                }
            }
        }

        System.out.println("smallest element in the 2D Array is:"+ smallest);
        return smallest;
    }


        public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0; i<n; i++){

            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        Smallest(matrix);
    } 
    
}
