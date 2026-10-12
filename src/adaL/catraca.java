package adaL;

import java.util.*;

public class catraca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		String horario[] = new String[n];
		int pessoas = 0;
		int max = 0;
		int j = 0;
		String e[] = new String[n];
		for(int i=0; i<n; i++) {
			horario[i] = sc.next();
			e[i] = sc.next();
			if (e[i].equals("E")) {
				pessoas++;
				if (pessoas > max){
					max = pessoas;
					j = i;
				}
			} else {
				pessoas--;
			}
		}
		System.out.println(pessoas);
		System.out.println(horario[j]);

	}
}
