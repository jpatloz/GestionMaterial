package dal;

import java.util.List;

public interface GestionAlumnosServicio{
	
	public void insertarMatricula(GestionAlumnos gestionAlumnos);

	public List<GestionAlumnos> buscarAlumnos();
}
