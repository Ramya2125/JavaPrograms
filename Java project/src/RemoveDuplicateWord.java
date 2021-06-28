import java.util.LinkedHashSet;

public class RemoveDuplicateWord {
	public static void main(String[] args) {
String s="welcome to tyss welcome to india";
		
		//step1: convert given string into tocharArray
		String[] str = s.split(" ");
		
		//step 2: find only unique characters by creating collection set
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
			
		}
		//step 3: print the value of set
		for (String word : set) {
			System.out.print(word+" ");
			
		}
	}
		
	}


