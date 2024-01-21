package lec_02;

public class DogLauncher {
	public static void main (String[] args) {
		Dog bruto = new Dog(11);
		bruto.bark();

		Dog skinny = new Dog(9);
		skinny.bark();

		System.out.println("count = " + Dog.getcount());
	}
}