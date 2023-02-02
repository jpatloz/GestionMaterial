package dto;

import java.util.Random;

import dal.GestionAlumnos;
import dal.GestionOrdenadores;


/*
 * Clase que implementa los metodos de nuestra interfaz aDao 
 */

public class ADaoServicioImpl implements ADaoServicio{

	@Override
	public GestionAlumnos GestionAlumnosDTOADAO(GestionAlumnosDTO gestionAlumnosDTO){
		String md_uuid = java.util.UUID.randomUUID().toString();
		Random numero = new Random(5000);
		GestionAlumnos gestionAlumnos = new GestionAlumnos();
		if(gestionAlumnosDTO != null) {
			gestionAlumnos.setMd_uuid(md_uuid);
			gestionAlumnos.setMd_date(gestionAlumnosDTO.getMd_date());
			gestionAlumnos.setNombre_alumno(gestionAlumnosDTO.getNombre_alumno());
			gestionAlumnos.setApellidos_alumno(gestionAlumnosDTO.getApellidos_alumno());
			gestionAlumnos.setNum_telefono(gestionAlumnosDTO.getNum_telefono());
			gestionAlumnos.setOrdenadores(gestionAlumnosDTO.getOrdenadores());
		}
		return gestionAlumnos;
	}

	
	
	@Override
	public GestionOrdenadores GestionOrdenadoresDTOADAO(GestionOrdenadoresDTO gestionOrdenadoresDTO) {
		String md_uuid = java.util.UUID.randomUUID().toString();
		GestionOrdenadores gestionOrdenadores = new GestionOrdenadores();
		if(gestionOrdenadoresDTO != null) {
			gestionOrdenadores.setMd_uuid(md_uuid);
			gestionOrdenadores.setMd_date(gestionOrdenadoresDTO.getMd_date());
			gestionOrdenadores.setMarca(gestionOrdenadoresDTO.getMarca());;
			gestionOrdenadores.setModelo(gestionOrdenadoresDTO.getModelo());
		}
		return gestionOrdenadores;
	}



}
