package service;

import java.util.ArrayList;

import model.Movimientos;

public class CuentaServiceMovimientos extends CuentaLimiteService {
	private ArrayList<Movimientos> movimientos=new ArrayList<Movimientos>();
	
	
	public CuentaServiceMovimientos(double saldo, double limite) {
		super(saldo, limite);
	}
	@Override
	public void ingresar(double cantidad) {
		movimientos.add(new Movimientos(cantidad>getLimite()?getLimite():cantidad,"Ingreso"));
		super.ingresar(cantidad);
	}



	private double getLimite() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void extraer(double cantidad) {
		movimientos.add(new Movimientos(cantidad>getLimite()?getLimite():cantidad,"Extraer"));
		super.extraer(cantidad);
	}



	public ArrayList<Movimientos> obtenerMovimientos(){
		return movimientos;
	}
}
