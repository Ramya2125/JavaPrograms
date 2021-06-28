import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		String s="welcome";
		
		//step1: convert given string into tocharArray
		char[] ch = s.toCharArray();
		
		//step 2: find only unique characters by creating collection set
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
			
		}
		//step 3: print the value of set
		for (Character chr : set) {
			System.out.print(chr);
			
		}
	}

}
