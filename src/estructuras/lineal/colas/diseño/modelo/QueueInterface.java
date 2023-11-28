package estructuras.lineal.colas.diseño.modelo;

import estructuras.lineal.diseño.modelo.StructureInterface;
import general.exception.EmptyStructureException;

/**
 * Interfaz que define la estrucra básica de una estructura de cola.
 * @author Ledezma
 * */
public interface QueueInterface<T> extends StructureInterface {
	/**
	 * Método que inserta el elemento al final de la estructura de cola, es decir, por la parte trasera o final.
	 * @param dato a insertar en la estructura de cola.
	 * */
	public void enqueue(T data);
	
	/**
	 * Método que remueve el elemento que se encuentra al principio de la cola, es decir, quita elementos en el orden
	 * que fueron insertados.
	 * @throws EmptyStructureException es lanza si se intentan eliminar datos de una estructura que no contiene elementos
	 * @return retorna el elemento eliminado de la estructura de cola.
	 * */
	public T dequeue() throws EmptyStructureException;
}














