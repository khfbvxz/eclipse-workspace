package net.bit.day06;

public class Bit04sj {

	public static void main(String[] args) {
		int kor = 50, eng = 85, hap = 0;
		double avg = 0.0;
		String msg = "";
		String grade = "";
		
		hap = kor + eng;
		avg = (double)hap/2.0;
		
		// 문제 1 평균 점수 100~70 점 축합격  0~69점 재시험
		// 문제 평균 점수 70 점 부터 합격, 과목별 60점부터 합격
		if ((avg>=70) || (kor>=60) ||(eng >=60)) {msg="축합격";}
		else {msg="재시험";}
		// 문제 2 평균 100~90 A   0 ~59 F swicth
		// 다중 if 제어문 평균 점수 100~90 점 A 80~ 89 B    
		switch ((int)avg/10) {
		case 10: case 9 :grade = "A"; break;
		case 8:grade = "B"; break;
		case 7:grade = "C"; break;
		case 6:grade = "D"; break;
		default:grade = "F";
		}
		System.out.println("국어 = " + kor);
		System.out.println("영어 = " + eng);
		System.out.println("총점 = " + hap );
		System.out.println("평균 = " + avg );
		System.out.println("결과 = " + msg );
		System.out.println("학점 = " + grade);

	}

}
