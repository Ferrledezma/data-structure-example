package estructuras.no_lineal.arboles;

import general.exception.EmptyStructureException;
/**
 * Interfaz que define la estructura básica de una estructura de árbol.
 * @author Ledezma
 * */
public interface TreeInterface<T extends Comparable<T>> {
	/**
	 * Método encargado de la inserción de datos, para insertar los datos llama al método sobrecargado con el mismo nombre para ubicar
	 * en forma correcta la posición en la que se establecerá el dato.
	 * @param data es el elemento que será insertado en el nodo de la estructura de árbol.
	 * */
	public void insert(T data);
	
	/**
	 * Método que se encarga de buscar el elemento indicado en el árbol a través de la llamada del método sobrecargado.
	 * @param data el elemento a buscar en la estructura de árbol.
	 * @throws EmptyStructureException lanza la excepción si se intenta buscar un elemento sobre una estructura de árbol vacía.
	 * @return {@code true} si el elemento existe en la estructura de árbol.
	 * */
	public boolean exists(T data) throws EmptyStructureException;
	
	
	/**
	 * Método que vacía la estructura de árbol.
	 * @throws EmptyStructureException lanza la excepción si trata de limpiar una estructura de árbol que no contiene elementos
	 * */
	public void clear() throws EmptyStructureException;
	
	/**
	 * Método que cálcula el tamanio exacto de la estructura de árbol.
	 * @return tamanio de la estructura de árbol
	 * */
	public int size();
	
	
	/**
	 * Método que cálcula si la estructura de árbol está vacía.
	 * @return {@code true} si la estructura de árbol es vacía.
	 * */
	public boolean isEmpty();
	
	/**
	 * Método que define los pasos del recorrido de la estructura de árbol de forma pre ordenada. Procesa el valor de cada
	 * uno de los nodos a medida que se van visitando
	 * 1-procesa el valor de cada nodo recorrido.
	 * 2-recorre los subarboles de forma recursiva empezando del lado izquierdo al derecho.
	 * */
	public void preOrderTraversal();
	
	/**
	 * Método que define los pasos del recorrido de la estructura de árbol de forma ordenada de forma ascendente.
	 * 1-Recorre el subarbol izquierdo de forma recursiva.
	 * 2-Procesa los valores.
	 * 3-Recorre el subarbol derecho de forma recursiva.
	 * */
	public void inOrderTraversal();
	
	/**
	 * Método que define los pasos del recorrido de la estructura de árbol de forma post ordenada. El recorrido postorden 
	 * procesa el valor en cada nodo después de procesar los valores de todos los hijos de es nodo
	 * 1-Recorre el subarbol izquierdo de forma recursiva.
	 * 2-Recorre el subarbol derecho de forma recursiva.
	 * 2-Procesa los valores.
	 * */
	public void postOrderTraversal();
}
