package net.bit.dat07;

public class HomeWork05 {
	public static void main(String[] args) {
		// startsWith  endsWith indexOf length  substring
		String jumin = "951230-2693485";
		//문제 성별 구별  1 ,3 2 4  char 리턴값 charAt(int)
		//문제 성별 구별  String 리턴값 substring(시작 , 끝+1)
		String gender = jumin.substring(7,8);
		int genderNum = Integer.parseInt(gender);
//		System.out.println(gender);
		if (genderNum ==1 || genderNum == 3) {
			System.out.println("납자입니다");
		}
		else if(genderNum ==2 || genderNum == 4) {
			System.out.println("여자입니다");
		}
		else 
			System.out.println("당신은 외게인~");

	} // main end 
} // class end
