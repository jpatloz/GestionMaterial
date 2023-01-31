package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dal.GestionAlumnos;
import dal.GestionOrdenadores;
import dto.ADaoServicio;
import dto.ADaoServicioImpl;
import dto.ADtoServicio;
import dto.ADtoServicioImpl;
import dto.GestionAlumnosDTO;
import dto.GestionOrdenadoresDTO;
import impl.Consultas;

public class Controlador {
	
		public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("contexto.xml");
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		
		Integer opcion1;
		ADtoServicio aDto = new ADtoServicioImpl();
		ADaoServicio aDao = new ADaoServicioImpl();
		
		do {
		System.out.println("Escriba el valor a uno de los asignados:");
		System.out.println("");
		System.out.println("1.-Matricula alumno. ");
		System.out.println("2.-Baja de un alumno. ");
		System.out.println("3.-Alta de portátil. ");
		System.out.println("4.-Consulta portátil asignado a un alumno (se conoce el número de alumno se busca el portátil). ");
		System.out.println("5.-Consulta alumno asignado a un portátil (se conoce el identificador del portátil se busca el alumno). ");
		System.out.println("6.-Consulta alumno asignado a un portátil (se conoce el identificador del portátil se busca el alumno). ");
		System.out.println("7.-Salir. ");
		
		System.out.println();
		System.out.print("Introduzca una opcion: ");
		Scanner scan = new Scanner(System.in);
		opcion1 = scan.nextInt();
		Calendar fecha = Calendar.getInstance();
		
		//DTO para el pago repostaje
		GestionAlumnosDTO DTO;
		GestionAlumnos gestionAlumnos;
				
		//DTO para el control camiones
		GestionOrdenadoresDTO DTOOrdenadores;
		GestionOrdenadores gestionOrd = new GestionOrdenadores();
		
		switch (opcion1) {
		case 1:
		System.out.println("Has escogido la opción de repostaje con pago normal");
		DTO = aDto.AGestionAlumnosDTO("rvhfyjkeodkkuhgu3", fecha, "Jesus", "Patricio Lozano", "954321123",  gestionOrd);
		gestionAlumnos = aDao.GestionAlumnosDTOADAO(DTO);
		consulta.insertarUnaMatricula(gestionAlumnos);
		break;
		case 2:
		/*
		System.out.println("Has escogido la opción de repostaje con pago con factura");
		DTO = aDto.APagoRepostajeFacturaDTO("rvhfyjkeodkkuhgu3", fecha, 12, "7789432Q", "9008BTX", fecha);
		pagosRepostaje = aDao.PagoRepostajeDTOADAO(DTO);
		consulta.insertarUnRepostaje(pagosRepostaje);
		*/
		break;
		case 3:
			/*
		System.out.println("Has escogido la opción de ver todos los repostajes");
		System.out.println("Lista repostajes: " + consulta.buscarTodos());
		*/
		break;
		case 4:
			/*
		List<PagosRepostaje> repostajes = new ArrayList<PagosRepostaje>();
		repostajes = consulta.buscarTodos();
		int suma=0;
		for(PagosRepostaje pagos: repostajes) {
			suma+=pagos.getImporte();
		}
		System.out.println("La suma de los repostajes es: "+suma+ " euros");
		*/
		break;
		case 5:
		/*
		System.out.println("Has escogido la opción de llenar el depósito");
		DTOCamiones = aDto.AControlCamionesDTO("rvhfyjkeodkkuhgu3", fecha, 30, "Gasolina95", 58 );
		controlCamiones = aDao.ControlCamionesDTOADAO(DTOCamiones);
		consulta.insertarELCombustible(controlCamiones);
		 */
		break;
		case 6:
			
		break;
		case 7:
		/*
		System.out.println("Has escogido la opción de ver todos los llenados de depósito");
		System.out.println("Lista depósitos: " + consulta.buscarCamiones());
		*/
		break;
		default:
				
		}
		
		}while(opcion1 != 0);
	 }
}
