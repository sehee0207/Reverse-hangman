package project;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		Hangman2 hangman = new Hangman2();
		
		int result = hangman.playGame();
		
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
