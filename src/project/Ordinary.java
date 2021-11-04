package project;

import java.util.*;
import java.io.*;

public class Ordinary extends Hangman{ // hangman Ŭ���� ���
	
	static final Scanner in = new Scanner(System.in);
	static List<String> words = getStandardWords();
	static List<String> meanings = getStandardMeanings();
	
	static List<String> getStandardWords(){
		List<String> word = new ArrayList<>();
	    word.add("chicken");
		
		return word;
	}
	
	static List<String> getStandardMeanings() {
	    List<String> meaning = new ArrayList<>();
	    meaning.add("��");
		return meaning;
	}

	public Ordinary() throws IOException{
		System.out.println("\n===========	Ordinary Mode	===========");
		
		Random r = new Random(); 
		int randomNum = Math.abs(r.nextInt() % words.size()); // ���� ����
		
		hiddenString = words.get(randomNum); // ������ ����� �迭 �� �ϳ��� ����
		hiddenString_mean = meanings.get(randomNum);
	}
	
	public char readChar() throws IOException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String user;
		
		System.out.println("");
		System.out.println("�ǹ� : " + hiddenString_mean);
		
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
