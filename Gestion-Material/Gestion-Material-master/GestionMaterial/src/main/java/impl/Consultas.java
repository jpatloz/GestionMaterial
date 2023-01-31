package impl;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dal.GestionAlumnos;
import dal.GestionAlumnosImpl;
import dal.GestionOrdenadores;
import dal.GestionOrdenadoresImpl;

@Service
public class Consultas implements ConsultasServicio{

	@Autowired
	private GestionAlumnosImpl gai;
	@Autowired
	private GestionOrdenadoresImpl goi;
	
	//Consultas de gestión de alumnos
	
	@Transactional
	public void insertarUnaMatricula(GestionAlumnos gestionAlumnos) {
		gai.insertarMatricula(gestionAlumnos);
	}
	
	@Transactional
	public void insertarListaMatriculas(Collection<GestionAlumnos> colAlumnos){
		for (GestionAlumnos gestionAlumnos : colAlumnos) {
			gai.insertarMatricula(gestionAlumnos);
		}
	}
	
	@Transactional
	public List<GestionAlumnos> buscarAlumnos(){
		return gai.buscarAlumnos();
	}
	
	//Consultas de gestión de ordenadores

	@Transactional
	public void insertarUnOrdenador(GestionOrdenadores gestionOrdenadores) {
		goi.insertarOrdenador(gestionOrdenadores);
	}

	@Transactional
	public void insertarListaOrdenadores(Collection<GestionOrdenadores> colOrdenadores) {
		for(GestionOrdenadores gestionOrdenadores : colOrdenadores) {
			goi.insertarOrdenador(gestionOrdenadores);
		}
	}

	@Transactional
	public List<GestionOrdenadores> buscarOrdenadores() {
		return goi.buscarOrdenadores();
	}
}
