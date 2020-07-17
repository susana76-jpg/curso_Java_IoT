	package service;

import java.util.ArrayList;
import java.util.List;

import model.Pedido;

public class PedidosService {
	
	private List<Pedido> pedidos = new ArrayList<>();//Un ArrayList dd se irán acumulando los objetos pedidos
	private double facturacion = 0;
	
//1.- Agregar pedido -> se construyen dos métodos - Si existe el pedido + agregar pedido
	
	public boolean agregarPedido(Pedido pedido) {
		if(!existePedido(pedido)) {
			return pedidos.add(pedido);
			
		}
		return false;
	}
	
	public boolean existePedido(Pedido pedido) {
		return pedidos.contains(pedido);
	}
	
	
//2.- Procesar pedido;
	
	public Pedido procesarPedido() {// el método remove() retorna el objeto que elimina. Se procesa el primer pedido de la lista	
		return pedidos.size()>0?pedidos.remove(0):null; //con operador ternario	
	}
	
//3.- Priorizar pedido;
	
	public Pedido priorizarPedido(int numeroPedido) {
		Pedido pedido,aux;
		pedido=obtenerPedido(numeroPedido);
		if(pedido!=null) {
			int pos=pedidos.indexOf(pedido);
			//se intercambia con el anterior, si no es el primero
			if(pos>0) {
				//intercambiamos el pedido por el de la
				//posición anterior
				aux=pedidos.get(pos-1);
				pedidos.set(pos-1, pedido);
				pedidos.set(pos, aux);
			}
		}
		return pedido;	
	}
	
	
						private Pedido obtenerPedido(int numPedido) {
							Pedido pedido=null;
							
							for(Pedido p:pedidos) {
								if(p.getNumPedido()== numPedido) {
									return p;
								}
							}
							
							return null;
						}
						
//4.- Facturación pendiente;
						
	public double facturacionPendiente() {
		
		//dentro de un Lambda, solo se pueden utilizar atributos de clase (facturacion) como variables que van a ir modificándose
		facturacion=0;//se inicializa el atributo a 0 cada vez que se realiza este método para que no vaya acumulando importes anteriores
		
		pedidos.forEach((Pedido p) -> facturacion+= p.getPrecio());//método forEach + parámetro expresión Lambda implementado desde la clase funcional Consumer<E>
		
		return facturacion;
	}
	
	
// 5.- Pedidos pendientes;
//elimina todos los pedidos cuyo nombre de producto contenga ese texto
	
	public void eliminarPedidos (String producto) {
		//nuevo método para las colecciones: removeIf() con parámetro que implementa una clase funcional Predicate<T> con método a implementar test(T t) que devuelve un boolean 
		pedidos.removeIf(p->p.getProducto().contains(producto));//expresion Lambda de la clase funcional 
	}
	
	
	
	public List<Pedido> pedidosPendientes() {
		return pedidos;
	}
	

}
