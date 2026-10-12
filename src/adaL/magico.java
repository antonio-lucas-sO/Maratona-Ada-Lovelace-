package adaL;
import java.util.*;
public class magico {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int cu[][] = new int[3][3];
		int moedas = 0;
		for (int i = 0; i < cu.length; i++) {
			for (int j = 0; j < cu.length; j++) {
				cu[i][j] = sc.nextInt();
			}
		}
		int sla;
		if (cu[1][1]!=5) {
			
		}
		while(cu[0][0]!= 8) {
			sla = cu[0][0];
			cu[0][0] = cu[0][1];
			cu[0][1] = cu[0][2];
			cu[0][2] = cu[1][2];
			cu[1][2] = cu[2][2];
			cu[2][2] = cu[2][1];
			cu[2][1] = cu[2][0];
			cu[2][0] = cu[1][0];
			cu[1][0] = sla;

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(i +""+j + " ");
			}
			System.out.println();
		}
	}

}
