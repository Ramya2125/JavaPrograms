import java.util.HashSet;

public class DuplicateOfWord {
	public static void main(String[] args) {
		String s="welcome to testyantra welcome";
		//step 1: convert given string into array

		String[] str =s.split(" ");	

		//step 2: create collection to find only unique character of string

		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);

		}
		System.out.println(set);

		for(String word:set) {
			int count=0;
			for (int i = 0; i <str.length; i++) {
				if(word.equals(str[i])) {
					count++;
				}

			}
			if(count>1) {
				count++;
			
		}
	}

	}

}
