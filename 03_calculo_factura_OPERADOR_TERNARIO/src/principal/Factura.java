package principal;

public class Factura {

	public static void main(String[] args) {
		double pProducto=5.4;
		int unidades=3;
		
		//si compra más de 5 unidades, le hace un 10% descuento
		double pTotal=(unidades>5)?pProducto*unidades*0.9:pProducto*unidades;
		System.out.println("El precio total "+pTotal);

	}

}