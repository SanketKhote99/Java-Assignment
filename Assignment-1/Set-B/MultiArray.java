import java.util.Scanner;
public class MultiArray {
    public static void main(String[] args) {

        //options displays
        System.out.println("Addition");
        System.out.println("Multiplication");
        System.out.println("Transpose of any matrix");
        System.out.println("Exit");

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        // switch case for sellect give options
        switch (ch) {
            case 1:
            int rows = 2, columns = 3;
            int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
            int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };
    
            // Adding Two matrices
            int[][] sum = new int[rows][columns];
            for(int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
            }
    
            // Displaying the result
            System.out.println("Sum of two matrices is: ");
            for(int[] row : sum) {
                for (int column : row) {
                    System.out.print(column + "    ");
                }
                System.out.println();
            }
                break;
            
            case 2:
            int r1 = 2, c1 = 3;
            int r2 = 3, c2 = 2;
            int[][] firstMatrixx = { {3, -2, 5}, {3, 0, 4} };
            int[][] secondMatrixx = { {2, 3}, {-9, 0}, {0, 4} };
    
            // Mutliplying Two matrices
            int[][] product = new int[r1][c2];
            for(int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        product[i][j] += firstMatrixx[i][k] * secondMatrixx[k][j];
                    }
                }
            }
    
            // Displaying the result
            System.out.println("Multiplication of two matrices is: ");
            for(int[] row : product) {
                for (int column : row) {
                    System.out.print(column + "    ");
                }
                System.out.println();
            }
                break;

            case 3:
                //creating a matrix  
                int original[][]={{1,3,4},{2,4,3},{3,4,5}};    

                //creating another matrix to store transpose of a matrix  
                int transpose[][]=new int[3][3];  //3 rows and 3 columns  

                //Code to transpose a matrix  
                for(int i=0;i<3;i++){    
                    for(int j=0;j<3;j++){    
                    transpose[i][j]=original[j][i];  
                    }    
                }    

                System.out.println("Printing Matrix without transpose:");  
                for(int i=0;i<3;i++){    
                for(int j=0;j<3;j++){    
                System.out.print(original[i][j]+" ");    
                }    
                System.out.println();//new line    
                }    
                System.out.println("Printing Matrix After Transpose:");  
                for(int i=0;i<3;i++){    
                for(int j=0;j<3;j++){    
                System.out.print(transpose[i][j]+" ");    
                }    
                System.out.println();//new line    
                }    
                break;

            case 4:
                System.out.println("Existing...");
                break;
            default:
            System.out.println("Invalid input");
                break;
        }
    }
}
