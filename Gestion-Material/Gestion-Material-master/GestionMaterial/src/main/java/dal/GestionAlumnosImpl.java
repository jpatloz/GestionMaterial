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
public class GestionAlumnosImpl implements GestionAlumnosServicio{

	//Creación de la persistencia con Entity Manager
	
	@PersistenceContext
	private EntityManager em;
	
	//Método para insertar la matrícula de un alumno
	
	@Override
	public void insertarMatricula(GestionAlumnos gestionAlumnos) {
		try {
		em.persist(gestionAlumnos);
		em.clear();
		}catch(Exception e) {
			System.out.println("[insertarMatricula]: " + e);
		}
	}
	
	//Método para buscar un alumno por su id

	@Override
	public List<GestionAlumnos> buscarAlumnos() {
		try {
		String jpql = ("SELECT alum FROM GestionAlumnos alum WHERE alum.ordenadores = :id_al");
		Query query = em.createQuery(jpql);
		return query.getResultList();
		}catch(Exception e) {
			System.out.println("[buscarAlumnos]: " + e);
		}
		return null;
	}
	
	//Método para eliminar un alumno por su id

	@Override
	public void eliminarAlumno(long id) {
		try {
		String jpql ="DELETE FROM GestionAlumnos ga WHERE ga.id_alumno = :id_al";
        Query query = em.createQuery(jpql);
        query.setParameter("id_al", id);
        int numeroEliminados = query.executeUpdate();
        System.out.println("Numero de eliminados: " + numeroEliminados);
		}catch(Exception e) {
			System.out.println("[eliminarAlumno]: " + e);
		}
		
	}
}
