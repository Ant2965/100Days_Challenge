
public class shortest {
	
	public static void shortpath(String path) {
		int x=0;
		int y=0;
		for (int i =0;i<path.length();i++) {
			char dir = path.charAt(i);
			if(dir== "N") {
				y++;
				
			}
			else if(dir == "S") {
				y--;
				
			}
			else if(path.charAt(i)== "E") {
				x++;
				
			}
			else if(path.charAt(i)== "w") {
				x--;
				
			}
			
		}
		
	}

	public static void main(String[] args) {

     String path = "WNEENESENNN";
     shortpath(path);
	}

}
