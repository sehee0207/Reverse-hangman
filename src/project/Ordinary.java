package project;

import java.util.*;
import java.io.*;

public class Ordinary extends Hangman{ // hangman 클래스 상속
	
	static final Scanner in = new Scanner(System.in);
	static List<String> words = getStandardWords();
	static List<String> meanings = getStandardMeanings();
	
	static List<String> getStandardWords(){
		List<String> word = new ArrayList<>();
	    word.add("chicken");
		
		return word;
	}
	
	static List<String> getStandardMeanings() {
	    List<String> meaning = new ArrayList<>();
	    meaning.add("닭");
		return meaning;
	}

	public Ordinary() throws IOException{
		System.out.println("\n===========	Ordinary Mode	===========");
		
		Random r = new Random(); 
		int randomNum = Math.abs(r.nextInt() % words.size()); // 난수 생성
		
		hiddenString = words.get(randomNum); // 문제가 저장된 배열 중 하나를 선택
		hiddenString_mean = meanings.get(randomNum);
	}
	
	public char readChar() throws IOException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String user;
		
		System.out.println("");
		System.out.println("의미 : " + hiddenString_mean);
		
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
