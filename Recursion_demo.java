package recursion;

public class Recursion_demo {

	public static void main(String[] args) {
		
		
		Recursion_demo object = new Recursion_demo();
		
		//object.display(1); // recursion is called itself 
		                   // method multiple time called 
		                   // code reduce 
	                       // looping don't use 
		
	int result = object.fact3(3);
	System.out.println(result);
		
		

	}
	    //  3factorial find without looping 
	
	private int fact3(int no) {
		
		if(no == 1 )
			return 1;
		else 
			return no * fact2(no-1);	// 3*2
	}

	// 2 factorial 2*1
	
	private int fact2(int no) {
			
		if(no == 1)
			return 1;
		
		else 
			return no * fact1(no-1);
		}
	
   // factorial 1!
	private int fact1 (int no) {
		
		if(no == 1)
		return 1;
		return no;
		
	
	}
	// 1 to 5 print without looping 
	
	public void display(int no)
	{
		System.out.println(no);
		no++;
		if(no<=5)
			display(no);
		
		
	}

}
