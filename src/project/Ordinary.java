package project;

import java.util.*;
import java.io.*;

public class Ordinary extends Hangman{ // hangman Ŭ���� ���
	static List<String> words = getStandardWords();
	static List<String> meanings = getStandardMeanings();
	static List<String> getStandardWords(){
		List<String> word = new ArrayList<>();
		word.add("absolute"); word.add("accommodate"); word.add("behave");
	    word.add("benefit"); word.add("defense"); word.add("eliminate");
	    word.add("emerge"); word.add("flexible"); word.add("forehead");
	    word.add("cause"); word.add("classic"); word.add("define");
	    word.add("grief"); word.add("guilty"); word.add("harsh");
	    word.add("husband"); word.add("immigrate"); word.add("interfere");
	    word.add("justice"); word.add("journey"); word.add("knee");
	    word.add("labor"); word.add("laundry"); word.add("license");
	    word.add("medicine"); word.add("mobile"); word.add("negative");
	    word.add("novel"); word.add("oppose"); word.add("outcome");
	    word.add("persuade"); word.add("phenomenon"); word.add("rough");
	    word.add("rumor"); word.add("sequence"); word.add("supply");
	    word.add("thousand"); word.add("toxic"); word.add("universe");
	    word.add("usual"); word.add("venture"); word.add("vocabulary");
	    word.add("wealth"); word.add("whistle"); word.add("wrong");
	    word.add("yield");
		return word;
	}
	static List<String> getStandardMeanings() {
	    List<String> meaning = new ArrayList<>();
	    meaning.add("������"); meaning.add("�����ϴ�"); meaning.add("�ൿ�ϴ�");
	    meaning.add("����"); meaning.add("���"); meaning.add("�����ϴ�");
	    meaning.add("������"); meaning.add("���θ��� ����"); meaning.add("�̸�");
	    meaning.add("����"); meaning.add("������"); meaning.add("�����ϴ�");
	    meaning.add("���� ����"); meaning.add("������"); meaning.add("��ģ");
	    meaning.add("����"); meaning.add("�����ϴ�"); meaning.add("�����ϴ�");
	    meaning.add("����"); meaning.add("����"); meaning.add("����");
	    meaning.add("�뵿"); meaning.add("��Ź��"); meaning.add("����");
	    meaning.add("��"); meaning.add("�����̱� ����"); meaning.add("��������");
	    meaning.add("�Ҽ�"); meaning.add("�ݴ��ϴ�"); meaning.add("���");
	    meaning.add("�����ϴ�"); meaning.add("�����ϴ�"); meaning.add("��ģ");
	    meaning.add("�ҹ�"); meaning.add("����"); meaning.add("�����ϴ�");
	    meaning.add("õ"); meaning.add("����"); meaning.add("����");
	    meaning.add("�����"); meaning.add("����"); meaning.add("����");
	    meaning.add("���"); meaning.add("���Ķ�"); meaning.add("����");
	    meaning.add("�����ϴ�");  
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
		
		do {
			System.out.println("");
			System.out.println("�ǹ�: " + hiddenString_mean);
			System.out.print("���ڸ� �Է��ϼ���: ");
			user = in.nextLine(); // Ű����κ��� �Է� �ޱ�
		}while(user.charAt(0) == ' ');
		
		return user.charAt(0);
	}
}
