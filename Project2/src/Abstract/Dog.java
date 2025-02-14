package Abstract;

public class Dog extends Cat{
	String name;
	
	  @Override
	    void makeSound() {
	        System.out.println(name + " is barking.");
	    }
}