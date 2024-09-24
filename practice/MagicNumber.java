//package demo.practice;
//
//import java.util.Scanner;
//
//public class MagicNumber {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the num");
//		int num = sc.nextInt();
//	
//		if(num <= 0) {
//			System.out.println("Enter positive no");
//			return;
//		}
//		
//		if(isMagicNumber(num)) {
//			System.out.println(num+" Magic No");
//		}else {
//			System.out.println(num+" Not Magic No");
//		}
//		
//		public static boolean isMagicnumber(int num) {
//			
//			int sum = num;
//			//continue until get single digit
//			while(sum > 9) {
//				sum = sumDigits(sum);
//			}
//			//check whether it is 1 
//			return sum == 1;
//		}
//		
//		public static int sumDigit(int num) {
//			int sum = 0;
//			while(num != 0) {
//				sum += num % 10;
//				num = num / 10;
//			}
//			return sum;
//			
//		}
//		
//	}
//
//}
