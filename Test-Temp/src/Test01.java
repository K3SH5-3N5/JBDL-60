import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Test01 {

	public static void main(String[] args) {
	    
		int[] A = {1,3,6,4,1,2};
		
		solution(A);
	
	}
	
	public static int solution(int[] A) {
        // Find the maximum value in the array
        int max = 0;
        for (int num : A) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println(max);

        // If the maximum value is less than or equal to 0, return 1
        if (max <= 0) {
            return 1;
        }

        // Create an array to mark the presence of positive integers
        boolean[] present = new boolean[max + 1];
        
        System.out.println("present.length " + present.length);
        
        // Mark the presence of positive integers in the input array
        for (int num : A) {
            if (num > 0) {
                present[num] = true;
            }
        }
        
        int j=0;
        for (boolean b : present) {
           System.out.println(j++ + " " + b);
        }
        
        
        // Find the smallest positive integer that is not present
        for (int i = 1; i < present.length; i++) {
            if (!present[i]) {
            	 System.out.println("i 0 " + i);
                 
            	return i;
            }
        }
        
        // If all positive integers from 1 to max are present, return max + 1
        
        System.out.println("max + 1 " + max + 1);
        
        
        return max + 1;
    }
	

}
