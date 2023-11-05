import java.util.Scanner;

public class CodingNinjas_Lec2_Assign {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int m1, m2, m3;
		m1 = s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();

		int ave = (m1 + m2 + m3) / 3;
		System.out.println(name.charAt(0));
		System.out.println(ave);


	}

}
