package strings;

public class Shortest {
	
	public static void shortpath(String path) {
		int x=0;
		int y=0;
		for (int i =0;i<path.length();i++) {
			//char dir = path.charAt(i);
			if(path.charAt(i)== 'N') {
				y+=1;
				
			}
			else if(path.charAt(i)== 'S') {
				y-=1;
				
			}
			else if(path.charAt(i)== 'E') {
				x+=1;
				
			}
			else if(path.charAt(i)== 'W'){
				x-=1;
				
			}
			
			
		}
		System.out.println(Math.sqrt(x*x+y*y));
		
	}

	public static void main(String[] args) {

     String path = "EE";
     shortpath(path);
	}

}
