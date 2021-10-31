package project;

import java.util.*;
import java.io.*;

public class Hangman2 extends Hangman{
	String[] words = { "fever" };
	String[] meaning = { "열" };
	
	public Hangman2() throws IOException{
		
		System.out.println("행맨 게임 시작하빈다");
		
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt() % words.length);
		
		hiddenString = words[randomNum];
		
		System.out.println("의미 : " + meaning[randomNum]);
	}
	
	public char readChar() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		String user;
		
		do {
			System.out.println("알파벳을 하나 입력하세요 (*힌트를 원하면 ? 입력 ): ");
			user=in.readLine();
			
			if(user.charAt(0) == '?') {
				boolean givehint = false;
				int i = 0;
				while(!givehint) {
					if(outputString.charAt(i) == '-') {
						System.out.println();
						System.out.println("힌트 : " + hiddenString.charAt(i));
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
