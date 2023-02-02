package dal;

import java.util.List;

/*
 * Interfaz que contiene los métodos que hay que implementar 
 */

public interface GestionOrdenadoresServicio {

	public void insertarOrdenador(GestionOrdenadores gestionOrdenadores);

	public List<GestionOrdenadores> buscarOrdenadores();
	
	public GestionOrdenadores buscarOrdenadorporIdAlum(long idALum);
}
