package com.neosoft.poc;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		
		int row;
		int column;
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			try{
				System.out.println("Enter the number of rows");
				row=sc.nextInt();
				System.out.println("Enter the number of columns");
				column=sc.nextInt();
				break;
			}catch(InputMismatchException e){
				System.out.println("Please Enter the number format");
			}
		}
		Random rand=new Random();
		ArrayList<Integer> arry=new ArrayList<>();

		for(int j=0; j<row; j++)
		{
			int k=1;
			while(k<=90)
			{
				int low=k;
				int high=k+9;
				int r=rand.nextInt(high-low)+low;
				if(!arry.contains(r))
				{
					k=k+10;
					arry.add(r);
				}
			}
		}
		int count=0;
		for(int a:arry)
		{
			count++;
			if(count%2!=0)
			{
				System.out.print(a + " | ");
			}
			else{System.out.print(" " + " | ");}

			if(count%column==0)
			{
				System.out.println();
				System.out.println("--------------------------------------------");
			}
		}
	}
}
