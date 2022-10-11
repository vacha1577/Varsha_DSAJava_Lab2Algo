package com.greatLearning.payMoney;

import java.util.Scanner;

public class payMoneyTransaction {
	
	public static void main(String[]args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size of transaction array"); //enter size
	int size = scanner.nextInt();
	
	// enter array
	int arr[]= new int[size];
	System.out.println("Enter the values of array: ");  
	for(int i=0; i<size; i++)  
	{     
	arr[i]=scanner.nextInt();  
	}  
	
	//enter no. of targets
	System.out.println("Enter the total no. of targets that needs to be achieved");  
	int tar = scanner.nextInt();
	
		
	while(tar-- !=0) {
		int flag = 0;
		int sum = 0;
		//enter value
		System.out.println("Enter the value of target");  
		int val = scanner.nextInt();
		for(int i=0;i<size;i++) {
			sum=sum+arr[i]; 
			if (sum >= val) {
				System.out.println("Target achieved after "+ (i + 1) + " transactions ");
				flag = 1;
				break;
			}
		}
	
		if (flag==0)
		System.out.println("Given target is not achieved");
	

}}}
