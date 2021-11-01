package project;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		Hangman2 hangman = new Hangman2(); // hangman2 클래스의 객체 생성
		
		int result = hangman.playGame(); // 게임 실행
		
		System.out.println();
		if(result <= 2) {
			System.out.println("영어 천재");
		}else if(result <= 4) {
			System.out.println("흠");
		}else if(result <= 6) {
			System.out.println("4등급");
		}else {
			System.out.println("너가 죽였어");
		}
	}
}
