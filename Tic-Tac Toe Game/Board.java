package project;

import java.util.Scanner;

public class Board {
	char x[][]=new char [6][7];
	public Board  ()
	{
		for ( int i=0 ;i<x.length; i++)
		{
			for (int j=0 ;j<x[0].length; j++)
			{
						x[i][j]='-'; 
			}
		
	}	
}
	public  void printBoard  ()
	{
		for ( int i=0 ;i<x.length; i++)
		{
			for (int j=0 ;j<x[0].length; j++)
			{
						System.out.print(x[i][j]+"\t");
			}
			System.out.println("");
		
	}
		System.out.println("-----------------------------------------------------");
	}
	public  boolean checkRows() {
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<(x[0].length-2);j++) {
				if(x[i][j]!='-'&&x[i][j]==x[i][j+1]&&x[i][j+1]==x[i][j+2]) {
					
					return true;
				}
					
				
			}
		}
		return false;
	}	
	
public  boolean checkColoum() {
	
	   for(int j=0;j<(x[0].length);j++) {
		  for(int i=0;i<x.length-2;i++) {
			
				if(x[i][j]!='-'&&x[i][j]==x[i+1][j]&&x[i+1][j]==x[i+2][j]) {
					
					return true ;
				}
				
				
			}
		}
	return false;
	}	
	
public boolean  checkRightDiagonal() {
	for(int i=0;i<x.length-2;i++) {
		for(int j=0;j<(x[0].length-2);j++) {
			if(x[i][j]!='-'&&x[i][j]==x[i+1][j+1]&&x[i][j]==x[i+2][j+2]) {
				return true  ;
			}
			
		}
	}
	return false;
}
public boolean  checkLeftDiagonal() 
{
	for(int i=0;i<x.length-2;i++) {
		for(int j=2;j<x[0].length;j++) {
			if(x[i][j]!='-'&&x[i][j]==x[i+1][j-1]&&x[i][j]==x[i+2][j-2]) {
				return true  ;
			}
			
			
		}
	}
	return false;
}

public int checkWin() {
	
	if(checkColoum()==true||checkRows()==true||checkRightDiagonal()==true||checkLeftDiagonal()==true) {
		return 1;
	}
	return 0;	
}
public int draw() {
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[0].length;j++) {
			if(x[i][j]=='-')
				return 0;
		}
	}
	return 1;
	
}

public void insert ()
{
	char s='o';
	int row=0,col=0;
	while(checkWin()==0&&draw()==0) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the coordinats you wont to play in (row-coloumn)");
	row=input.nextInt();
	 col=input.nextInt();
	 
while (row>=6||row<0||col<0||col>=67||x[row][col]!='-')	
{
	System.out.println("wrong coordinats ,enter the coordinats you wont to play in (row-coloumn)");
	row=input.nextInt();
	 col=input.nextInt();
}//TO CHECK THE VALIDITY OF THE INPUTS
	
		if(s=='o') {
			s='x';
		}
			else
			s='o'; //TO SWAP BETWEEN X AND O
    x[row][col]=s;
    printBoard();
	}
	if(draw()==1){
	System.out.println("draw");	
	}
	else {
	if(x[row][col]=='x') 
		System.out.println("player one won");
	if(x[row][col]=='o') 
		System.out.println("player two won");
	}//TO CHECK WHO IS THE WINNER
}

}
	
	
	
	
	






















		













