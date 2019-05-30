
public class Overloading {
	 int Add(int i,int j) {
		return i+j;
	}
	 double Add(double i,double j) {
		return i+j;
	}
	 float Add(float i,float j) {
		return i+j;
	}
	public static void main(String args[]) {
		Overloading obj= new Overloading();
		System.out.println(obj.Add(3,4));
		System.out.println(obj.Add(3.45,4.45));
		System.out.println(obj.Add(3.4,4.4));
		


	}
}