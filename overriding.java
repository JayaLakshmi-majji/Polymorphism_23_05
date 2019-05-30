package task_23_05;

public class overriding {
	public static void main(String args[]) {
		Animal a=new Animal();
		a.Sound();
		Dog d=new Dog();
		d.Sound();
		a=d;
		a.Sound();
	}
}
 class Animal{
	void Sound() {
		System.out.println("sound");
	}
}
 class Dog extends Animal{
	 void Sound() {
		 System.out.println("Bark");
		}
 }

