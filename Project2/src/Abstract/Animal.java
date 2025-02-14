package Abstract;

abstract class Animal {
	String name;
	
	abstract void makeSound();
	
	public void eat() {
		System.out.println("Somebody " + name);
	}
}