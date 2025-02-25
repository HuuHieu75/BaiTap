package Javatest;

import java.util.Scanner;

public class BT1a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chiều Dài a: ");
		int a = sc.nextInt();

		System.out.println("Chiều Rộng b: ");
		int b = sc.nextInt();
		System.out.println("Chu vi hình chữ nhật (a+b)2= " + (a + b) * 2);
		System.out.println("Diện tích HCN axb= " + a * b);
		System.out.println("Cạnh nhỏ nhất: " + Math.min(a, b));
	}

}
