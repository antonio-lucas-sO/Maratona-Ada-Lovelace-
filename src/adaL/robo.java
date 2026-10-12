package adaL;


import java.util.*;
public class robo {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int b= sc.nextInt();
		int n= sc.nextInt();
		int acoes[]= new int [n];
		for (int i = 0; i < acoes.length; i++) {
			acoes[i]=sc.nextInt();
		}
		System.out.println(bateria(n, b, acoes));


	}
	public static int bateria(int n, int b, int[] acoes) {
		for(int i=0; i<n; i++) {
			if(acoes[i]+b<0) {
				b = 0;
				
				return b;
			} 
			
			if(acoes[i]+b>100) {
				b=100;
			}else {
				b+=acoes[i];
			}
		}
		return b;
	}
}
