package dal;

import java.util.ArrayList;
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
	
	//Método para buscar un ordenador 

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

	//Método para buscar un ordenador por el id de alumno
	
	@Override
	public GestionOrdenadores buscarOrdenadorporIdAlum(long idAlum) {
		try {
		String jpql = "SELECT alum FROM GestionAlumnos alum WHERE alum.id_alumno = :idAl";
        Query query = emOrd.createQuery(jpql);
        query.setParameter("idAl", idAlum);
		ArrayList<GestionAlumnos> listaAlumnos = (ArrayList<GestionAlumnos>) query.getResultList();
		GestionOrdenadores ordenadores = listaAlumnos.get(0).getOrdenadores();
		return ordenadores;
		}catch(Exception e) {
			System.out.println("[buscarOrdenadorporIdAlum]");
		}
		return null;
	}

}
