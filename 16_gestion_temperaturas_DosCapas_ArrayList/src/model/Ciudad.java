package model;

public class Ciudad {
	
	private String nombre;
	private double temperatura;
	
	public Ciudad (String nombreCiudad, double tmp) {
		this.nombre=nombreCiudad;
		this.temperatura=tmp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreCiudad) {
		this.nombre= nombreCiudad;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	
}
