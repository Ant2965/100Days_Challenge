import java.util.*;
public class salary {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter your Salary");
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		
		if(a<500000) {
			
			System.out.println("tax = 10");
			}
		else if(a>500000 && a<100000)
{
	         System.out.println("tax = 20");
}
         else{
	         System.out.println("Tax = 30");
}
    }//high salaary

}