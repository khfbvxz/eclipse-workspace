
package net.bit.day06;

public class Bit02 {

	
	public static void main(String[] args) {
		int a = 6 , hap = 0 , b = 6 , tot = 0;
		hap = (a++) - 2 ; // �ܵ����� 
		tot = (++b) - 2;
		System.out.println("a = "+ a + "hap = "+ hap);
		System.out.println("b = "+ b + "tot = "+ tot);

	}

}
