package principal;
import model.Pedido;
import service.PedidosService;
import java.util.Scanner;

public class Pedidos {

	static int op;
	static int operaciones=0; //contador de operaciones realizadas
	
	
	public static void main(String[] args) {
		
		PedidosService pedidosService=new PedidosService();		
		
		
	try (Scanner sc=new Scanner(System.in);){
		
		do {
			
			menu();
			op=Integer.parseInt(sc.nextLine());
			
			switch(op) {
			case 1://1_Agregar pedido
				
				System.out.println("---Introduce datos del pedido------");
				System.out.print("Número de pedido: "); 
				int numPedido=Integer.parseInt(sc.nextLine());
				System.out.print("Nombre de producto: "); 
				String producto=sc.nextLine();
				System.out.print("Precio del producto: "); 
				double precio=Double.parseDouble(sc.nextLine());
			
				Pedido pedido=new Pedido(numPedido, producto, precio);
				pedidosService.agregarPedido(pedido);
				
				break;
				
			case 2://2_Procesar pedido
				pedidosService.procesarPedido();
				
				System.out.println("Los pedidos pendientes son: " + pedidosService.pedidosPendientes());
				
				break;
				
			case 3://3_Priorizar pedido
				System.out.println("Los pedidos pendientes son: " + pedidosService.pedidosPendientes());
				System.out.println("¿Qué número de pedido quieres priorizar?: ");
				numPedido=Integer.parseInt(sc.nextLine());
				
				pedidosService.priorizarPedido(numPedido);
				
				System.out.println("Realizado. ");
				
				break;
				
			case 4://4_Facturación pendiente
				System.out.println("La facturación pendiente es: " +pedidosService.facturacionPendiente());
				
				break;
			
			case 5://5_Pedidos pendientes
				System.out.println("Los pedidos pendiente son: "+pedidosService.pedidosPendientes());
				
				break;
			}
		}while(op!=6);
		
	}catch(NumberFormatException ex) {
		ex.getStackTrace();
		System.out.println("El número de pedido introducido no es correcto. ");
		
	}catch(ArithmeticException ex) {
		ex.getStackTrace();
		System.out.println("Error en alguna de las operaciones realizadas. ");
		
	}
	finally {
		System.out.println("Número de operaciones realizadas: "+  operaciones++);
		
		
	}
		
}
	
	static void menu() {
		System.out.println("");
		System.out.println("---------Menú de operaciones en los pedidos-------");
		System.out.println("1.- Agregar pedido");
        System.out.println("2.- Procesar pedido");
        System.out.println("3.- Priorizar pedido");
        System.out.println("4.- Facturación pendiente");
        System.out.println("5.- Pedidos pendientes");
        System.out.println("6.- Salir");
        System.out.println("");
	}	
}
