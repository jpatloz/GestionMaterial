package dal;

import java.util.List;

/*
 * Interfaz que contiene los métodos que hay que implementar 
 */

public interface GestionAlumnosServicio{
	
	public void insertarMatricula(GestionAlumnos gestionAlumnos);

	public List<GestionAlumnos> buscarAlumnos();
	
	public void eliminarAlumno(long id);
}
