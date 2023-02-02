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

/*
 * Clase que contiene las transacciones a nuestra base de datos
 */

@Service
public class Consultas{

	@Autowired
	private GestionAlumnosImpl gai;
	@Autowired
	private GestionOrdenadoresImpl goi;
	
	//Consultas de gestión de alumnos
	
	//Consulta para insertar una matrícula
	
	@Transactional
	public void insertarUnaMatricula(GestionAlumnos gestionAlumnos) {
		gai.insertarMatricula(gestionAlumnos);
	}
	
	//Consulta para buscar todos los alumnos 
	
	public List<GestionAlumnos> buscarTodos(){
        return gai.buscarTodos();
    }
	
	//Consulta para eliminar a un alumno
	
	@Transactional
	public void eliminarUnAlumno(long id) {
		gai.eliminarAlumno(id);
	}
	
	//COnsulta para buscar un alumno por id de ordenador
	
	@Transactional
	public GestionAlumnos buscarAlumnoPorIdOrdenador(long idOrd) {
		return gai.buscarAlumnoPorIdOrdenador(idOrd);
	}
	
	
	
	//Consultas de gestión de ordenadores

	//Consulta para insertar un ordenador
	
	@Transactional
	public void insertarUnOrdenador(GestionOrdenadores gestionOrdenadores) {
		goi.insertarOrdenador(gestionOrdenadores);
	}

	//Consulta para buscar un ordenador por id de alumno
	
	public GestionOrdenadores buscarOrdenadorPorIdAlumno(long idAlum) {
		return goi.buscarOrdenadorporIdAlum(idAlum);
	}
	
	//Consulta para buscar un ordenador
	public List<GestionOrdenadores> buscarOrdenadores() {
		return goi.buscarOrdenadores();
	}
	
}
