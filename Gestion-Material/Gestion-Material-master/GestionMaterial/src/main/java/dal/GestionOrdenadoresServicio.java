package dal;

import java.util.List;

public interface GestionOrdenadoresServicio {

	public void insertarOrdenador(GestionOrdenadores gestionOrdenadores);

	public List<GestionOrdenadores> buscarOrdenadores();
}
