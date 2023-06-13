package com.learning;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo sd=new StringDemo();
		sd.check_start();
		sd.check_ends();
//		String last_movie1 = "GN";
//		  String last_movie2 = "GN";
//		  String last_movie3 = "GN";
//		  String last_movie4 = "GN";
//		  System.out.println(last_movie1.hashCode());
//		  System.out.println(last_movie2.hashCode());
//		  System.out.println(last_movie3.hashCode());
//		  System.out.println(last_movie4.hashCode());
//		  last_movie1 = "2018";
//		  System.out.println(last_movie1.hashCode());
//		  System.out.println(last_movie2.hashCode());
//		  System.out.println(last_movie3.hashCode());
//		  System.out.println(last_movie4.hashCode());
	  String name = "sabaribala";
//		  System.out.println(name.charAt(0));
//		  System.out.println(name.charAt(1));
//		  System.out.println(name.charAt(2));
//		  System.out.println(name.charAt(3));
//		  System.out.println(name.charAt(4));
//		  System.out.println(name.charAt(5));
	  System.out.println(name.length());
	  System.out.println(name.charAt(0));//first letter
		System.out.println(name.charAt(name.length()-1));//last
		System.out.println(name.charAt(name.length()/2));//middle
		  for(int i=0;i<6;i++)
		  {
			  System.out.println(name.charAt(i));
		  }
		  
		  String date = "30/05/2023";
			String[] ds = date.split("/");
			for(int i=0;i<ds.length;i++)
				System.out.println(ds[i]);
			
			
		    String s = "IPL Ended yesterday";
		    String[] ss = s.split(" ");
		    
	}

	private void check_start() {
		// TODO Auto-generated method stub
		String name1 = "sabaribala";
		String name2 = "sab";
		boolean starts = true; 
for(int i=0; i<name2.length();i++)	{	
		if(name1.charAt(i) == name2.charAt(i))
		{
			continue;
		}
		else
		{
			starts = false; 
			break; 
		}
	}
	if(starts==true)
	{
		System.out.println("yes" + name1 + " starts with "+name2);
	}
	else
	{
		System.out.println("Not starts with "+name2);
	}
}
	
	private void check_ends() {
		// TODO Auto-generated method stub
String name1 = "sabaribala";
String name2 = "bala";
boolean ends = true;
int len1 = name1.length()-1; 
for(int len2 = name2.length()-1; len2>=0;len2--)
{
	if(name1.charAt(len1)== name2.charAt(len2))
	{
		len1--;
		continue; 
	}
	else
	{
		System.out.println("No, not ends with");
		ends = false; 
		break; 
	}
}	
if(ends == true)
{
	System.out.println("yes, ends with "+name2);
}
	}
	
	

}
