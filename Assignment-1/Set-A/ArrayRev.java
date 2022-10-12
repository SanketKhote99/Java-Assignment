import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want ");
        int count = sc.nextInt();
        int [] array = new int[count];
        System.out.println("Enter the elements of the array: ");  
            for(int i=0; i<count; i++) {  
                array[i]=sc.nextInt();  
            }   

        // array displays
        System.out.println("Original array: ");  
        for (int i = 0; i < array.length; i++) {  
            System.out.print(array[i] + " ");  
        }  
        
        // reverse order  
        System.out.println("\nArray in reverse order: ");  
        for (int i = array.length-1; i >= 0; i--) {  
            System.out.print(array[i] + " ");  
        }  
    }  
} 