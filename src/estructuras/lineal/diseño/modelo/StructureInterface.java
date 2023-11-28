package estructuras.lineal.diseño.modelo;

import general.exception.EmptyStructureException;
/**
 * Interfaz que define la estructura básica de una estructura de datos de tipo lineal.
 * */
public interface StructureInterface {
	/**
	 * Método que vacia todos los datos de la estructura.
	 * @return true si vació la estructura correctamente.
	 * */
	public void clear() throws EmptyStructureException;
	
	/**
	 * Método que cuenta cada uno de los datos que se encuentran vigentes en la estructura.
	 * 
	 * @return retorna el tamaño de la estructura.
	 * */
	public int size();
	
	/**
	 * Método que analiza si la estructura se encuentra vacía.
	 * @return retorna true si la estructura se encuentra sin elementos
	 * */
	public boolean isEmpty();
	
	/**
	 * Imprime los datos de la estructura recorriendo cada uno de los datos de la estructura, si la estructura se encuentra vacía lanza un mensaje
	 * */
	public void print();
}
