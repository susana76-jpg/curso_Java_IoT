package model;

public class Pedido {
	
	private int numPedido; //será la PK en la app
	private String producto;
	private double precio;
	
	
	public Pedido(int numPedido, String producto, double precio) {
		super();
		this.numPedido = numPedido;
		this.producto = producto;
		this.precio = precio;
	}


	public int getNumPedido() {
		return numPedido;
	}


	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//SOBRESCRITURA DE LOS MÉTODOS DE OBJECT: equals() y hashCode() (es conveniente cuando se trabaja
		//con listas --> Source / Override hashCode + equals / elegir el campo que será PK y por el cual se identifica la igualdad entre objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numPedido;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pedido))
			return false;
		Pedido other = (Pedido) obj;
		if (numPedido != other.numPedido)
			return false;
		return true;
	}

	//SOBRESCRITURA DEL MÉTODO ToString DE OBJECT -- Source/Override ToString 
	@Override
	public String toString() {
		return "Nº pedido: " + numPedido + "/Nombre producto:" + producto + "/Precio:" + precio + "///";
	}


	
	
	

}
