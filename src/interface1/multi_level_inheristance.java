package interface1;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog {
	void sleep() {
		System.out.println("sleeping...");
	}
}

public class multi_level_inheristance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d = new BabyDog();
		d.sleep();
		d.bark();
		d.eat();
	}


	}
