package lec_02;

public class Dog {
	public int weight;
	public static int count = 0;

	public Dog(int w){
		this.weight = w;
		count++;
	}

	public static int getcount() {
		return count;
	}

	public void bark() {
		if(weight>10){
			System.out.println("wuff");
		}
		else
			System.out.println("meow");
	}
}