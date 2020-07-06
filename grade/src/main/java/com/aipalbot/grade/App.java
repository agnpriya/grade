package com.aipalbot.grade;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      /*  System.out.println( "\n           *******STUDENT GRADE *******\n         ");
        
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("            Enter student Marks:  ");
       int marks = scanner.nextInt();
       
      
       if (marks<=39)  System.out.println(" \n  The student grade is: F ");
   	
       else if (marks<=49)  System.out.println("\n The student grade is: E ");
      
       else if (marks<=59)   System.out.println("\n  The student grade is: D ");
       
       else if (marks<=69)   System.out.println("\n  The student grade is: C ");
       
       else if (marks<=85)   System.out.println("\n  The student grade is: B ");
       
       else if (marks<=100)  System.out.println("\n   The student grade is: A ");
             
         
      
     if (marks<=39)   System.out.println(" \n    The student grade is: F ");
        
      
      if ((marks>39) && (marks<=49))   System.out.println("\n     The student grade is: E    ");
       
       if ((marks>49) && (marks<=59))   System.out.println("\n     The student grade is: D    ");
       
        if ((marks>59) && (marks<=69))   System.out.println("\n     The student grade is: C   ");
       
        if ((marks>69) && (marks<=85))   System.out.println("\n     The student grade is: B    ");
       
         if ((marks>85) && (marks<=100))  System.out.println("\n     The student grade is: A    ");
       
    	  
       
        
        int rowSize = 3;
        int colSize = 2;
        
        int[][] grade = new int[rowSize][colSize];
        
        for(int i=0;i<rowSize;i++)
        {
        	int header =i;
        	System.out.println("***********Enter  "+(header+1) + "row elements***********");
        	for(int j=0;j<colSize;j++)
        	{
        		
        		int l=j;
        		System.out.println("Enter  "+(l+1)+ "column elemnt:");
        		Scanner input = new Scanner(System.in);
        		grade[i][j] = input.nextInt();
        		
        	}
        	
        	
        }
        
        System.out.println("**************Student |GRADINGPOINTS  CREDITHOURS| ARRAY ******************");
        for (int i=0; i<rowSize;i++ )
        	
        {
        	System.out.print("|\t");
        	for(int j=0;j<colSize;j++)
        	{
        		System.out.print(grade[i][j]+"\t");
        	}
        	System.out.print("|");
        	System.out.println("\n");
        }
        
        
        //Caluculating gradinghours*credithours and totaal credithours 
        
        double totalGrade =0.0;
        int totalHours=0;
        for(int i=0;i<rowSize;i++)
        { 
        	int header=i;
        	int product=1;
        	int h =0;
        	for(int j=0;j<colSize;j++)
        	{
        		h =j+1;
        		product*=grade[i][j];
        		if(h==colSize)
        		{
        			totalHours+=grade[i][j];
        		}
        		
        	}
        	System.out.println("Row"  +"  "  +(header+1)  +"  " +"of"  +" "   +"(GradingPoints*CreditHours) =  "   +product);
        	System.out.println("\n");
        	totalGrade+=product;
        }
        
        System.out.println("Total of (GRADEPOINTS* CREDITHOURS) =  "  +totalGrade);
        System.out.println("\n");
        System.out.println("Total of CREDITHOURS=  "  +totalHours);
        System.out.println("\n");
        
        
        double gradingPoint = totalGrade/totalHours;
        System.out.println("Grading Point:  " +gradingPoint);
        */
    	
    	
    	int rowSize =2;
    	int colSize = 2;
    	
    	int[][] matrixA = new int[rowSize][colSize];
    	int[][] matrixB = new int[rowSize][colSize];
    	
    	int[][] matrixC = new int[rowSize][colSize];
    	
    	
    	System.out.println("***********Enter MATRIX A elements**************");
    	
    	
    	
    	for(int i=0; i<rowSize; i++) 
    	{
    		int header=i;
    		System.out.println("**Enter " +(header+1)+ "  row  elements" );
    		
    		for(int j=0; j<colSize; j++)
    		{
    			int l=j;
    			System.out.println("Enter  "+(l+1)+ "  column elements");
    			Scanner input = new Scanner(System.in);
    			matrixA[i][j] = input.nextInt();
    			
    		}
    		
    	}
    	
    	
	System.out.println("***********Enter MATRIX B elements**************");
    	
    	
    	
    	for(int i=0; i<rowSize; i++) 
    	{
    		int header=i;
    		System.out.println("**Enter " +(header+1)+ "  row  elements" );
    		
    		for(int j=0; j<colSize; j++)
    		{
    			int l=j;
    			System.out.println("Enter "+(l+1)+ "  column elements");
    			Scanner input = new Scanner(System.in);
    			matrixB[i][j] = input.nextInt();
    			
    		}
    		
    	}
    	
   System.out.println("******** MATRIX A ELEMENTS*************"); 	
   
   
   for(int i=0;i<rowSize;i++)
   {

   	System.out.print("|\t");
   	for(int j=0;j<colSize;j++)
   	{
   		System.out.print(matrixA[i][j]+"\t");
   	}
   	System.out.print("|");
   	System.out.println("\n");
   }
   
   
   
 System.out.println("******** MATRIX B ELEMENTS*************"); 	
   
   
   for(int i=0;i<rowSize;i++)
   {

   	System.out.print("|\t");
   	for(int j=0;j<colSize;j++)
   	{
   		System.out.print(matrixB[i][j]+"\t");
   	}
   	System.out.print("|");
   	System.out.println("\n");
   }
   
   
   
   //Calculating multiplication of A*B matrices
  
   for(int i=0;i<rowSize;i++){    
	   for(int j=0;j<colSize;j++){    
	   matrixC[i][j]=0;      
	   for(int k=0;k<colSize;k++)      
	   {      
			
	   matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];      
	   }
	   System.out.print(matrixC[i][j]+" ");   
	   } 
		
	   
	   System.out.println();    
	   }    
   
  
    }
    
    
    
    
    
    
}
