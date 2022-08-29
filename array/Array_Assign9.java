package com.training.array;

import java.util.Scanner;

/*User will enter the element in M*M order matrix that is square matrix now you have to print
first row, last row, first column, and last column elements. Code should be applicable for matrix
of any order.*/

public class Array_Assign9 {
	
	public static void main(String[] args) {
		 
		        // TODO Auto-generated method stub
		        
		        Scanner sc= new Scanner(System.in);
		        System.out.print("Enter the no. of rows: ");  
		        int n= sc.nextInt();
		        System.out.print("Enter the no. of columns: ");  
		        int m= sc.nextInt();
		        
		        int[][] matrix=new int[n][m];
		        
		        
		        System.out.print("Enter the elements rowwise: ");
		        for(int i=0; i<n;i++)
		            {
		                for(int j=0;j<m;j++)
		                    {
		                        matrix[i][j]=sc.nextInt();
		                    }
		            }
		        
		        //Printing original matrix
		        System.out.println("Original matrix: ");
		        for(int i=0; i<n;i++)
		        {
		            for(int j=0;j<m;j++)
		                {
		                    System.out.print(matrix[i][j]+" ");
		                }
		            System.out.println();
		        }
		        
		        System.out.println();
		        System.out.println();
		        System.out.println("Printing First row, Last row, First column, Last column: ");
		        
		        //Printing first row and last row
		        System.out.println();
		        for(int i=0;i<n;i+=(n-1))
		            {
		                for(int j=0;j<m;j++)
		                    {
		                        System.out.print(matrix[i][j]+" ");
		                    }
		                System.out.println();
		                
		            }
		        
		        //Printing first column and last column
		        for(int i=0;i<m;i+=(m-1))
		            {
		                for(int j=0;j<n;j++)
		                    {
		                        System.out.print(matrix[j][i]+" ");
		                    }
		                System.out.println();
		                
		            }


	}

}
