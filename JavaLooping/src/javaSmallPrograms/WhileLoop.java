package javaSmallPrograms;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop ll=new WhileLoop();
		ll.find_common_divisors(100,120);
		

	}

	private void find_common_divisors(int no1, int no2) {
		// TODO Auto-generated method stub
		int div=2;
		int gcd=0;
		int small=no1<no2?no1:no2;
		while(div>small)
		{
			if(no1%div==0 && no2%div==0)
			
			{
			 gcd = div;	
			}
			div=div+1;
		}
		System.out.println("GCD is " +gcd);
		}
			
	}

