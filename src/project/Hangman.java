package project;

import java.io.IOException;
import java.util.Scanner;

public class Hangman {
	String hiddenString;		// ����
	StringBuffer outputString;	// �Է¿� ���� ����� ������ ���ڿ�
	StringBuffer inputString;	// �Է��� ����
	int remainder;				// ������ ���ؼ� �����ִ� ������ ����
	int failed; 				// ������ Ƚ��
	
//	public Hangman() throws IOException{
//		hiddenString = "hello";
//	}
	
	public int playGame() throws IOException{
		outputString = new StringBuffer(); // ���ڿ��� ���� �� ������ ���� �޸� ������ ���� Ŭ����
		
		for(int i=0;i<hiddenString.length();i++) { // ������ ���ڼ���ŭ '_' ���
			outputString.append('_');
	}
		
	inputString = new StringBuffer();  // �Է��� ����
	remainder = hiddenString.length(); // �����ִ� ������ ���� == ������ ����
	failed = 0;						   // ������ Ƚ�� 0
	
	System.out.println("\n�ܾ�(���ڼ�: " + hiddenString.length() + ") : " + outputString);
	
	drawMan();
	
	do {
		checkChar(readChar());
		System.out.println("\n�ܾ�(���ڼ�: " + hiddenString.length() + ") : " + outputString);
		
		drawMan(); // ��� �׸��� �Լ�
		
	}while((remainder>0)&&(failed<7)); // �����ִ� ���� ���� ���ų�, 7�� �Ѱ� Ʋ���� �� �ݺ��� �ߴ�
	
	System.out.println("������ " + hiddenString + "�̿����ϴ�"); // ���� ���
	
	return failed;
}
	
	public void checkChar(char guess) {
		boolean already = false;
		for(int i = 0;i<inputString.length();i++) {
			if(inputString.charAt(i) == guess) {
				System.out.println("\n�̹� �Է��� �����Դϴ�! �ٽ� �Է����ּ���!!"); // �̹� �Է��� �������� Ȯ���ϴ� �Լ�
				already=true;
			}
		}
		
		if(!already) {
			inputString.append(guess);
			
			boolean success = false;
			for(int i=0;i<hiddenString.length();i++) {
				if(hiddenString.charAt(i)==guess) {  	// �Է��� ���ڰ� ���� ���ڶ��
					outputString.setCharAt(i, guess); 	// (������ ������ �ε���, ���ο� ��)
					remainder--;						// �����ִ� ������ ���� --
					success = true;
				}
			}
			
			if(!success) { // �̹� �Է��� ���ڵ� �ƴϰ� ���� �ʴ� �����϶�
				System.out.println("�� �̷�! " + guess + "�� �ܾ ���� �ʴ� ���ĺ��Դϴ�. �ٽ� ���纸����.");
				failed++; // ���� Ƚ�� 1 ++
			}
		}
	}
	
	public void drawMan() {
		
		System.out.println("    ________");
		System.out.println("    |	  |");

	 	switch(failed) { // ���� Ƚ���� ���� ������ �ϳ��� �����
	 	case 0: 
	 		System.out.println("    ��  	  |");
 			System.out.println("   /��\\	  |");
 			System.out.println("    ��  	  |");
 			System.out.println("   / \\    |");
 			System.out.println("����� "+(7 - failed) + "�� ���ҽ��ϴ�\n");
 			break;
				
 		case 1:
 			System.out.println("    ��  	  |");
 			System.out.println("   /��\\	  |");
 			System.out.println("    ��  	  |");
 			System.out.println("   /      |");
 			System.out.println("����� "+(7 - failed) + "�� ���ҽ��ϴ�\n");
 			break;
			
 		case 2:
 			System.out.println("    ��  	  |");
 			System.out.println("   /��\\	  |");
 			System.out.println("    ��  	  |");
 			System.out.println("          |");
 			System.out.println("����� "+(7 - failed) + "�� ���ҽ��ϴ�\n");
 			break;
			
 		case 3:
 			System.out.println("    ��  	  |");
 			System.out.println("   /��\\	  |");
 			System.out.println("          |");
 			System.out.println("          |");
 			System.out.println("����� "+(7 - failed) + "�� ���ҽ��ϴ�\n");
 			break;
			
 		case 4:
 			System.out.println("    ��  	  |");
 			System.out.println("   /��	  |");
 			System.out.println("          |");
 			System.out.println("          |");
 			System.out.println("����� "+(7 - failed) + "�� ���ҽ��ϴ�\n");
 			break;
			
 		case 5:
 			System.out.println("    ��  	  |");
 			System.out.println("    ��	  |");
 			System.out.println("          |");
 			System.out.println("          |");
 			System.out.println("����� "+(7 - failed) + "�� ���ҽ��ϴ�\n");
 			break;
			
 		case 6:
 			System.out.println("    ��  	  |");
 			System.out.println("          |");
 			System.out.println("          |");
 			System.out.println("          |");
 			System.out.println("����� "+(7 - failed) + "�� ���ҽ��ϴ�\n");
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
		
		System.out.println("���ĺ��� �ϳ� �Է��ϼ���: ");
		user = in.nextLine();
		return user.charAt(0);
	}
}
