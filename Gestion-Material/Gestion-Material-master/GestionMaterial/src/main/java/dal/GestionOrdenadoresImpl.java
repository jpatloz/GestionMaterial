package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class GestionOrdenadoresImpl implements GestionOrdenadoresServicio{
	
	@PersistenceContext
	private EntityManager emOrd;
	
	@Override
	public void insertarOrdenador(GestionOrdenadores gestionOrdenadores) {
		emOrd.persist(gestionOrdenadores);
		emOrd.clear();
		emOrd.close();
	}

	@Override
	public List<GestionOrdenadores> buscarOrdenadores() {
		return emOrd.createQuery("SELECT alum FROM GestionAlumnos alum").getResultList();
	}

}
