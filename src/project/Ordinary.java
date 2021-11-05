package project;

import java.util.*;
import java.io.*;

public class Ordinary extends Hangman{ // hangman 클래스 상속
	
	static final Scanner in = new Scanner(System.in);
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
	    meaning.add("학술원"); meaning.add("동의하다"); meaning.add("~에 반대하여");
	    meaning.add("기본의"); meaning.add("용감한"); meaning.add("거품");
	    meaning.add("확신하는"); meaning.add("사슬"); meaning.add("우연");
	    meaning.add("토론하다"); meaning.add("마시다"); meaning.add("마른");
	    meaning.add("엔진"); meaning.add("시험"); meaning.add("기본의");
	    meaning.add("좋아하는"); meaning.add("숲"); meaning.add("영원히");
	    meaning.add("장갑"); meaning.add("풀밭"); meaning.add("추측하다");
	    meaning.add("두통"); meaning.add("영웅"); meaning.add("휴일");
	    meaning.add("청바지"); meaning.add("일"); meaning.add("죽이다");
	    meaning.add("알다"); meaning.add("도서관"); meaning.add("점심");
	    meaning.add("수학"); meaning.add("거울"); meaning.add("북쪽");
	    meaning.add("숫자"); meaning.add("유일한"); meaning.add("오일");
	    meaning.add("종이"); meaning.add("공원"); meaning.add("무지개");
	    meaning.add("강"); meaning.add("소금"); meaning.add("여자 형제");
	    meaning.add("갈증"); meaning.add("내일"); meaning.add("이해하다");
	    meaning.add("우산"); meaning.add("방문하다"); meaning.add("목소리");
	    meaning.add("주말"); meaning.add("서쪽"); meaning.add("노란색");
	    meaning.add("어제"); meaning.add("얼룩말"); meaning.add("동물원");  
		return meaning;
	}

	public Ordinary() throws IOException{
		System.out.println("\n===========	Ordinary Mode	===========");
		
		Random r = new Random(); 
		int randomNum = Math.abs(r.nextInt() % words.size()); // 난수 생성
		
		hiddenString = words.get(randomNum); // 문제가 저장된 배열 중 하나를 선택
		hiddenString_mean = meanings.get(randomNum);
	}
	
	public char readChar() throws IOException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String user;
		
		System.out.println("");
		System.out.println("의미 : " + hiddenString_mean);
		
		do {
			System.out.print("알파벳을 하나 입력하세요: ");
			user = in.nextLine(); // 키보드로부터 입력 받기
			
			if(user.charAt(0) == ' ') {
				System.out.println("공백을 입력할 수 없습니다. 다시 확인해주세요");
			}
		}while(user.charAt(0) == ' ');
		
		return user.charAt(0);
	}
}
