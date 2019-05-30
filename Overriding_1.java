class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
	@Override
    String getName(){
		
    	return "Scoccers Sports";
    }
	 void getNumberOfTeamMembers(){
		 System.out.println( "Each team has n players in " +super.getName());
			//ssuper.getNumberOfTeamMembers();
	        System.out.println( "Each team has n players in " + getName() );
	    }
}
public class Overriding_1 extends Sports{
	public static void main(String args[]) {
		Sports s=new Soccer();
	    s.getNumberOfTeamMembers();
	}
	
}
