package net.bit.day06;

public class Star01 {
	public static void main(String[] args) {
		// 문제 이중 for or 이중 while
		/* ★
		 * ★★
		 * ★★★
		 * ★★★★
		 * ★★★★★
		 */
		String star = "★";
		for(int i = 0 ; i<5 ; i ++) {
			for(int j = 0 ; j<i+1 ; j++) {System.out.print(star);}
				System.out.println();
		}
		System.out.println();
		for(int i = 0 ; i<5 ; i ++) {
			for(int j = 5 ; j>i ; j--) {System.out.print(star);}
				System.out.println();
		}
	} // main END
} // class END
