package estructuras.lineal.pilas.diseño.modelo;

import estructuras.lineal.diseño.modelo.StructureInterface;
import general.exception.EmptyStructureException;

/**
 * Generic interface de métodos básicos de una pila
 * @author Ledezma
 * */
public interface StackInterface<T> extends StructureInterface {
	/**
	 * Método de inserción de datos de una pila. Inserta el dato en la parte superior de la pila.
	 * @param <T> data es el dato a insertar
	 * */
	public void push(T data);
	
	/**
	 * Método para remover el último dato insertado en la pila, es decir, el dato que se encuentra en la cima de la pila.
	 * 
	 * @throws EmptyStructureException si se trata de eliminar un dato y la pila se encuentra sin elementos, es decir, si la pila está vacía lanza una excepción.
	 * 
	 * @return <T> retorna el dato eliminado, es decir, el dato que estaba en la cima de la pila.
	 * */
	public T pop() throws EmptyStructureException;
	
	/**
	 * Método que cuenta cada uno de los datos que se encuentran vigentes en la pila.
	 * 
	 * @return retorna el tamaño de la pila.
	/**
	 * Método que devuelve el dato que se encuentra en la cima de la pila, es decir, el último dato insertado.
	 * @return dato de tipo T que se encuentra en la cima de la pila
	 * */
	public T peek();
	
	/**
	 * Ordena los datos de la pila en orden ascendente o descendente según se lo indique
	 * @param direction dirección en la que la pila va a ordenarse
	 * */
	public void sortStack(String direction);
}
