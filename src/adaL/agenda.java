package adaL;
import java.util.*;
public class agenda {
	public static void main(String[] args) {
		Scanner sc=  new Scanner (System.in);
		int n= sc.nextInt();
		int[] i= new int[n];
		int [] f= new int[n];
		for (int j = 0; j <n; j++) {
			i[j]=sc.nextInt();
			f[j]=sc.nextInt();
		}
		int tempo[] = new int[n];
		int v[] = new int[n];
		for (int j = 0; j < tempo.length; j++) {
			tempo[j] = Math.abs(i[j]-f[j]);
			v[j] = j;
		}
		int sla;
		int cu;
		for (int j = 0; j < v.length; j++) {
			if(v.length == j+1) {
				
			} else {
				while(tempo[j]>tempo[j+1]){
						sla = tempo[j];
						cu = v[j];
						tempo[j] = tempo[j+1];
						v[j] = v[j+1];
						tempo[j+1] = sla;
						v[j+1] = cu;
				}
			}
		}
		for (int j = 0; j < v.length; j++) {
			System.out.println(tempo[j]);
		}
		/*int inicio = i[0];
		int fim = f[0];
		for(int j = 0; j<n; j++) {
			if (i[j]<inicio) {
				inicio = i[j];
				fim = f[j];
			}
		}
		for(int j=0; j<n; j++) { 
			if(inicio<) {

			}
		}
		System.out.println();*/
	}
}
