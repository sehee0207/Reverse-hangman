package project;

import java.util.*;
import java.io.*;

public class Hard extends Hangman{ // hangman 클래스 상속
	
	static final Scanner in = new Scanner(System.in);
	static List<String> words = getStandardWords();
	static List<String> meanings = getStandardMeanings();
	
	static List<String> getStandardWords(){
		List<String> word = new ArrayList<>();
	    word.add("icecream");
		
		return word;
	}
	
	static List<String> getStandardMeanings() {
	    List<String> meaning = new ArrayList<>();
	    meaning.add("아이스크림");
		return meaning;
	}

	public Hard() throws IOException{
		System.out.println("\n===========	Hard Mode	===========");
		
		Random r = new Random(); 
		int randomNum = Math.abs(r.nextInt() % words.size()); // 난수 생성
		
		hiddenString = words.get(randomNum); // 문제가 저장된 배열 중 하나를 선택
		
		System.out.println("의미 : " + meanings.get(randomNum));
		
//		Random r = new Random();
	}
	
	public char readChar() throws IOException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String user;
		
		do {
			System.out.println("알파벳을 하나 입력하세요: ");
			user = in.nextLine(); // 키보드로부터 입력 받기
		}while(user.charAt(0) == '?');
		
		return user.charAt(0);
	}
}
