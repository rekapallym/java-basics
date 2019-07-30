import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		System.out.println("Hello world");
		values();
		lbToKg();
		ifelse();
		switchs();
		assignment1();

	}
	
	public static void values() {
		int i = 500;
		short s = 10;
		byte b = 30;
		long l = 70000 + 15*i + s +b;
		System.out.println(l);
	}
	
	public static void lbToKg() {
		int lb = 100;
		double kgs = lb * 0.45359237;
		System.out.println("100lbs is equal to: " + kgs);
		
	}
	public static void ifelse() {
		double d= 20;
		double d2 = 80;
		double sum = (d+d2)* 25;
		System.out.println("sum equals to:  " + sum);
		double reminder = sum%40;
		if( reminder <= 20) {
			System.out.println("Total was over the limit");
		}
		
	}
	
	public static void switchs() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a letter");
		char c = scan.next().charAt(0);
		switch (Character.toLowerCase(c)) {
		case 'a':
			System.out.println("apple");
			break;
		case 'b':
			System.out.println("banana");
			break;
		case 'c': 
			System.out.println("orange");
			break;
		case 'd':
			System.out.println("dragonfruit");
			break;
		case 'e':
			System.out.println("elderbery");
			break;
		default:
			System.out.println("whatever");
			break;
		}
	}
	
	public static void assignment1() {
		System.out.println("enter your first no");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("enter your second no");
		int num2 = scan.nextInt();
		int sum = 0;
		for (int i = num1+1; i< num2 ; i++) {
			sum = sum +i;
			System.out.println("the numbers between your range: " + i);	
		}
		System.out.println(sum);
		
	}

}
