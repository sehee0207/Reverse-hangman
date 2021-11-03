package project;

import java.io.IOException;
import java.util.Scanner;

public class Hangman {
	String hiddenString;		// 문제
	StringBuffer outputString;	// 입력에 따른 결과로 보여줄 문자열
	StringBuffer inputString;	// 입력한 문자
	int remainder;				// 맞추지 못해서 남아있는 문자의 개수
	int failed; 				// 실패한 횟수
	
//	public Hangman() throws IOException{
//		hiddenString = "hello";
//	}
	
	public int playGame() throws IOException{
		outputString = new StringBuffer(); // 문자열의 저장 및 변경을 위한 메모리 공간을 지닌 클래스
		
		for(int i=0;i<hiddenString.length();i++) { // 문제의 문자수만큼 '_' 출력
			outputString.append('_');
	}
		
	inputString = new StringBuffer();  // 입력한 문자
	remainder = hiddenString.length(); // 남아있는 문자의 개수 == 문자의 길이
	failed = 0;						   // 실패한 횟수 0
	
	System.out.println("\n단어(글자수: " + hiddenString.length() + ") : " + outputString);
	
	drawMan();
	
	do {
		checkChar(readChar());
		System.out.println("\n단어(글자수: " + hiddenString.length() + ") : " + outputString);
		
		drawMan(); // 행맨 그리기 함수
		
	}while((remainder>0)&&(failed<7)); // 남아있는 글자 수가 없거나, 7번 넘게 틀렸을 때 반복문 중단
	
	System.out.println("정답은 " + hiddenString + "이였습니다"); // 정답 출력
	
	return failed;
}
	
	public void checkChar(char guess) {
		boolean already = false;
		for(int i = 0;i<inputString.length();i++) {
			if(inputString.charAt(i) == guess) {
				System.out.println("\n이미 입력한 문자입니다! 다시 입력해주세요!!"); // 이미 입력한 문자인지 확인하는 함수
				already=true;
			}
		}
		
		if(!already) {
			inputString.append(guess);
			
			boolean success = false;
			for(int i=0;i<hiddenString.length();i++) {
				if(hiddenString.charAt(i)==guess) {  	// 입력한 문자가 들어가는 문자라면
					outputString.setCharAt(i, guess); 	// (수정할 문자의 인덱스, 새로운 값)
					remainder--;						// 남아있는 문자의 개수 --
					success = true;
				}
			}
			
			if(!success) { // 이미 입력한 문자도 아니고 들어가지 않는 문자일때
				System.out.println("오 이런! " + guess + "는 단어에 들어가지 않는 알파벳입니다. 다시 맞춰보세요.");
				failed++; // 실패 횟수 1 ++
			}
		}
	}
	
	public void drawMan() {
		
		System.out.println("    ________");
		System.out.println("    |	  |");

	 	switch(failed) { // 실패 횟수에 따라 부위가 하나씩 사라짐
	 	case 0: 
	 		System.out.println("    ●  	  |");
 			System.out.println("   /ㅣ\\	  |");
 			System.out.println("    ㅣ  	  |");
 			System.out.println("   / \\    |");
 			System.out.println("목숨이 "+(7 - failed) + "개 남았습니다\n");
 			break;
				
 		case 1:
 			System.out.println("    ●  	  |");
 			System.out.println("   /ㅣ\\	  |");
 			System.out.println("    ㅣ  	  |");
 			System.out.println("   /      |");
 			System.out.println("목숨이 "+(7 - failed) + "개 남았습니다\n");
 			break;
			
 		case 2:
 			System.out.println("    ●  	  |");
 			System.out.println("   /ㅣ\\	  |");
 			System.out.println("    ㅣ  	  |");
 			System.out.println("          |");
 			System.out.println("목숨이 "+(7 - failed) + "개 남았습니다\n");
 			break;
			
 		case 3:
 			System.out.println("    ●  	  |");
 			System.out.println("   /ㅣ\\	  |");
 			System.out.println("          |");
 			System.out.println("          |");
 			System.out.println("목숨이 "+(7 - failed) + "개 남았습니다\n");
 			break;
			
 		case 4:
 			System.out.println("    ●  	  |");
 			System.out.println("   /ㅣ	  |");
 			System.out.println("          |");
 			System.out.println("          |");
 			System.out.println("목숨이 "+(7 - failed) + "개 남았습니다\n");
 			break;
			
 		case 5:
 			System.out.println("    ●  	  |");
 			System.out.println("    ㅣ	  |");
 			System.out.println("          |");
 			System.out.println("          |");
 			System.out.println("목숨이 "+(7 - failed) + "개 남았습니다\n");
 			break;
			
 		case 6:
 			System.out.println("    ●  	  |");
 			System.out.println("          |");
 			System.out.println("          |");
 			System.out.println("          |");
 			System.out.println("목숨이 "+(7 - failed) + "개 남았습니다\n");
 			break;
			
 		case 7:
 			System.out.println("   G O	  |");
 			System.out.println("   A V    |");
 			System.out.println("   M E    |");
 			System.out.println("   E R    |");	
 			break;
		 	}
		 }
	
	public char readChar() throws IOException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String user;
		
		System.out.println("알파벳을 하나 입력하세요: ");
		user = in.nextLine();
		return user.charAt(0);
	}
}
