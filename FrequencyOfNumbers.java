package harshal;

public class FrequencyOfNumbers {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,4,5,6,7,2,5,2,5,1,4,1,4,65};
		
		int freq[] = new int[arr.length];
		
		int visited = -1;
		
		for (int i = 0; i<arr.length; i++) {
			
			int count = 1;
			
			for (int j = i+1; j<freq.length; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
					freq[j] = visited;
				}
			}
			if(freq[i] != visited) {
				freq[i] = count;
			}
		}
		for(int x=0; x<freq.length; x++) {
			if(freq[x] != visited) {
				
				System.out.println("Frequency of " +arr[x]+ " is: " + freq[x]);
			
			}
		}
	}
}
