package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class GestionAlumnosImpl implements GestionAlumnosServicio{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertarMatricula(GestionAlumnos gestionAlumnos) {
		em.persist(gestionAlumnos);
		em.clear();
		em.close();
		
	}

	@Override
	public List<GestionAlumnos> buscarAlumnos() {
		return em.createQuery("SELECT alum FROM GestionAlumnos alum WHERE alum.ordenador != null").getResultList();
	}

	@Override
	public void eliminarAlumno(String nombre_alumno) {
		String jpql ="DELETE alum FROM GestionAlumnos rg WHERE rg.importeRespostajeGasolinera = 500";
        Query query = em.createQuery(jpql);
        int numeroEliminados = query.executeUpdate();
        System.out.println("[INFO] -Numero de eliminados: " + numeroEliminados);
		
	}
}
