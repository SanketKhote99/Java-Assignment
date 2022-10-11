import java.util.Scanner;
class Rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input Values
        System.out.print("Enter length of Rectangle ");
        Float l = sc.nextFloat();
        System.out.print("Enter breadth of Rectangle ");
        Float b = sc.nextFloat();

        // Calculate area of rectangle
        System.out.println("Area of rectangle = "+(l*b));

        // Calculate perimeter of rectangle
        System.out.println("Perimeter of rectangle = "+2*(l*b));
    }
}