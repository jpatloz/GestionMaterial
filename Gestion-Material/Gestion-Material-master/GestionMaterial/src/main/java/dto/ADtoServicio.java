package dto;

import java.util.Calendar;

import dal.GestionAlumnos;
import dal.GestionOrdenadores;

public interface ADtoServicio {

	public GestionAlumnosDTO AGestionAlumnosDTO(Calendar md_date, String nombre_alumno,
			String apellidos_alumno, String num_telefono, GestionOrdenadores ordenadores);
	
	public GestionOrdenadoresDTO AGestionOrdenadoresDTO(Calendar md_date, String modelo, String marca);
}
