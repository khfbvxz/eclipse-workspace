package net.bit.dat07;

public class Test0String {
	public static void main(String[] args) {
		// startsWith  endsWith indexOf length  substring
		String jumin = "951230-2693485";
		
		//substring() �̿� for �̿�
		String frist = jumin.substring(0,7);
		String second = jumin.substring(0,8);
		System.out.print(frist);
		for(int i=0;i<(jumin.length()-frist.length());i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(second);
		for(int i=0;i<(jumin.length()-second.length());i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("==============");
		System.out.println("951230-*******");
		System.out.println("951230-2******");
		
	}
}
