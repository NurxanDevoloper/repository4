package Abstract;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "Buddy";
		dog.eat();
		dog.makeSound();

		Cat cat = new Cat();
		cat.name = "Sharik";
		cat.eat();
		cat.makeSound();
	}
}
