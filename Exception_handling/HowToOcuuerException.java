package Exception_handling;

public class HowToOcuuerException {
	
	
	
	public static void ArtiExe() {
		int c = 10/0;
	
		System.out.println(c);
	}
	public static void nullExcep() {
		String s = null;
		s.concat("NPZ");
		System.out.println(s);
	}
	public static void arrayIndex() {
		int[] arr = new int[3];
		arr[6]= 10;
		System.out.println(arr);
	}
	
public static void main(String[] args) {
	//ArtiExe();
	//nullExcep();
	arrayIndex();
			
	}	
}

