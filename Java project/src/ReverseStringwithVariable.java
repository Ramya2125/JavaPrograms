
public class ReverseStringwithVariable {
	public static void main(String[] args) {
		String s="mandya";
		char[] ch = s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];			
		}
		System.out.print(rev);
	}

}
