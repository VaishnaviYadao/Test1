package Test;
import java.util.Scanner;

public class ArrayDemo {
	

	public static void main(String[] args) {
		int children=0;
		int adult=0;
		int senior=0;
		int age[]=new int[10];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<age.length;i++)
		{
			age[i]=scan.nextInt();
			
		}
		for(int i=0;i<age.length;i++)
		{
			if(age[i]<18)
			{
				children++;
			}else if(age[i]>=18 && age[i]<=54)
			{
				adult++;
				
			}else if(age[i]>=55)
			{
				senior++;
			}
			
		}
		
		System.out.println("children :"+children);
		System.out.println("Adult :"+adult);
		System.out.println("senior :"+senior);
		}

}

