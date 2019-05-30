import java.util.Scanner;
class SbString{
	void Sbstring(String s,int start,int end){
		//if(start<=end&&end>start&&end<=s.length()-1) {
		try {
			for(int i=start;i<=end;i++){
				System.out.print(s.charAt(i));
			//}
		}
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("entered size is above the length ");
		}
		//else
			//System.out.println("no");
	}
}
public class Substring extends SbString{
	public static void main(String args[]) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("length="+s.length());
		System.out.println("enter the start index");
		int startindex=sc.nextInt();
		System.out.println("enter the end index lessthan or equal to length");
		int endindex=sc.nextInt();
		Substring obj=new Substring();
		obj.Sbstring(s, startindex, endindex);
		sc.close();
	}
}
