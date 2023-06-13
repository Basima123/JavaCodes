package com.learning;

public class Algorithm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int[9][9];
	    int no = 5;
	    int MinRow = 0;int MaxRow = 8;int MinCol = 0;int MaxCol = 8;
	    
	    while(no>=1) {
	      for(int col = MinCol ;col<=MaxRow;col++)
	      {
	        a[MinRow][col] = no;
	        
	      }MinRow++;
	      
//	      int MinRow = 1;
	      for(int row = MinRow;row<=MaxRow;row++)
	      {
	        a[row][MaxCol] = no;
	      }MaxCol--;
	      
//	      int MaxCol = 8;
	      for(int col = MaxCol;col>=MinCol;col--)
	      {
	        a[MaxRow][col] = no;
	      }MaxRow--;
	      
//	      int MaxRow = 8;
	      for(int row = MaxRow;row>=MinRow;row--)
	      {
	        a[row][MinCol] =no;
	      }MinCol++;
	      no--;
	  }
	    
	    for(int row=0; row<=8; row++)
	          {
	            for(int col=0; col<=8; col++)
	            {
	              System.out.print(a[row][col]+"  ");
	            }
	            System.out.println();
	          }

	}

}
