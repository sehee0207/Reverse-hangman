package project;

import java.util.*;
import java.io.*;

public class Hangman2 extends Hangman{ // hangman Ŭ���� ���
	
	static final Scanner in = new Scanner(System.in);
	static List<String> words = getStandardWords();
	static List<String> meanings = getStandardMeanings();

	
	static List<String> getStandardWords() {
	    List<String> word = new ArrayList<>();
	    word.add("fish");
	    word.add("chicken");
	    word.add("icecream");
		return word;
	}
	
	static List<String> getStandardMeanings() {
	    List<String> meaning = new ArrayList<>();
	    meaning.add("����");
	    meaning.add("��");
	    meaning.add("���̽�ũ��");
		return meaning;
	}

	public Hangman2() throws IOException{
		
		System.out.println("��� ���� �����Ϻ��"); // ���� ���� ����
		
		Random r = new Random(); 
		int randomNum = Math.abs(r.nextInt() % words.size()); // ���� ����
		
		hiddenString = words.get(randomNum); // ������ ����� �迭 �� �ϳ��� ����
		
		System.out.println("�ǹ� : " + meanings.get(randomNum));
		
//		Random r = new Random();
	}
	
	public char readChar() throws IOException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String user;
		
		do {
//			System.out.println("���ĺ��� �ϳ� �Է��ϼ��� (*��Ʈ�� ���ϸ� ? �Է� ): ");
			System.out.println("���ĺ��� �ϳ� �Է��ϼ���: ");
			user = in.nextLine(); // Ű����κ��� �Է� �ޱ�
			
//			if(user.charAt(0) == '?') { // �Է� ���ڰ� ? �� ��쿡
//				boolean givehint = false;
//				int i = 0;
//				while(!givehint) {
//					if(outputString.charAt(i) == '_') { // �� ���� ����(������ _ ��) �� ��Ʈ�� ����ϱ�
//						System.out.println();
//						System.out.println("��Ʈ : " + hiddenString.charAt(i));
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
