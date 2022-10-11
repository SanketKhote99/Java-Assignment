import java.util.Scanner;
public class Driven {
    public static void main(String[] args) {

        // Menu list
        System.out.println("Calculate the volume of cylinder...");
        System.out.println("Find the factorial of given number...");
        System.out.println("Check the number is armstrong or not ...");
        System.out.println("Exit");

        // Switch Case
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) {
            
            // Volume of cylinder
            case 1:
                System.out.println("Enter cylinder radius...");
                Float r = (float)sc.nextFloat();

                System.out.println("Enter cylinder height...");
                Float h = (float)sc.nextFloat();

                System.out.println("Volume of cylinder = "+(3.1415929*(r*r)*h));
                break;
        
            // factorial
            case 2:
            int fact =1;
                System.out.println("Enter number to find the factorial of given number...");
                int number = (int)sc.nextInt();
                for(int i = 1; i <= number; i++) {
                    fact *= i;
                    System.out.println(fact);
                }
                break;

            // armstrong
            case 3:
                int num,armstrong,temp,total=0;
                System.out.println("Enter number for check the number is armstrong or not!");
                num = (int)sc.nextInt();
                armstrong = num;
            while(armstrong !=0){
                temp = armstrong % 10;
                total = total + temp*temp*temp;
                armstrong /= 10;
            }
            if(total == num)
                System.out.println(num + " is an Armstrong number");
            else
                System.out.println(num + " is not an Armstrong number");
            break;

            // existing
            case 4:
                System.out.println("Exiting...");
                break;
            default:
            System.out.println("Enter Vaild Number ");
                break;
        }
    }
}
