package java_practice;


public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		
		int[] unsortedArr = {54,1,77,34,1,33,2,2,23,44,65,34,12,12,42,12,451,23};
		
		for(int i=0;i<unsortedArr.length-1;i++) {//it will decide no of round..
			for(int j=0;j<unsortedArr.length-1;j++) {//it will decide the element
				if(unsortedArr[j]>unsortedArr[j+1]) {
					int temp = unsortedArr[j];
					unsortedArr[j]=unsortedArr[j+1];
					unsortedArr[j+1] = temp;
					
				}	
			}
		}
		System.out.println("this is unsorted Array And it Consist Duplicate");
		for(int no : unsortedArr) {
			System.out.println(no);
		}
		
		
		System.out.println();
		System.out.println("Removed Duplicate below Result: ");
		int[] newArr = new int[unsortedArr.length];
		
		
		int count=0;
		int j=0;
		
		
		
		for(int i=0;i<newArr.length-1;i++) {
			if(unsortedArr[i]!=unsortedArr[i+1]) {
				newArr[j]=unsortedArr[i];
				j++;
				count++;
				
			}
		}
		newArr[j]= unsortedArr[unsortedArr.length-1];
		for(int s=0;s<=count;s++) {
			System.out.print(newArr[s]+",");
		}
		
		
		
	}
}
