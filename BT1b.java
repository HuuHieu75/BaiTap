package Javatest;

import java.util.Scanner;

public class BT1b {
	public static void main(String[] args) {
		System.out.println("Nhap canh: ");
		Scanner sc = new Scanner(System.in);
		int canh = sc.nextInt();
		double thetich = Math.pow(canh, 3);
		System.out.println("The tich hinh lap phuong la: " + thetich);
	}
}
