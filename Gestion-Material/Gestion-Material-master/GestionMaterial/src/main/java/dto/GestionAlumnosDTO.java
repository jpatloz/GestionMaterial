package dto;


import java.util.Calendar;

import org.springframework.stereotype.Component;

import dal.GestionOrdenadores;

@Component
public class GestionAlumnosDTO {
	
	//ATRIBUTOS
	
	private String id_alumno;
	private String md_uuid;
	private Calendar md_date;
	private String nombre_alumno;
	private String apellidos_alumno;
	private String num_telefono;
	GestionOrdenadores ordenadores;
	
	
	//CONSTRUCTORES
	
	//Constructor vacío
	
	public GestionAlumnosDTO() {
		super();
	}
	
	//Constructor para los alumnos
	
	public GestionAlumnosDTO(String md_uuid, Calendar md_date, String nombre_alumno,
			String apellidos_alumno, String num_telefono, GestionOrdenadores ordenadores) {
		super();
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.nombre_alumno = nombre_alumno;
		this.apellidos_alumno = apellidos_alumno;
		this.num_telefono = num_telefono;
		this.ordenadores = ordenadores;
	}
	
	
	//Constructor para los alumnos sin el id del ordenador
	
	public GestionAlumnosDTO(String id_alumno, String md_uuid, Calendar md_date, String nombre_alumno,
			String apellidos_alumno, String num_telefono) {
		super();
		this.id_alumno = id_alumno;
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.nombre_alumno = nombre_alumno;
		this.apellidos_alumno = apellidos_alumno;
		this.num_telefono = num_telefono;
	}
	
	//GETTERS Y SETTERS
	
	public String getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(String id_alumno) {
		this.id_alumno = id_alumno;
	}
	public String getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	public Calendar getMd_date() {
		return md_date;
	}
	public void setMd_date(Calendar md_date) {
		this.md_date = md_date;
	}
	public String getNombre_alumno() {
		return nombre_alumno;
	}
	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}
	public String getApellidos_alumno() {
		return apellidos_alumno;
	}
	public void setApellidos_alumno(String apellidos_alumno) {
		this.apellidos_alumno = apellidos_alumno;
	}
	public String getNum_telefono() {
		return num_telefono;
	}
	public void setNum_telefono(String num_telefono) {
		this.num_telefono = num_telefono;
	}
	public GestionOrdenadores getOrdenadores() {
		return ordenadores;
	}
	public void setOrdenadores(GestionOrdenadores ordenadores) {
		this.ordenadores = ordenadores;
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "GestionAlumnos [md_uuid=" + md_uuid + ", md_date=" + md_date.getTime() 
				+ ", nombre_alumno=" + nombre_alumno + ", apellidos_alumno=" + apellidos_alumno
				+ ", num_telefono=" + num_telefono + ", ordenadores=" + ordenadores + "]";
	}
}
