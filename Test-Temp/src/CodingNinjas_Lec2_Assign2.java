import java.util.Scanner;

public class CodingNinjas_Lec2_Assign2 {

	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int x1, y1, x2, y2;
		x1 = s.nextInt(); 
		y1 = s.nextInt(); 
		x2 = s.nextInt(); 
		y2 = s.nextInt(); 
		
		//area of rectangle = (x2-x1)*(y2-y1)
		int area_rectangle =  (x2-x1)*(y2-y1);
		System.out.println(area_rectangle); 


	}

}
