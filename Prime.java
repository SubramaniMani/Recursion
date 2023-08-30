package recursion;

public class Prime {
	
	
	

	public static void main(String[] args) {
		
		Prime obj = new Prime();
		
		//zobj.Pattren();
		obj.Pattren1();
		
		
		
//		int result=obj.prime_number(2,100);
//		System.out.println(result);
//		private int prime_number(int no1,int no2) {
//		if(no1==1) 
//			return 1;
//		if(no2%no1 ==0) 
//				return 0;
//				return prime_number(no1,no2-1);
//		}
//		
		

	}

	private void Pattren1() {
		for(int row =1 ; row<=5; row++)
		{
			for(int col=1; col<=5-row; col++)
			{
				System.out.print("*"+" ");
			}
			for(int no=1; no<=row; no++) 
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
	}

	private void Pattren() {
		for(int row =1 ; row<=5; row++)
		{
			for(int col=1; col<row; col++)
			{
				//System.out.print("*"+ " ");
				System.out.print("  ");
			}
			//for(int no =1; no<=6-row; no++)
			for(int no=5; no>=row; no--)
			{
				System.out.print(no+ " ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}


	}


