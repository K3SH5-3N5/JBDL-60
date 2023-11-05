import java.util.Scanner;

public class CodingNinjas_Lec2_TakingInput {

	public static void main(String[] args) {
		 int a,b;
	      Scanner s=new Scanner(System.in);
	      a=s.nextInt();
	      b=s.nextInt();
	      int c=a+b;
	      System.out.println(c);
	      String str=s.nextLine();
	      char ch=str.charAt(0);
	      System.out.println(ch);
	      s.nextDouble();
	      s.nextLong();

	}

}
