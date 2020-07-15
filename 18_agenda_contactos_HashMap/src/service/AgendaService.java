package service;

import java.util.Collection;
import java.util.HashMap;

import model.Contacto;

public class AgendaService {
	
	private HashMap<String,Contacto> contactos;
	public AgendaService() {
		contactos=new HashMap<>();
	}
	
	public boolean agregarContacto(Contacto p) {
		if(contactos.containsKey(p.getEmail())) {
			return false;
		}else {
			contactos.put(p.getEmail(), p);
			return true;
		}
	}
	
	public Contacto buscarContacto(String email) {
		return contactos.get(email);
	}
	
	public boolean eliminarContacto(String email) {
		
		if(contactos.containsKey(email)) {
			contactos.remove(email);
			return true;
		}
		return false;
	}
	
	public Contacto[] recuperarContactos() {
		
		Collection<Contacto> valores=contactos.values();//para recorrer un HashMap se recurre a la
		//clase statica Collection(es estatica, por lo que no se instancia) => Collection.values();
		
		return valores.toArray(new Contacto[0]);
		
	}
}
