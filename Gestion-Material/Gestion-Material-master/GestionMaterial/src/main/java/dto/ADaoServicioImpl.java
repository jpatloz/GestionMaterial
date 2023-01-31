package dto;

import dal.GestionAlumnos;
import dal.GestionOrdenadores;

public class ADaoServicioImpl implements ADaoServicio{

	@Override
	public GestionAlumnos GestionAlumnosDTOADAO(GestionAlumnosDTO gestionAlumnosDTO){
		GestionAlumnos gestionAlumnos = new GestionAlumnos();
		if(gestionAlumnosDTO != null) {
			gestionAlumnos.setMd_uuid(gestionAlumnosDTO.getMd_uuid());
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
		GestionOrdenadores gestionOrdenadores = new GestionOrdenadores();
		if(gestionOrdenadoresDTO != null) {
			gestionOrdenadores.setMd_uuid(gestionOrdenadoresDTO.getMd_uuid());
			gestionOrdenadores.setMd_date(gestionOrdenadoresDTO.getMd_date());
			gestionOrdenadores.setMarca(gestionOrdenadoresDTO.getMarca());;
			gestionOrdenadores.setModelo(gestionOrdenadoresDTO.getModelo());
			gestionOrdenadores.setAlumno(gestionOrdenadoresDTO.getAlumno());
		}
		return gestionOrdenadores;
	}



}
