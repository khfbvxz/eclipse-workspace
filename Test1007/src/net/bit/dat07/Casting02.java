package net.bit.dat07;

public class Casting02 {
	public static void main(String[] args) {
		char upper = 'A';
		char lower = 'a';
		
		System.out.println(upper);			// 출력값 : A(65)
		System.out.println(lower);			// 출력값 : a(97)
		System.out.println(upper + lower);	// 출력값 : 162
		
		// 대문자(upper)를 소문자로 바꾸어서 출력하시오.
		System.out.println((char)(upper + 32));
		
	} // main()
} // class