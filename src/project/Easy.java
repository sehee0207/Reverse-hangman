package project;

import java.util.*;
import java.io.*;

public class Easy extends Hangman{ // hangman Ŭ���� ���
	static List<String> words = getStandardWords();
	static List<String> meanings = getStandardMeanings();
	static List<String> getStandardWords(){
		List<String> word = new ArrayList<>();
	    word.add("academy"); word.add("agree"); word.add("against");
	    word.add("basic"); word.add("brave"); word.add("bubble");
	    word.add("certain"); word.add("chain"); word.add("chance");
	    word.add("discuss"); word.add("drink"); word.add("dry");
	    word.add("engine"); word.add("exam"); word.add("elementary");
	    word.add("favorite"); word.add("forest"); word.add("forever");
	    word.add("glove"); word.add("grass"); word.add("guess");
	    word.add("headache"); word.add("hero"); word.add("holiday");
	    word.add("jeans"); word.add("job"); word.add("kill");
	    word.add("know"); word.add("library"); word.add("lunch");
	    word.add("math"); word.add("mirror"); word.add("north");
	    word.add("number"); word.add("only"); word.add("oil");
	    word.add("paper"); word.add("park"); word.add("rainbow");
	    word.add("river"); word.add("salt"); word.add("sister");
	    word.add("thirst"); word.add("tomorrow"); word.add("understand");
	    word.add("umbrella"); word.add("visit"); word.add("voice");
	    word.add("weekend"); word.add("west"); word.add("yellow");
	    word.add("yesterday"); word.add("zebra"); word.add("zoo");
	    return word;
	}
	static List<String> getStandardMeanings() {
	    List<String> meaning = new ArrayList<>();
	    meaning.add("�м���"); meaning.add("�����ϴ�"); meaning.add("~�� �ݴ��Ͽ�");
	    meaning.add("�⺻��"); meaning.add("�밨��"); meaning.add("��ǰ");
	    meaning.add("Ȯ���ϴ�"); meaning.add("�罽"); meaning.add("�쿬");
	    meaning.add("����ϴ�"); meaning.add("���ô�"); meaning.add("����");
	    meaning.add("����"); meaning.add("����"); meaning.add("�⺻��");
	    meaning.add("�����ϴ�"); meaning.add("��"); meaning.add("������");
	    meaning.add("�尩"); meaning.add("Ǯ��"); meaning.add("�����ϴ�");
	    meaning.add("����"); meaning.add("����"); meaning.add("����");
	    meaning.add("û����"); meaning.add("��"); meaning.add("���̴�");
	    meaning.add("�˴�"); meaning.add("������"); meaning.add("����");
	    meaning.add("����"); meaning.add("�ſ�"); meaning.add("����");
	    meaning.add("����"); meaning.add("������"); meaning.add("����");
	    meaning.add("����"); meaning.add("����"); meaning.add("������");
	    meaning.add("��"); meaning.add("�ұ�"); meaning.add("���� ����");
	    meaning.add("����"); meaning.add("����"); meaning.add("�����ϴ�");
	    meaning.add("���"); meaning.add("�湮�ϴ�"); meaning.add("��Ҹ�");
	    meaning.add("�ָ�"); meaning.add("����"); meaning.add("�����");
	    meaning.add("����"); meaning.add("��踻"); meaning.add("������");   
		return meaning;
	}

	public Easy() throws IOException{
		System.out.println("\n===========	Easy Mode	===========");
		
		Random r = new Random(); 
		int randomNum = Math.abs(r.nextInt() % words.size()); // ���� ����
		
		hiddenString = words.get(randomNum); // ������ ����� �迭 �� �ϳ��� ����
		hiddenString_mean = meanings.get(randomNum);
	}
	
	public char readChar() throws IOException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String user;
		
		do {
			System.out.println("");
			System.out.println("�ǹ�: " + hiddenString_mean);
			System.out.print("���ڸ� �Է��ϼ���(��Ʈ�� ? �Է�): ");
			user = in.nextLine(); // Ű����κ��� �Է� �ޱ�
			
			if(user.charAt(0) == '?') { // �Է� ���ڰ� ? �� ��쿡
				boolean givehint = false;
				int i = 0;
				while(!givehint) {
					if(outputString.charAt(i) == '_') { // �� ���� ����(������ _ ��) �� ��Ʈ�� ����ϱ�
						System.out.println("��Ʈ: " + hiddenString.charAt(i));
						System.out.println();
						givehint = true;
					}
					i++;
				}
			}
		}while(user.charAt(0) == '?');
		
		return user.charAt(0);
	}
}
