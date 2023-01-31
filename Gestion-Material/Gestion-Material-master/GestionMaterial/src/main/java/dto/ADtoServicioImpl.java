package dto;

import java.util.Calendar;

import dal.GestionAlumnos;
import dal.GestionOrdenadores;

public class ADtoServicioImpl  implements ADtoServicio{

	@Override
	public GestionAlumnosDTO AGestionAlumnosDTO(String md_uuid, Calendar md_date, String nombre_alumno,
			String apellidos_alumno, String num_telefono, GestionOrdenadores ordenadores) {

		GestionAlumnosDTO DTO = new GestionAlumnosDTO(md_uuid, md_date, nombre_alumno, apellidos_alumno, 
				num_telefono, ordenadores);
		
		return DTO;
	}

	@Override
	public GestionOrdenadoresDTO AGestionOrdenadoresDTO(String md_uuid, Calendar md_date, String modelo, String marca,
			GestionAlumnos alumno) {
		
		GestionOrdenadoresDTO DTO = new GestionOrdenadoresDTO(md_uuid, md_date, modelo, marca, 
				alumno);
		
		return DTO;
	}

}
