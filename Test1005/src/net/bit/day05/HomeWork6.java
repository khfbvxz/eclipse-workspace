package net.bit.day05;

// 1 2 3 4 6 7 8 9 10 hap = 50
public class HomeWork6 {
	public static void main(String[] args) {
		int a = 0 ,b = 0 , c =0;
		int hap = 0 , tot = 0, sum = 0;
		System.out.println("for반복문");
		for (int i = 0 ; i <10 ; i=i+1) {
			if (i==4) {
				continue;
			}
			a = i+1;
			System.out.print(a+"  ");
			hap = hap+a;
			
		}System.out.println("hap = "+hap);
		
		System.out.println("while반복문");
		int i = 0;
		while(i<10) {
			i=i+1;
			if (i==5) {continue;}
			b=i;
			System.out.print(b+"  ");
			tot = tot +b;
		}System.out.println("tot = "+tot);
		
		System.out.println("do~while반복문");
		int j =0;
		do {
			j=j+1;
			if (j==5) {continue;}
			c=j;
			System.out.print(c + "  ");
			sum = sum + c;
		}while(j<10);
		System.out.println("sum = "+sum);
	}
}// class END
