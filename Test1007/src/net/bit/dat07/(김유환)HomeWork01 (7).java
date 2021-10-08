package net.bit.dat07;

public class HomeWork04 {
	public static void main(String[] args) {
		// startsWith()  endsWith() indexOf() length()  substring()
		String email = "bitcamp@sm.com";
		//문제 1 메일 자릿수 12~20 자릿 수 체크
		//문제 2 메일 끝도메인 .com 체크 ends
		//문제 3 메일 @ 포함 여부 indexOf("@")
		
		//문재 1
		if(email.length()>20 || email.length()<12) {
			System.out.println("이메일의 잘못 입력하였습니다.");
		}
		else {
			System.out.println("메일 정상 입력 됬습니다.");
		}
		System.out.println();
		//문재 2
		boolean ret1 = email.endsWith(".com");
		if (ret1!=true){
			System.out.println("도메인 입력이 잘못되었습니다.");
		}
		else {
			System.out.println("정상 도메인 입력 됬습니다.");
		}
		System.out.println();
		//문재3
		int num1 = email.indexOf("@");
		if (num1 != -1){
			System.out.println("@ 가 없습니다.");
		}
		else {
			System.out.println("@ 가 있어요");
		}
		System.out.println();
//		String email_ja = email.substring(0,num1);
//		if ( email_ja<)

//		System.out.println(num1);
		
		///강사님 풀이
		int emailLen = email.length();
		if(emailLen<12||emailLen>20) {
			System.out.println("입력하신 메일데이터가 이상합니다\n재입력부탁드립니다.");
//			return;
		}
		boolean re1 = email.endsWith("com");// 만족하지 않으면 false
		int re2 = email.indexOf("@");  // 데이터 없으면 -1
		if ( re1 == true && re2 != -1) {
			System.out.println("메일 체크 확인 성공했습니다.");
		}else {
			System.out.println("메일체크 확인 실패했습니다.\n스팸메일 가능성이 있으니 재입력부탁드립니다.");
		}
		
		
	}
}
