package project;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String mode_num = null;
		int result = 0;
		System.out.println();
		System.out.println("===========	Hangman Game	===========");
		System.out.println();
		System.out.println("	1 easy | 2 ordinary | 3 hard");
		System.out.println("	4 rule | 5 exit | 6 etc");
		
		while(mode_num != "exit") {
			System.out.println();
			System.out.print("�Է� : ");
			mode_num = input.nextLine();
			result = 10;
			
			switch(mode_num) {
			case "1":
				Easy Easy_mode = new Easy();
				result = Easy_mode.playGame();
				break;
				
			case "2":
				Ordinary Ordin_mode = new Ordinary();
				result = Ordin_mode.playGame();
				break;
				
			case "3":
				Hard Hard_mode = new Hard();
				result = Hard_mode.playGame();
				break;
				 
			case "4":
				System.out.println("���� ��");
				System.out.println("1 : ��Ʈ ��� ����");
				System.out.println("2 : ��ƮX, ����� ���� �ܾ�");
				System.out.println("3 : ��ƮX, ����� �ܾ�");
				break;
				
			case "5":
				System.out.println("��� ���� ����");
				mode_num = "exit";
				break;
				
			case "6":
				System.out.println("github : ");
				break;
				
			default:
				System.out.println("�ٽ� Ȯ���� �� �Է����ּ���.");
				break;
			}
		}
		
		System.out.println();
		if(result <= 2) {
			System.out.println("���� õ��");
		}else if(result <= 4) {
			System.out.println("��");
		}else if(result <= 6) {
			System.out.println("4���");
		}else if(result == 7) {
			System.out.println("�ʰ� �׿���");
		}
	}
}