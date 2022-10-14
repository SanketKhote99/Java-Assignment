import java.util.Scanner;

public class MyNumber {
     int x;
    public MyNumber(int x){
     this.x=x;
    }
    public boolean isNegative(){
     if(x<0)
      return true;
     else return false;
    }
    public boolean isPositive(){
     if(x>0)
      return true;
     else return false;
    }
    public boolean isZero(){
     if(x==0)
      return true;
     else return false;
    }
    public boolean isOdd(){
     if(x%2!=0)
      return true;
     else return false;
    }
    public boolean isEven(){
     if(x%2==0)
      return true;
     else return false;
    }
    
    public static void main(String [] args) 
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int x = sc.nextInt();

     MyNumber m=new MyNumber(x);
     if(m.isNegative())
      System.out.println("Number is Negative");
     if(m.isPositive())
      System.out.println("Number is Positive");
     if(m.isEven())
      System.out.println("Number is Even");
     if(m.isOdd())
      System.out.println("Number is Odd");
     if(m.isZero())
      System.out.println("Number is Zero");
    }
   
   }