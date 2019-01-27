package controller;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;

public class Controller {

	/* Instancia del Modelo del mundo */
	private static IArregloDinamico modelo = new ArregloDinamico(7);
	
	/**
	 * Requerimiento crear Arreglo Dinamico
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public static void crearModelo(int capacidad)
	{
		modelo = new ArregloDinamico(capacidad);
	}
	
	/**
	 * Requerimiento agregar elemento
	 * @param <T>
	 * @param dato Dato a agregar al final del arreglo
	 */
	public static <T> void agregar(T dato)
	{
		modelo.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param <T>
	 * @param <T>
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public static <T> T buscar(T dato)
	{
		return (T) modelo.buscar(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param <T>
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public static <T> T eliminar(T dato)
	{
		return (T) modelo.eliminar(dato);
	}
	
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el arreglo 
	 * @return numero de elementos presentes en el arreglo
	 */
	public static int darTamano()
	{
		return modelo.darTamano();
	}
	
}
