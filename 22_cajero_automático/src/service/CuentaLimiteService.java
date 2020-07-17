package service;
import java.util.Scanner;

public class CuentaLimiteService extends CuentaService{
	
	private double limite;
	
	public CuentaLimiteService() {
		super();
	}

	public CuentaLimiteService(double limite, double saldo) {
		super(saldo);
		this.limite=limite;
	}

	@Override
	public void ingresar(double cantidad) {
		
		if(cantidad<limite) {
		super.ingresar(cantidad);
		}else {
			System.out.println("No se est� llegando al m�nimo de ingreso contratado");
		}
	}

	@Override
	public void extraer(double cantidad) {
		if(cantidad>limite) {
		super.extraer(cantidad);
	}else {
		System.out.println("la cantidad que se le deja extraer es la del l�mite contratado: " + limite);
		System.out.println("Desea esta cantidad: S/N");
		
		Scanner sc= new Scanner(System.in);
		String op=sc.nextLine();
		sc.close();
		if(op == "S") {
			super.extraer(limite);
		}else {
			System.out.println("Operaci�n anulada.");
		}
	}
		
		
	}
	
	
}
