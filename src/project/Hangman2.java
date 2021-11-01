package project;

import java.util.*;
import java.io.*;

public class Hangman2 extends Hangman{ // hangman 클래스 상속
	
// https://stackoverflow.com/questions/36299122/method-add-in-arraylistclassname-is-not-applicable-for-the-arguments-string
	
//	static List<String> getStandarWords(){
//		
//		ArrayList<String> words = new ArrayList<String>();
//		
//		FileInputStream wordlist = new FileInputStream("/Reversehangman/word");
//		InputStreamReader word = new InputStreamReader(wordlist, "MS949");
//	    BufferedReader br1 = new BufferedReader(word);
//		for(int i=0;i<words.size()+1;i++) {
//			String str = new String();
//			str.set
//			words.add(null);
//		}
//		
//		ArrayList<String> meanings = new ArrayList<String>();
//		
//		FileInputStream meanlist = new FileInputStream("/Reversehangman/mean");
//		InputStreamReader mean = new InputStreamReader(meanlist, "MS949");
//	    BufferedReader br2 = new BufferedReader(mean);
//		for(int i=0;i<meanings.size()+1;i++) {
//			meanings.add(br2);
//		}
//		
//	}
	
	for(int i=0;i<word.size();i++) {
		
	}
	
	String[] words = { "fever" };
	String[] meaning = { "열" };
	
	public Hangman2() throws IOException{
		
		System.out.println("행맨 게임 시작하빈다"); // 게임 시작 문구
		
		Random r = new Random(); 
		int randomNum = Math.abs(r.nextInt() % words.length); // 난수 생성
		
		hiddenString = words[randomNum]; // 문제가 저장된 배열 중 하나를 선택
		
		System.out.println("의미 : " + meaning[randomNum]);
	}
	
	public char readChar() throws IOException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String user;
		
		do {
//			System.out.println("알파벳을 하나 입력하세요 (*힌트를 원하면 ? 입력 ): ");
			System.out.println("알파벳을 하나 입력하세요: ");
			user = in.nextLine(); // 키보드로부터 입력 받기
			
//			if(user.charAt(0) == '?') { // 입력 문자가 ? 인 경우에
//				boolean givehint = false;
//				int i = 0;
//				while(!givehint) {
//					if(outputString.charAt(i) == '_') { // 못 맞힌 문자(지금은 _ 인) 를 힌트로 출력하기
//						System.out.println();
//						System.out.println("힌트 : " + hiddenString.charAt(i));
//						System.out.println();
//						failed++;
//						givehint = true;
//					}
//					i++;
//				}
//			}
		}while(user.charAt(0) == '?');
		
		return user.charAt(0);
	}
}
