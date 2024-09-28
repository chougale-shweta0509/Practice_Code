package demo;

import java.util.Scanner;

public class MinDiscountItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		//variables for minimum tracking 
		String minDiscountItem = null;
		double minDiscount = Double.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			String[] itemDetail = sc.nextLine().split(",");
			String itemName = itemDetail[0];
			double itemPrice = Double.parseDouble(itemDetail[1]);
			int percentage = Integer.parseInt(itemDetail[2]);
			
			//calculating discount
			double discountAmt = (percentage / 100.00) * itemPrice;
			
			if(discountAmt < minDiscount) {
				minDiscount = discountAmt;
				minDiscountItem = itemName;
			}
		}
		System.out.println(minDiscountItem);
	}

}
