package review3;

public class PrimeSort {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,7,9,6,3,4,2,5};
		int count =0;
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				for(int m =0;m<=arr[i];m++) {
				 if(arr[i]%m==0) {
					 count++;
				 }
				 if(count==2)
					 System.out.println(arr[j]);
				 count =0;
			}
		}
         	  
          }
	}

}
