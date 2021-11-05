package project;

import java.util.*;
import java.io.*;

public class Hard extends Hangman{ // hangman 클래스 상속
	
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
	    meaning.add("유산하다"); meaning.add("불합리한"); meaning.add("파산자");
	    meaning.add("주교"); meaning.add("대성당"); meaning.add("방");
	    meaning.add("확신하는"); meaning.add("결손"); meaning.add("포옹하다");
	    meaning.add("실시하다"); meaning.add("연방의"); meaning.add("비옥한");
	    meaning.add("흘긋 봄"); meaning.add("총계의"); meaning.add("자주가다");
	    meaning.add("본부"); meaning.add("기구"); meaning.add("기울이다");
	    meaning.add("사법의"); meaning.add("날카로운"); meaning.add("매듭");
	    meaning.add("임대차"); meaning.add("법률을 제정하다"); meaning.add("문자의");
	    meaning.add("장대한"); meaning.add("다루다"); meaning.add("유모");
	    meaning.add("궤도"); meaning.add("압도하다"); meaning.add("평행의");
	    meaning.add("깁는 헝겊"); meaning.add("농부"); meaning.add("질문표");
	    meaning.add("인용하다"); meaning.add("뒤"); meaning.add("신병");
	    meaning.add("객실"); meaning.add("부족한"); meaning.add("괴롭히다");
	    meaning.add("일시적인"); meaning.add("떠맡다"); meaning.add("~의 밑에 있다");
	    meaning.add("자취를 감추다"); meaning.add("말의"); meaning.add("잡초");
	    meaning.add("채찍"); meaning.add("산출하다"); 		
	    return meaning;
	}

	public Hard() throws IOException{
		System.out.println("\n===========	Hard Mode	===========");
		
		Random r = new Random(); 
		int randomNum = Math.abs(r.nextInt() % words.size()); // 난수 생성
		
		hiddenString = words.get(randomNum); // 문제가 저장된 배열 중 하나를 선택
		
		System.out.println("의미 : " + meanings.get(randomNum));
		
//		Random r = new Random();
	}
	
	public char readChar() throws IOException{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String user;
		
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
