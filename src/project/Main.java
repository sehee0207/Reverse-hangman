package project;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Hangman2 hangman = new Hangman2(); // hangman2 Ŭ������ ��ü ����
		Scanner mode = new Scanner(System.in);
		String mode_num;
		System.out.println();
		System.out.println("=============== Hangman Game ===============");
		System.out.println();
		System.out.println("1 easy | 2 ordinary | 3 hard");
		System.out.println("�Է� : ");
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
			System.out.println("���� õ��");
		}else if(result <= 4) {
			System.out.println("��");
		}else if(result <= 6) {
			System.out.println("4���");
		}else {
			System.out.println("�ʰ� �׿���");
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
//		System.out.println("(1)�������� ��� (2)hard ��� (3)easy ���");
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
//				System.out.println("�Ƴ��ϼ���");
//			}
//
//		static void page3() {
//				System.out.println("�Ƴ��ϼ���");
//			}
//
//		static void page4() {
//				System.out.println("�Ƴ��ϼ���");
//			}		
//}