package project;

import java.util.*;
import java.io.*;

public class Hangman2 extends Hangman{ // hangman Ŭ���� ���
	
// https://stackoverflow.com/questions/36299122/method-add-in-arraylistclassname-is-not-applicable-for-the-arguments-string
	
//	static List<String> getStandarWords(){
//		
//		ArrayList<String> words = new ArrayList<String>();
//		
//		FileInputStream wordlist = new FileInputStream("/Reversehangman/word");
//		InputStreamReader word = new InputStreamReader(wordlist, "MS949");
//	    BufferedReader br1 = new BufferedReader(word);
//		for(int i=0;i<words.size()+1;i++) {
//			String str = new String();
//			str.set
//			words.add(null);
//		}
//		
//		ArrayList<String> meanings = new ArrayList<String>();
//		
//		FileInputStream meanlist = new FileInputStream("/Reversehangman/mean");
//		InputStreamReader mean = new InputStreamReader(meanlist, "MS949");
//	    BufferedReader br2 = new BufferedReader(mean);
//		for(int i=0;i<meanings.size()+1;i++) {
//			meanings.add(br2);
//		}
//		
//	}
	
	for(int i=0;i<word.size();i++) {
		
	}
	
	String[] words = { "fever" };
	String[] meaning = { "��" };
	
	public Hangman2() throws IOException{
		
		System.out.println("��� ���� �����Ϻ��"); // ���� ���� ����
		
		Random r = new Random(); 
		int randomNum = Math.abs(r.nextInt() % words.length); // ���� ����
		
		hiddenString = words[randomNum]; // ������ ����� �迭 �� �ϳ��� ����
		
		System.out.println("�ǹ� : " + meaning[randomNum]);
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
