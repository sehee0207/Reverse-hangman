package project;

import java.util.*;
import java.io.*;

public class Hard extends Hangman{ // hangman Ŭ���� ���
	
	static final Scanner in = new Scanner(System.in);
	static List<String> words = getStandardWords();
	static List<String> meanings = getStandardMeanings();
	
	static List<String> getStandardWords(){
		List<String> word = new ArrayList<>();
		word.add("abort"); word.add("absurd"); word.add("bankrupt");
	    word.add("bishop"); word.add("cathedral"); word.add("chamber");
	    word.add("decent"); word.add("deficit"); word.add("embrace");
	    word.add("enforce"); word.add("federal"); word.add("fertile");
	    word.add("glimpse"); word.add("gross"); word.add("haunt");
	    word.add("headquarters"); word.add("implement"); word.add("incline");
	    word.add("judicial"); word.add("keen"); word.add("knot");
	    word.add("lease"); word.add("legislate"); word.add("literal");
	    word.add("magnificent"); word.add("manipulate"); word.add("nanny");
	    word.add("orbit"); word.add("overwhelm"); word.add("parallel");
	    word.add("patch"); word.add("peasant"); word.add("questionnaire");
	    word.add("quote"); word.add("rear"); word.add("recruit");
	    word.add("salon"); word.add("scarce"); word.add("tease");
	    word.add("temporary"); word.add("undertake"); word.add("underlie");
	    word.add("vanish"); word.add("verbal"); word.add("weed");
	    word.add("whip"); word.add("yield");
		
		return word;
	}
	
	static List<String> getStandardMeanings() {
	    List<String> meaning = new ArrayList<>();
	    meaning.add("�����ϴ�"); meaning.add("���ո���"); meaning.add("�Ļ���");
	    meaning.add("�ֱ�"); meaning.add("�뼺��"); meaning.add("��");
	    meaning.add("Ȯ���ϴ�"); meaning.add("���"); meaning.add("�����ϴ�");
	    meaning.add("�ǽ��ϴ�"); meaning.add("������"); meaning.add("�����");
	    meaning.add("��� ��"); meaning.add("�Ѱ���"); meaning.add("���ְ���");
	    meaning.add("����"); meaning.add("�ⱸ"); meaning.add("����̴�");
	    meaning.add("�����"); meaning.add("��ī�ο�"); meaning.add("�ŵ�");
	    meaning.add("�Ӵ���"); meaning.add("������ �����ϴ�"); meaning.add("������");
	    meaning.add("�����"); meaning.add("�ٷ��"); meaning.add("����");
	    meaning.add("�˵�"); meaning.add("�е��ϴ�"); meaning.add("������");
	    meaning.add("��� ���"); meaning.add("���"); meaning.add("����ǥ");
	    meaning.add("�ο��ϴ�"); meaning.add("��"); meaning.add("�ź�");
	    meaning.add("����"); meaning.add("������"); meaning.add("��������");
	    meaning.add("�Ͻ�����"); meaning.add("���ô�"); meaning.add("~�� �ؿ� �ִ�");
	    meaning.add("���븦 ���ߴ�"); meaning.add("����"); meaning.add("����");
	    meaning.add("ä��"); meaning.add("�����ϴ�"); 		
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
			System.out.print("���ĺ��� �ϳ� �Է��ϼ���: ");
			user = in.nextLine(); // Ű����κ��� �Է� �ޱ�
			
			if(user.charAt(0) == ' ') {
				System.out.println("������ �Է��� �� �����ϴ�. �ٽ� Ȯ�����ּ���");
			}
			
		}while(user.charAt(0) == ' ');
		
		return user.charAt(0);
	}
}
