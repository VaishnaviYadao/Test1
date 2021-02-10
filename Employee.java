package Test;

public class Employee {

	
		
		 String firstName;
		 String lastName;
		
		
	   Employee(String fName , String lName)
		{
			this.firstName=fName;
			this.lastName=lName;
		}
	   public String toString()
	   {
		   return firstName + " " + lastName;
	   }
		
     public static void main(String[] args)
	{
		Employee s1 = new Employee("Riya" , "Patil");
		
		System.out.println(s1.toString());
		
		Employee s2 = new Employee("Vaish" , "Deshmukh");
		
		System.out.println(s2);
		
        Employee s3 = new Employee("Nisha" , "Kolhe");
		
		System.out.println(s3);
		
		
		
	}

}
