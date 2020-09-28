package info.inetsolv.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindDuplicates {
	
	
	public static void printDuplicates(String name){
		
	char names[] = name.toCharArray();
	HashMap<String, Integer> map = new HashMap<String,Integer>();
	HashSet set =new HashSet();
	
	for(char c : names){
		if(set.add(c)){
			map.put(String.valueOf(c), 1)	;		
		}else{
			int value = map.get(String.valueOf(c));
			value++;
			map.put(String.valueOf(c), value);
		}
		
	}
		

	for (Map.Entry<String, Integer> entry : map.entrySet())
	{
	    System.out.println(entry.getKey() + "-" + entry.getValue());
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDuplicates("VIVEK");
		

	}

}
