package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import dal.GestionAlumnos;
import dal.GestionOrdenadores;
import dto.ADaoServicio;
import dto.ADaoServicioImpl;
import dto.ADtoServicio;
import dto.ADtoServicioImpl;
import dto.GestionAlumnosDTO;
import dto.GestionOrdenadoresDTO;
import impl.Consultas;

@Controller
public class Controlador {
	
		public static void main(String[] args) {
			
		//LLamamos a nuestro contexto.xml
		ApplicationContext context= new ClassPathXmlApplicationContext("contexto.xml");
		//LLamamos a la clase consultas y creamos una instancia 
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		
		//Creamos el md_uuid de forma que se genere de forma aleatoria dentro de la base de datos
		String md_uuid = java.util.UUID.randomUUID().toString();
		
		//Opcion del menu
		Integer opcion1;
		
		//Creamos una instancia de nuestras clases para Dao y Dto
		ADtoServicioImpl aDto = new ADtoServicioImpl();
		ADaoServicioImpl aDao = new ADaoServicioImpl();
		
		do {
		System.out.println("Escriba el valor a uno de los asignados:");
		System.out.println("");
		System.out.println("1.-Matricula alumno.");
		System.out.println("2.-Baja de un alumno.");
		System.out.println("3.-Alta de portatil.");
		System.out.println("4.-Consulta portatil asignado a un alumno (se conoce el numero de alumno se busca el portatil).");
		System.out.println("5.-Consulta alumno asignado a un portátil (se conoce el identificador del portatil se busca el alumno).");
		System.out.println("6.-Ver todos los alumnos con su asignacion de portatil.");
		System.out.println("7.-Salir. ");
		
		System.out.println();
		System.out.print("Introduzca una opcion: ");
		
		//Escaner que lee los valores por consola
		Scanner scan = new Scanner(System.in);
		opcion1 = scan.nextInt();
		
		Calendar fecha = Calendar.getInstance();
		
		//Creamos la variable id 
		long id;
		
		//Creamos una lista para meter el id de ordenador
		List<GestionOrdenadores> lista = new ArrayList<>();
		lista = consulta.buscarOrdenadores();
		
		//DTO para el pago repostaje
		GestionAlumnosDTO DTOAlumnos;
		GestionAlumnos gestionAlumnos = new GestionAlumnos();
				
		//DTO para el control camiones
		GestionOrdenadoresDTO DTOOrdenadores;
		GestionOrdenadores gestionOrdenadores = new GestionOrdenadores();
		
		switch (opcion1) {
		case 1:
		System.out.println("Ha escogido la opcion de matricular a un alumno: ");
		//Añadimos los valores al DTO de alumnos
		DTOAlumnos = aDto.AGestionAlumnosDTO(fecha, "Jesus", "Patricio Lozano", "954654567", lista.get(1));
		//Convertimos la consulta a DAO
		gestionAlumnos = aDao.GestionAlumnosDTOADAO(DTOAlumnos);
		
		//Matricula al alumno
		consulta.insertarUnaMatricula(gestionAlumnos);
		break;
		case 2:
		System.out.println("Ha escogido la opcion de dar de baja a un alumno: ");
		System.out.println("Indique el id del alumno que quiere eliminar");
		//Leemos el valor por consola
		id = scan.nextInt();
		
		//Dar de baja a un alumno por id
		consulta.eliminarUnAlumno(id);
		break;
		case 3:
		System.out.println("Has escogido la opcion de alta de un portatil: ");
		//Añadimos los valores al DTO de ordenadores
		DTOOrdenadores = aDto.AGestionOrdenadoresDTO(fecha, "LG", "EG7");
		//Convertimos la consulta a DAO
		gestionOrdenadores = aDao.GestionOrdenadoresDTOADAO(DTOOrdenadores);
		
		//Dar de alta a un portatil
		consulta.insertarUnOrdenador(gestionOrdenadores);
		break;
		case 4:
		System.out.println("Ha escogido la opcion de consultar el portátil asignado a un alumno: ");
		System.out.println("Introduzca el id del alumno para buscar el portatil: ");
		//Leemos el id por la consola
		id = scan.nextInt();
		
		//Se llama a la consulta para buscar el ordenador por el id del alumno
		gestionOrdenadores = consulta.buscarOrdenadorPorIdAlumno(id);
		System.out.println("El ordenador asignado es: " +  "Id: " + gestionOrdenadores.getId_ordenador()
		+ ", Marca: " + gestionOrdenadores.getMarca() + ", Modelo:  " + gestionOrdenadores.getModelo());
		break;
		case 5:
		System.out.println("Ha escogido la opcion de consultar el alumno asignado a un portatil: ");
		System.out.println("Introduzca el id del ordenador para buscar el alumno: ");
		//Leemos el valor por la consola
		id = scan.nextInt();
		//Se llama a la consulta para buscar el alumno por el id del ordenador asignado
		gestionAlumnos = consulta.buscarAlumnoPorIdOrdenador(id);
		System.out.println("El alumno asignado es: " +  "Id: " + gestionAlumnos.getId_alumno()
		+ ", Nombre: " + gestionAlumnos.getNombre_alumno() + ", Apellidos:  " + gestionAlumnos.getApellidos_alumno()
		+ ", Telefono: "+ gestionAlumnos.getNum_telefono());
		break;
		case 6:
		//Se crea una lista donde se mete la consulta que busca a los alumnos
		List<GestionAlumnos> listaAlumnos = consulta.buscarTodos();
		
		//Se muestran los atributos de alumnos y ordenadores
        for(GestionAlumnos alumnos : listaAlumnos) {
            System.out.println("Alumno: " + "Nombre: " + alumnos.getNombre_alumno() + ", Apellidos: " + alumnos.getApellidos_alumno() 
            + ", Telefono:" + alumnos.getNum_telefono() + " // Ordenador: " + "Marca: " + alumnos.getOrdenadores().getMarca() 
            + ", Modelo: " +alumnos.getOrdenadores().getModelo());
        }
		break;
		case 7:
		//Salir de la aplicación
		System.out.println("Hasta pronto!");
		break;
		default:
				
		}
		
		}while(opcion1 != 7);
	 }
}
