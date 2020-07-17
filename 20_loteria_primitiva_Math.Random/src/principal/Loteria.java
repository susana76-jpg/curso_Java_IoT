package principal;

import java.util.Arrays;
//import java.math.*; => si se quiere importar la clase est�tica y utilizar sus m�todos directamente, sin ver de que clase vienen
//en vez de =>  Math.random()*6+1 --> random()*6+1

public class Loteria {

	public static void main(String[] args) {
		int[] combinacion=new int[6];
		int total=0; //cuenta los n�meros que se han generado hasta el momento
		int generado;
		
		while(total<6) {
			generado=generarNumero();
			
			if(!existente(combinacion,total,generado)) {
				combinacion[total]=generado;
				total++; //tenemos uno m�s
			}
		}
		ordenarArray(combinacion);
		mostrarCombinacion(combinacion);

	}
	
	static int generarNumero() {
		return (int)(Math.random()*49+1);
	}

	static boolean existente(int[] combinacion, int total,int generado) {
		
		for(int i=0;i<total;i++) {
			
			if(combinacion[i]==generado) {
				return true;
			}
		}
		return false; 
	}
	
	static void ordenarArray(int[] combinacion) {
		Arrays.sort(combinacion);
	}
	
	static void mostrarCombinacion(int[] combinacion) {
		for(int numero:combinacion) {
			System.out.print(numero+", ");
		}
	}
	
}
