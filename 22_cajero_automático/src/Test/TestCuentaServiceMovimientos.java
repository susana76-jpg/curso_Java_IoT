package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import service.CuentaServiceMovimientos;

import model.Movimientos;

public class TestCuentaServiceMovimientos {

	CuentaServiceMovimientos service;
	
	@Before
	public void setUp() throws Exception {
		service= new CuentaServiceMovimientos(0, 100);
	}

	@Test
	public void testCuentaServiceMovimientos() {
		
	}
	/*public CuentaServiceMovimientos(double saldo, double limite) {
		super(saldo, limite);
	}*/

	@Test
	public void testObtenerMovimientos() {
		
	}
	/*public ArrayList<Movimientos> obtenerMovimientos(){
		return movimientos;
	}*/
}
