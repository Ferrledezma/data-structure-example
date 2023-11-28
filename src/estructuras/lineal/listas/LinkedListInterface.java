package estructuras.lineal.listas;

import estructuras.lineal.diseño.modelo.StructureInterface;
import general.exception.EmptyStructureException;
/**
 * Interfaz que da estructura básica de una lista enlazada.
 * @author Ledezma
 * */
public interface LinkedListInterface<T> extends StructureInterface{
	/**
	 * Método de inserción de la lista enlazada de nodos, inserta el T data por el lado frontal de la lista de nodos.
	 * @param <T> data elemento a insertar en la lista.
	 * */
	public void insertAtFront(T data);
	
	/**
	 * Método de inserción de la lista enlazada de nodos, inserta en T data por el lado trasero de la lista de nodos.
	 * @param <T> data elemento a insertar en la lista de nodos.
	 * */
	public void insertAtBack(T data);
	
	/**
	 * Método que elimina el último elemento que se encuentre del lado superior del lado frontal de la lista de nodos.
	 * @throws EmptyStructureException es lanzada la excepción siempre y cuando se trate de eliminar un elemento
	 * cuando la lista de nodos se encuentre sin datos insertados, es decir, vacía.
	 * @return <T> elemento eliminado de la lista de nodos.
	 * */
	public T removedFromFront() throws EmptyStructureException;
	
	/**
	 * Método que elimina el último elemento que se encuentre del lado trasero de la lista de nodos.
	 * @throws EmptyStructureException es lanzada la excepción siempre y cuando se trate de eliminar un elemento
	 * cuando la lista de nodos se encuentre sin datos insertados, es decir, vacía.
	 * @return <T> elemento eliminado de la lista de nodos.
	 * */
	public T removedFromBack() throws EmptyStructureException;
	
	/**
	 * Método que vacía la lista de nodos.
	 * @throws EmptyStructureException EmptyStructureException es lanzada la excepción siempre y cuando se trate de eliminar un elemento
	 * cuando la lista de nodos se encuentre sin datos insertados, es decir, vacía.
	 * */
}


















