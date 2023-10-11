package strings;

public class uppercase {
	public static void upcase(String a) {
		StringBuilder sc= new StringBuilder("");
	
		char ch = a.charAt(0);
		sc.append(Character.toUpperCase(ch));
		
		
		
		for(int i =1;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				sc.append(a.charAt(i));
				sc.append(Character.toUpperCase(a.charAt(i+1)));
				
			}
			else {
				sc.append(a.charAt(i));
			}
		}
		System.out.println(sc.toString());
	}

	public static void main(String[] args) {
		String a = "hi i am  anviant";
		upcase(a);

	}

}
