package Exception_handling;

public class HowToHandleException {

	
	public static void ArtiExe() {
		int c =0;
		try {
		 c = 10/0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(c);
	}
	public static void nullExcep() {
		String s = null;
		try {
		s.concat("NPZ");
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(s);
	}
	public static void arrayIndex() {
		int[] arr = new int[3];
		arr[6]= 10;
		System.out.println(arr);
	}
	
public static void main(String[] args) {
	ArtiExe();
	//nullExcep();
	//arrayIndex();
			
	}	
}




/*
try {
	int c = 10/0;
  return "abc";
}catch(NullPointerException e) {
	e.printStackTrace();
	return "pqr";
}catch(Exception e) {
	return "xyz";
}
System.out.println(s);
}*/