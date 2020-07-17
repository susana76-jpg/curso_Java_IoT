package model;

public class Movimientos {
	
	private double cantidad;
	private String tipoMovimiento;
	
	public Movimientos() {}
	
	public Movimientos(double cantidad, String tipoMovimiento) {
		super();
		this.cantidad=cantidad;
		this.tipoMovimiento=tipoMovimiento;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	@Override
	public String toString() {
		return tipoMovimiento+" - "+cantidad;
	}

}
