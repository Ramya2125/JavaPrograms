import java.util.HashSet;
import java.util.LinkedHashSet;

public class TotalNumberOfDuplicateword {
	public static void main(String[] args) {
		String s="welcome to testyantra welcome welcome to india";
		//step 1: convert given string into array

		String[] str =s.split(" ");	

		//step 2: create collection to find only unique character of string

		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);

		}
		System.out.println(set);
		int count1=0;
		for(String word:set) {
			int count=0;
			for (int i = 0; i <str.length; i++) {
				if(word.equals(str[i])) {
					count++;
				}

			}
			if(count>1) {
				count1++;

			}
		}
		System.out.println(count1);

	}
}
