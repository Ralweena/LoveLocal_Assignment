/* Given an integer array of size n, Java Program to find all elements that appear more than  n/3  times. */

import java.util.Scanner;

class FindMajorityElement {
    public static int[] findMajorityElement(int nums[], int n)
	  {
	      int[] ans = new int[2];   // Since only 2 elements can apper more than n/3 times the array size is 2
		    int k=-1;
		    for (int i = 0; i < n; i++) {
			      int count = 0;
			      for (int j = i; j < n; j++) {    
				        if (nums[i] == nums[j])      // count the number of occurance of each element in the array
					          count++;
			          }
			
  			    if (count > n/3 && ans[0] != nums[i]) {   // If the count is more than n/3 times and the number is not in ans then add it to ans 
	  			      ans[++k] = nums[i];                    
		  	    }
		    }
		
	      return ans;  
	    
	  }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] inputValues = input.split(" ");
        
        int[] arr = new int[inputValues.length];
        for(int i=0;i<inputValues.length;i++) {
            arr[i] = Integer.parseInt(inputValues[i]);
        }
        
        int[] result = findMajorityElement(arr,arr.length);
      
        if(result[0] == '\0') 
            System.out.println("No Majority Element");
        else if(result[1] == '\0')  
            System.out.println(result[0]);
        else
            System.out.println(result[0]+" "+result[1]);
    }
}
