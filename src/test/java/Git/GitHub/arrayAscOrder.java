package Git.GitHub;

public class arrayAscOrder {

	public static void main(String[] args) {
		
		int a[] =new int[]{42,32,22,12};
		int temp=0;
		for(int i =0; i<a.length;i++) {
			System.out.println("Elements in the array:"+ a[i]);
			
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}//j
		}//i
		for(int i=0;i<a.length;i++) {
			System.out.println("Elements in the array in assending order:"+ a[i]);
		}
	}
}
