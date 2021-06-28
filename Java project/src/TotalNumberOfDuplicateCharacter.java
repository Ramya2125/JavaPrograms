import java.util.HashSet;

public class TotalNumberOfDuplicateCharacter {
	public static void main(String[] args) {
		String s="amma";
		//step 1: convert given string into array

		char[] ch = s.toCharArray();	

		//step 2: create collection to find only unique character of string

		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);

		}
		System.out.println(set); 
		int count1=0;

		for(Character chr:set) {
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if(chr==ch[i]) {
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
