package project;

import java.util.*;
import java.io.*;

public class Hard extends Hangman{ // hangman Ŭ���� ���
	
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
	    meaning.add("���̽�ũ��");
		return meaning;
	}

	public Hard() throws IOException{
		System.out.println("\n===========	Hard Mode	===========");
		
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
			System.out.println("���ĺ��� �ϳ� �Է��ϼ���: ");
			user = in.nextLine(); // Ű����κ��� �Է� �ޱ�
		}while(user.charAt(0) == '?');
		
		return user.charAt(0);
	}
}
