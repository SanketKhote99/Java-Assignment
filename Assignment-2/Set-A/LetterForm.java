import java.util.*;
class LetterForm
{
String fname,mname,lname;
int len;
void accept()
{
System.out.println("Enter First Name :");
Scanner s=new Scanner(System.in);
fname=s.next();
System.out.println("Enter Middle Name :");
mname=s.next();
System.out.println("Enter Last Name :");
lname=s.next();
len=mname.length();
String f=mname.substring(0,1);
String l=mname.substring(1,len);
f=f.toUpperCase();
mname=f+l;
}
void display()
{
System.out.println("Last Name :"+lname);
System.out.println("First Name :"+fname);
System.out.println("Middle Name :"+mname);
}
public static void main(String a[])
{
LetterForm p=new LetterForm();
p.accept();
p.display();
}
}