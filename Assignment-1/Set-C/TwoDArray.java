import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray{


  public static void main(String[] args) {
   int sum=0;
    Scanner scan = new Scanner(System.in);

    int a[][] = { { 5, 6}, { 8, 9 }};
    int row=a[0].length;
    int col=a[1].length;
    System.out.println("A = " + Arrays.deepToString(a));
    int choice;
    do {
      System.out.println("\nChoose the matrix operation,");
      System.out.println("----------------------------");
      System.out.println("1. Sum of diagonal elements");
      System.out.println("2. Sum of upper diagonal elements");
      System.out.println("3. Sum of lower diagonal elements");
      System.out.println("4. Exit");
      System.out.println("----------------------------");
      System.out.print("Enter your choice: ");
      choice = scan.nextInt();

      switch (choice) {
      case 1:
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if(i==j){
            sum = sum + a[i][j];
          }
          
        }
      }
      System.out.println("Sum Of Diagonal Element:"+sum);
        break;
      case 2:
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if(i<=j){
            sum = sum + a[i][j];
          }
          
        }
      }
      System.out.println("Sum Of Upper Diagonal Element:"+sum);
        break;
      case 3:
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if(j<=i){
            sum = sum + a[i][j];
          }
          
        }
      }
      System.out.println("Sum Of Lower Diagonal Element:"+sum);
        break;
      case 4:
        System.out.println("Exit");
        return;
      default:
        System.out.println("Invalid input.");
        System.out.println("Please enter the correct input.");
      }
    } while (true);
   
  }
  }
