
public class Animal {
	Animal() {
		System.out.println("A new animal has been created!");
	}
	void sleep() {
		System.out.println("An animal sleeps...");
	}
	void eat() {
		System.out.println("An animal eats...");
	}
}

class Bird extends Animal {
	Bird() {
		System.out.println("A new bird has been created!");
	}
	void sleep() {
		System.out.println("An bird sleeps...");
	}
	void eat() {
		System.out.println("An bird eats...");
	}
}
class Dog extends Animal {
	Dog() {
		System.out.println("A new dog has been created!");
	}
	void sleep() {
		System.out.println("An dog sleeps...");
	}
	void eat() {
		System.out.println("An dog eats...");
	}
}
