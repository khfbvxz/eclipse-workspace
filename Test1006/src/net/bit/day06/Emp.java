package net.bit.day06;

import java.util.Scanner;

public class Emp {
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.print("급여 입력 >>>");
//		int pay = input.nextInt();
		String pay = input.nextLine();
		System.out.print("이름 입력 >>>");
		String name = input.nextLine();
		
		
		System.out.println();
		System.out.println("이름="+name+" 급여="+pay);
	}
}
