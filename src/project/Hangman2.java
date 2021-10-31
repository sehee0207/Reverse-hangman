package project;

import java.util.*;
import java.io.*;

public class Hangman2 extends Hangman{
	String[] words = { "fever" };
	String[] meaning = { "��" };
	
	public Hangman2() throws IOException{
		
		System.out.println("��� ���� �����Ϻ��");
		
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt() % words.length);
		
		hiddenString = words[randomNum];
		
		System.out.println("�ǹ� : " + meaning[randomNum]);
	}
	
	public char readChar() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		String user;
		
		do {
			System.out.println("���ĺ��� �ϳ� �Է��ϼ��� (*��Ʈ�� ���ϸ� ? �Է� ): ");
			user=in.readLine();
			
			if(user.charAt(0) == '?') {
				boolean givehint = false;
				int i = 0;
				while(!givehint) {
					if(outputString.charAt(i) == '-') {
						System.out.println();
						System.out.println("��Ʈ : " + hiddenString.charAt(i));
						System.out.println();
						failed++;
						givehint = true;
					}
					i++;
				}
			}
		}while(user.charAt(0) == '?');
		
		return user.charAt(0);
	}
}
