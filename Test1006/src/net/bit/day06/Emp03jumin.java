package net.bit.day06;

import java.util.Scanner;

public class Emp03jumin {
	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 >>>");
		int jumin = input.nextInt();
		// 문장처리 꼭 출력!! 예외처리 ㅠㅠ
		// 문장처리 1 
//		try {
		System.out.println("당신의 주민번호는 "+jumin+" 입니다." );
		input.close();

		System.out.println();
			int dan = 7 ;
			for(int i = 1; i<10;i++) {
				System.out.println(jumin + "*"+i+"="+(dan*i));
				try{Thread.sleep(300);}catch(Exception ex) {}
//				Thread.sleep(300);
			}
		System.out.println();
		System.out.println("비트캠프");
		System.out.println("우리나라");
		System.out.println("금수강산");
	}
}
