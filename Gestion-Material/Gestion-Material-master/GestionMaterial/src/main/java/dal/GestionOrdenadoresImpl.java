package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/*
 * Clase para implementar los métodos de la interfaz para hacer las consultas
 */

@Repository
public class GestionOrdenadoresImpl implements GestionOrdenadoresServicio{
	
	//Creación de la persistencia con Entity Manager
	
	@PersistenceContext
	private EntityManager emOrd;
	
	//Método para insertar un ordenador
	
	@Override
	public void insertarOrdenador(GestionOrdenadores gestionOrdenadores) {
		try {
		emOrd.persist(gestionOrdenadores);
		emOrd.clear();
		}catch(Exception e) {
			System.out.println("[insertarOrdenador]: " + e);
		}
	}
	
	//Método para buscar un ordenador por su id

	@Override
	public List<GestionOrdenadores> buscarOrdenadores() {
		try {
		String jpql = "SELECT ord FROM GestionOrdenadores ord";
		Query query = emOrd.createQuery(jpql);
		return query.getResultList();
		}catch(Exception e) {
			System.out.println("[insertarOrdenador]: " + e);
		}
		return null;
	}

}
