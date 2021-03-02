package Git.GitHub;

public class reverseAnArray {

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8};
		for(int i=0;i<arr.length;i++) {
			System.out.println("Numbers in the array"+arr[i]);
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("Numbers in the array"+arr[i]);
		}

	}

}
