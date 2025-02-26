package ch08.second;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Set<String> computerLangs = new HashSet<>();
		
		for(String computerLang: computerLangs) {
			System.out.println("computerLang" + computerLang);
		}
		
		System.out.println("========================================");
		
		computerLangs.add("html");
		computerLangs.add("Bootstrapp");
		computerLangs.add("Css");
		computerLangs.add("Javaspring");
		computerLangs.add("JAVA");
		computerLangs.add("JAVA");
		

		for(String computerLang: computerLangs) {
			System.out.println("computerLang" + computerLang);
			
			/// 똑같은 ㄷ이터 값 저장 불가
		}	
	}
}
