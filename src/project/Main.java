package project;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String mode_num = null;
		int result = 0;
		
		while(mode_num != "exit") {
			System.out.println();
			System.out.println("===========	Hangman Game	===========");
			System.out.println();
			System.out.println("	1 easy | 2 ordinary | 3 hard");
			System.out.println("	4 rule | 5 exit | 6 etc");
			System.out.print("입력 : ");
			mode_num = input.nextLine();
			result = 10;
			
			switch(mode_num) {
			case "1":
				Easy Easy_mode = new Easy();
				result = Easy_mode.playGame();
				mode_num = "exit";
				break;
				
			case "2":
				Ordinary Ordin_mode = new Ordinary();
				result = Ordin_mode.playGame();
				mode_num = "exit";
				break;
				
			case "3":
				Hard Hard_mode = new Hard();
				result = Hard_mode.playGame();
				mode_num = "exit";
				break;
				 
			case "4":
				System.out.println("===========	게임 규칙 	===========");
				System.out.println("규칙 : 한글 의미를 보고 영어 철자를 맞추는 게임");
				System.out.println("3가지 모드의 게임이 존재");
				System.out.println("1 : 힌트O, ");
				System.out.println("2 : 힌트X, 어렵지 않은 단어");
				System.out.println("3 : 힌트X, 어려운 단어");
				break;
//				System.out.println("=");​
				
			case "5":
				System.out.println("행맨 게임 종료");
				mode_num = "exit";
				break;
				
			case "6":
				System.out.println("github : https://github.com/sehee0207/Reverse-hangman");
				System.out.println("Sehee & Jisu");
				break;
				
			default:
				System.out.println("다시 확인한 후 입력해주세요.");
				break;
			}
		}
		
		System.out.println();
		if(result <= 2) {
			System.out.println("영어 천재");
		}else if(result <= 4) {
			System.out.println("흠");
		}else if(result <= 6) {
			System.out.println("4등급");
		}else if(result == 7) {
			System.out.println("너가 죽였어");
		}
	}
}