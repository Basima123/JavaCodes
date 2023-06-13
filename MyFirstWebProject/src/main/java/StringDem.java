
public class StringDem {
	String a1[]=new String[5];
	
//	a1[0]="sa";
	
static	String a[] = {"ram","janu","roy","chin","tamil"};
static String s="java ";

	

	public static void main(String[] args) {
		
		s=s.concat("prgm");
	s=s.indent(5);
	s=s.repeat(4);
	s=s.replace('j','J');
	a[0].equals("java");
		
		System.out.println(s);
		for(int i=0;i<5;i++)
		{
			System.out.println (i + ".Name :"+a[i]);
		}
	}

}
