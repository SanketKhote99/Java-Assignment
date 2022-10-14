import java.util.*;
class Demo
{  
	String a[];
	int n;
	Demo()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("how many city you want to enter : ");
		n=s.nextInt();
               
		a=new String[n];
                for(int i=0;i<n;i++)
		{
			System.out.print("Enter County name : ");
			a[i]=s.next();
		}		
	}
	void display()
	{
		String temp="";
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("Sorted Cities are ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");	
		}	
	}
}
class County
{
	public static void main(String args[])
	{
		Demo obj=new Demo();
		obj.display();
	}
}