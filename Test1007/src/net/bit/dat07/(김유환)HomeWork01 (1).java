package net.bit.dat07;

import java.util.Scanner;

public class HomeWork01 {
	public static void main(String[] args) {
		int a = 19, b = 0, hap = 0, sub = 0, gob = 0, mok = 0, nmg = 0;
		// ���� 1 b�� 0�ϋ�
		hap = a + b;
		System.out.printf("%d+%d=%d\n", a, b, hap);
		sub = a - b;
		System.out.printf("%d-%d=%d\n", a, b, sub);
		gob = a * b;
		System.out.printf("%d*%d=%d\n", a, b, gob);
		try {
			mok = a / b;
			System.out.printf("%d/%d=%d\n", a, b, mok);
		} catch (ArithmeticException ex) {
			System.out.println("���� 0 �̷δ� ���� �� �����ϴ�.b�� �ٲټ���");
		}
		try {
			nmg = a % b;
			System.out.printf("%d%%%d=%d\n", a, b, nmg);

		} catch (Exception ex) {
			System.out.println("0���� �������� ���� �� �����ϴ�. b�� �ٲټ���");
		}

		System.out.println();
		int dan = 0;
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("�� �Է�>>");
				dan = Integer.parseInt(input.nextLine()); /// }
				if(dan>=1)break;
			} catch (Exception ex) {
				System.out.println("������ �Է��ϼ���");
			}
		}
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}

		String[] city = { "���ֵ�", "������", "�緮��", "���ǵ�", "������", "����" };
		System.out.println("�������� ��Ƽ�� ������ �Է��ϼ���");
//		int index =0;
		try {
//			index = Integer.parseInt(input.nextLine());
			System.out.println(city[1]);
			System.out.println(city[2]);
			System.out.println(city[7]);
		}
		catch (Exception ex) {
			System.out.println("�迭�� ������ ������ϴ�. �迭�� ������ 0 ~ " + (city.length - 1) + "�Դϴ�");
		}
//		System.out.println(city[index]);

		for (String my : city) {
			// 1. �ذ�
			try {
				Thread.sleep(300);
			} catch (Exception ex) {
			}
			;
			System.out.println(my + " ");
		}

	}// main end
}// class end
