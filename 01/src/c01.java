import java.util.Scanner;
public class c01 {

	public static void main(String[] args) {
		

Scanner input = new Scanner(System.in);  
		
		int n ;
		int r=0;
		n=input.nextInt();
		if (n<187)
		{
			
			if(n%31==0)
				r=n/31;
			if(n%31!=0)
				r=(n/31)+1;
		 }
		if (n<337 && n>=187)
		{
			
			if((n-186)%30==0)
				r=(n-186)/30+6;
			if((n-186)%31!=0)
				r=(n-186)/30+6+1;
		 }
		if(n>=337)
			r=12;
		System.out.print(r);
	
	
	
	
	}//end main

}// end class
