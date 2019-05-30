class Cycle{
	 void fun() {
		System.out.println("I am a cycle with pedal");
	}
}
class MotorCycle extends Cycle{
	void fun() {
		super.fun();
		System.out.println("I am a cycle with engine");
	}
}
public class Polymorphism_super extends  MotorCycle{
	public static void main(String args[]) {
		MotorCycle m=new MotorCycle();
		m.fun();
		Cycle c= new MotorCycle();
		c.fun();
	}
}
