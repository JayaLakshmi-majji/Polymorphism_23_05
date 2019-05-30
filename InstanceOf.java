import java.util.Scanner;

class Student{
	
}
class Hacker{
	
}
class Rockster{
	
}
public class InstanceOf {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int as=0,ah=0,ar=0;
		String obj[]=new String[n];
		for(int i=0;i<n;i++) {
			obj[i]=sc.next();
			if(obj[i].equalsIgnoreCase("student")) {
				Student s=new Student();
				if(s instanceof Student) {
					as++;
				}
			}
			if(obj[i].equalsIgnoreCase("Hacker")) {
				Hacker h=new Hacker();
				if(h instanceof Hacker) {
					ah++;
				}
			}
			if(obj[i].equalsIgnoreCase("Rockster")) {
				Rockster r=new Rockster();
				if(r instanceof Rockster) {
					ar++;
				}
			}
			
		}
		System.out.println("student :"+as);
		System.out.println("hacker :"+ah);
		System.out.println("rockster :"+ar);
	}
}
