
public class SortArrayInAsendingOrder {
	public static void main(String[] args) {
		int[] a= {1,10,20,30,40,50,60};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) // > Ascending order small to big
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
	}

}
