import java.util.HashSet;

public class FindNumberofoccuranceOfWord {
public static void main(String[] args) {
	String s="welcome to testyantra";
	//step 1: convert given string into array

	String[] str =s.split(" ");	

	//step 2: create collection to find only unique character of string

	HashSet<String> set=new HashSet<String>();
	for(int i=0;i<str.length;i++) {
		set.add(str[i]);

	}
	System.out.println(set);
	//step 3: compare each word of set with all word of array

	for(String word:set) {
		int count=0;
		for (int i = 0; i <str.length; i++) {
			if(word.equals(str[i])) {
				count++;
			}

		}
		//step 4: print word and number of occurance
		
		System.out.println(word+"  = "+count);
	}
}

}
