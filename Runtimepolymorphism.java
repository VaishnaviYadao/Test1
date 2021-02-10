package Test;


class Animal{
	
	void sound()
	{
		System.out.println("Animal is making sound");
	}
	class Dog extends Animal{
		
		@Override
		 void sound()
		{
			System.out.println("Barking");
		}
	}
		
     class horse extends Animal
     {
	    void sound()
	    {
	    	System.out.println("Neigh");
	    }
     }
     class cat extends Animal
     {
    	  void sound()
    	 {
    		 System.out.println("Meow");
    	 }
     }
     
     public   class Runtimepolymorphism{
    	 
    	 public static void main(String[] args)
    	 
    	 {
    		 Animal A1 = new Animal();
    		 Animal A2 = new Dog();
    		 Animal A3 = new horse();
    		 Animal A4 = new cat();
    		 
    		 A1.sound();
    		 A2.sound();
    		 A3.sound();
    		 A4.sound();
    		 
    	 }
     }
}
	

