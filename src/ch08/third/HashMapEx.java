package ch08.third;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		
		Map<String , Integer> friends = new HashMap<>();
		
		friends.put("손지혜 키" , 162);
		friends.put("손지혜1 키" , 163);
		friends.put("손지혜2 키" , 164);
		friends.put("손지혜3 키" , 165);

		
//		friends.remove("손지혜 키");
		
		for(String strKey: friends.keySet()) {
			Integer strValue = friends.get(strKey);
			System.out.println(strKey + ":strValue:" +strValue);
			
			///HashMap 만능
		}
	}

}
