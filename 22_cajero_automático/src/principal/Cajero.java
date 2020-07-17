package principal;

import java.util.Scanner;
import service.CuentaServiceMovimientos;

public class Cajero {
	
	static int op;
	static double cantidad;
	static Scanner sc;
	
	//METODOS ESTATICOS A UTILIZAR
		static void menu() {
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Señala una opción: ");
				System.out.println("1. Ingresar.");
				System.out.println("2. Extraer.");
				System.out.println("3. Consultar movimientos y saldo.");
				System.out.println("4. Salir.");
				op =Integer.parseInt(sc.nextLine());
				sc.close();
			}
	
			

	public static void main(String[] args) {
		
		sc=new Scanner(System.in);
		
		System.out.println("Saldo inicial: ");
		double saldoInicial=Double.parseDouble(sc.nextLine());
		
		System.out.println("Límite: ");
		double limite=Double.parseDouble(sc.nextLine());
		
		CuentaServiceMovimientos service=new CuentaServiceMovimientos(saldoInicial, limite);
		
		do {
			Scanner sd=new Scanner(System.in);
			menu();	
			
			switch(op){
				case 1://ingresar cantidad
					System.out.println("Cantidad: ");
					cantidad=sd.nextDouble();
					service.ingresar(cantidad);
					
					break;
					
				case 2://extraer cantidad
					System.out.println("Cantidad: ");
					cantidad=sd.nextDouble();
					service.extraer(cantidad);
					break;
					
				case 3:
					service.obtenerMovimientos();
					break;
					
				default:
					System.out.println("Opcion incorrecta");
					break;
			
			}
			sd.close();
			
		}while(op != 4);
		
		sc.close();
	}
	
}

