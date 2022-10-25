package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		
		
		char mainChoice;
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		//Product productList[] = new Product[3];
		ArrayList<Product> productList= new ArrayList<Product>();
		
		do {
			System.out.println("1. Create Product  2. Display Product");
			int choice = scanner.nextInt();
			switch(choice)
			{
				case 1:
					productList.add(service.createProduct());
					index++;
					break;
				case 2: Service.displayProductDetails(productList);
					
						break;
			}
			System.out.println("Do you want to continue(y/n)");
			mainChoice=scanner.next().charAt(0);
			
			
		}
		
		while(mainChoice=='y');
		
	}

}
