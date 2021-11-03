package project;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Hangman2 hangman = new Hangman2(); // hangman2 클래스의 객체 생성
		Scanner mode = new Scanner(System.in);
		String mode_num;
		System.out.println();
		System.out.println("=============== Hangman Game ===============");
		System.out.println();
		System.out.println("1 easy | 2 ordinary | 3 hard");
		System.out.println("입력 : ");
		mode_num = mode.nextLine();
		
		switch(mode_num) {
		case 1:
			int result = hangman.playGame();
			break;
			
		case 2:
			int result = hangman.playGame();
			break;
			
		case 3:
			int result = hangman.playGame();
		}
		
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

//public class Main {
//	
//	public static void main(String[] args) throws IOException{
//		
//	}
//	}
//	
//	static Scanner scan = new Scanner(System.in);
//	
//	static void page1() {
//
//		System.out.println();
//		System.out.println("============= Hangman Game ============");
//		System.out.println();
//		System.out.println("(1)오리지널 행맨 (2)hard 행맨 (3)easy 행맨");
//		System.out.println();
//		System.out.println("============================================");
//
//		int input = scan.nextInt();
//		System.out.println();
//
//		switch (input) {
//		case 1:
//			page2();
//			break;
//
//		case 2:
//			page3();
//			break;
//
//		case 3:
//			page4();
//		}
//	}
//
//		static void page2() {
//				System.out.println("아녕하세요");
//			}
//
//		static void page3() {
//				System.out.println("아녕하세요");
//			}
//
//		static void page4() {
//				System.out.println("아녕하세요");
//			}		
//}