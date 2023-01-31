package dto;

import dal.GestionAlumnos;
import dal.GestionOrdenadores;

public interface ADaoServicio {
	
	public GestionAlumnos GestionAlumnosDTOADAO(GestionAlumnosDTO gestionAlumnosDTO);
	
	public GestionOrdenadores GestionOrdenadoresDTOADAO(GestionOrdenadoresDTO gestionOrdenadoresDTO);
	
}
