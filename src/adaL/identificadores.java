package adaL;


import java.util.*;
public class identificadores {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String palavra=sc.next();
		char p []= palavra.toCharArray();
		
		if(verificador(p) && verif(p)) {
			System.out.println("VALIDA");
		} else {
			System.out.println("INVALIDA");
		}

	}
	public static boolean verificador(char[] p) {
		for(int i=0; i<p.length; i++) {
			if (p[i]=='a'|| p[i]=='e'|| p[i]=='i'||p[i]=='o'||p[i]=='u') {
				return true;
			}
		}
		return false;
	}
	public static boolean verif(char[]p) {
		for(int i=0; i<p.length; i++) {
			if (p.length == i+1) {
				
			}else if (p[i]== p[i+1]) {
				return false;
			}
		}
		return true;
	}
}
