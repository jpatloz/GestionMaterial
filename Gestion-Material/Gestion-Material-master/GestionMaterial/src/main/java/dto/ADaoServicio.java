package dto;

/*
 * Interfaz que contiene los metodos para pasar de DTO a DAO
 */

import dal.GestionAlumnos;
import dal.GestionOrdenadores;

public interface ADaoServicio {
	
	public GestionAlumnos GestionAlumnosDTOADAO(GestionAlumnosDTO gestionAlumnosDTO);
	
	public GestionOrdenadores GestionOrdenadoresDTOADAO(GestionOrdenadoresDTO gestionOrdenadoresDTO);
	
}
