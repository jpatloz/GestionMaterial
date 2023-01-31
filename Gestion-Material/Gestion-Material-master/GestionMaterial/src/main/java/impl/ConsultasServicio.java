package impl;

import java.util.Collection;
import java.util.List;

import dal.GestionAlumnos;
import dal.GestionOrdenadores;

public interface ConsultasServicio{
	
	//Métodos para la consulta de gestión de alumnos

	public void insertarUnaMatricula(GestionAlumnos gestionAlumnos);
	
	public void insertarListaMatriculas(Collection<GestionAlumnos> colAlumnos);
	
	public List<GestionAlumnos> buscarAlumnos();
	
	//Métodos para la consulta de gestión de ordenadores
	
	public void insertarUnOrdenador(GestionOrdenadores gestionOrdenadores);
	
	public void insertarListaOrdenadores(Collection<GestionOrdenadores> colOrdenadores);
	
	public List<GestionOrdenadores> buscarOrdenadores();
	
}
