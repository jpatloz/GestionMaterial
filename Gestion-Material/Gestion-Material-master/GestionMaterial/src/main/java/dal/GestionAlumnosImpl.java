package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
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
		return em.createQuery("SELECT alum FROM GestionAlumnos alum").getResultList();
	}
}
