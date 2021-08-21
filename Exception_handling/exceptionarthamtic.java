package Exception_handling;

public class exceptionarthamtic {
	

	public static void main(String[] args) {
		
		System.out.println("start");
		int c= 0;
		try {
	     c = 10/0;
		}catch(Exception e) {
			System.out.println(e);
		}
	System.out.println("c ="+c);
	System.out.println("end");
		
	}
	
	
}
