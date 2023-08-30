package recursion;

public class Practice_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_recursion pr=new Practice_recursion();
		int result=pr.fact3(1234);
		System.out.println(result);
		pr.printNos(100);
		}

	private int fact3(int no) {
		
		if(no == 0)
			return 0; 
			return (no%10 +(fact3(no/10)));
	}
	  // Prints numbers from 1 to n
	   void printNos(int n)
	  {
		   int count=0;
	    if(n > 0)
	    {
	      printNos(n - 1);
	      System.out.print(n + " ");
	    }
	    return;
	  }
}

