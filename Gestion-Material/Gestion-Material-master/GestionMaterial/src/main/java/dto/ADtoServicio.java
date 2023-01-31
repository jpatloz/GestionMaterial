package dto;

import java.util.Calendar;

import dal.GestionAlumnos;
import dal.GestionOrdenadores;

public interface ADtoServicio {

	public GestionAlumnosDTO AGestionAlumnosDTO(String md_uuid, Calendar md_date, String nombre_alumno,
			String apellidos_alumno, String num_telefono, GestionOrdenadores ordenadores);
	
	public GestionOrdenadoresDTO AGestionOrdenadoresDTO(String md_uuid, Calendar md_date, String modelo, String marca,
			GestionAlumnos alumno);
}
