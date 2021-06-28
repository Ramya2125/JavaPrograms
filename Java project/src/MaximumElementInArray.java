
public class MaximumElementInArray {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j])// descending order big to small 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}

		}

		System.out.println(a[0]);



	}
}


