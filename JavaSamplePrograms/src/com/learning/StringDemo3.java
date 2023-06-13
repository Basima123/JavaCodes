package com.learning;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringDemo3 sd=new StringDemo3();
		sd.count_character();
		

	}

	private void count_character() {
		// TODO Auto-generated method stub
		
		 String n = "sivasabaribala";
		  
		    int[] cc = new int[n.length()];
		    int big = -1; 
		    char position = ' '; 
		  for(int j = 0; j<n.length(); j++)
		  {
		    int count = 1; 
		    char ch = n.charAt(j);
		    for(int i=j+1; i<n.length();i++)
		    {
		      if(ch == n.charAt(i))
		      {
		        cc[i] = -1; 
		        count++; 
		      }
		    }
		    if(cc[j]!=-1) 
		    {
		      cc[j] = count; //5
		      if(count>big)
		      {
		        big = count; //2
		        position = n.charAt(j); //0
		      }
		    }
		    
		    System.out.println(ch + " appears for " + cc[j] + 
		        " times");
		    

		  }
		  System.out.println(position + " appears maximum time "+ big);
		  
		    
		  }
	    
	  }
	

