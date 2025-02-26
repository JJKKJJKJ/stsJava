package ch08.first;

import java.util.List;
import java.util.Vector;

public class LanguageEx {
	public static void main(String[] args) {
		
//		ArrayList<String> friends = new ArrayList<>();
		List<String> friends = new Vector<>();
///     기능적인 부분에서는 밑에꺼가 더 적절하다 - Vector->ArrayList || ArrayList->Vector 수정 가능
		
///		ArrayList<String> friends = new Vector<>();		
///		List<String> friends = new ArrayList<>();
		
		
		System.out.println("test.size():" + friends.size());
		
		friends.add("Jihye");
		friends.add("Jihye1");
		friends.add("Jihye2");
		friends.add("Jihye3");
		friends.add("Jihye4");
		friends.add("Jihye5");
		friends.add("Jihye6");
		friends.add("Jihye7");
		
		System.out.println("test.size():" + friends.size());
		
		for(int i=0; i<friends.size(); ++i) {
			System.out.println("test.get(i)" + friends.get(i));
		}
		
		
		System.out.println("=============================================");
		
		
///                 ┌>단수    ┌>복수  ('향상된 for 문')
		for(String friend: friends) {
			System.out.println("friend:" + friend);
		}
		
//		test.remove(0);
		///         └>인덱스 번호
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
		
//		System.out.println("test.size():" + test.size());
	}

}
