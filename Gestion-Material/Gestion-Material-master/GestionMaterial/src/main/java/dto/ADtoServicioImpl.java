package dto;

import java.util.Calendar;

import dal.GestionAlumnos;
import dal.GestionOrdenadores;

public class ADtoServicioImpl  implements ADtoServicio{

	@Override
	public GestionAlumnosDTO AGestionAlumnosDTO(Calendar md_date, String nombre_alumno,
			String apellidos_alumno, String num_telefono, GestionOrdenadores ordenadores) {

		GestionAlumnosDTO DTO = new GestionAlumnosDTO(md_date, nombre_alumno, apellidos_alumno, 
				num_telefono, ordenadores);
		
		return DTO;
	}

	@Override
	public GestionOrdenadoresDTO AGestionOrdenadoresDTO(Calendar md_date, String modelo, String marca) {
		
		GestionOrdenadoresDTO DTO = new GestionOrdenadoresDTO(md_date, modelo, marca);
		
		return DTO;
	}

}
