package project;

import java.util.*;
import java.io.*;

public class Ordinary extends Hangman{ // hangman 클래스 상속
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
	    meaning.add("절대의"); meaning.add("수용하다"); meaning.add("행동하다");
	    meaning.add("이익"); meaning.add("방어"); meaning.add("제거하다");
	    meaning.add("나오다"); meaning.add("구부리기 쉬운"); meaning.add("이마");
	    meaning.add("원인"); meaning.add("고전의"); meaning.add("정의하다");
	    meaning.add("심한 슬픔"); meaning.add("죄지은"); meaning.add("거친");
	    meaning.add("남편"); meaning.add("이주하다"); meaning.add("간섭하다");
	    meaning.add("정의"); meaning.add("여행"); meaning.add("무릎");
	    meaning.add("노동"); meaning.add("세탁물"); meaning.add("면허");
	    meaning.add("약"); meaning.add("움직이기 쉬운"); meaning.add("부정적인");
	    meaning.add("소설"); meaning.add("반대하다"); meaning.add("결과");
	    meaning.add("설득하다"); meaning.add("설득하다"); meaning.add("거친");
	    meaning.add("소문"); meaning.add("연속"); meaning.add("공급하다");
	    meaning.add("천"); meaning.add("독의"); meaning.add("우주");
	    meaning.add("평소의"); meaning.add("모험"); meaning.add("어휘");
	    meaning.add("재산"); meaning.add("휘파람"); meaning.add("나쁜");
	    meaning.add("산출하다");  
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
		
		do {
			System.out.println("");
			System.out.println("의미: " + hiddenString_mean);
			System.out.print("문자를 입력하세요: ");
			user = in.nextLine(); // 키보드로부터 입력 받기
		}while(user.charAt(0) == ' ');
		
		return user.charAt(0);
	}
}
