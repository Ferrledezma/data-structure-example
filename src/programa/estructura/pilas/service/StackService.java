package programa.estructura.pilas.service;

import estructuras.lineal.pilas.diseño.modelo.StackInterface;
import general.constant.ConstantStructureMessage;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;
import general.exception.FullStructureException;
import programa.general.service.diseño.modelo.ServiceModel;

/**
 * Esta clase se encarga de minupular la pila y dar mensajes de los resultados de esta.
 * @param <T> el tipo de dato de la pila que se manipula.
 * */
public class StackService<T> extends ServiceModel {
	private StackInterface<T> stack;

	public StackService(StackInterface<T> stack) {
		super(stack);
		this.stack = stack;
	}
	
	/**
	 * Método de manipulación de para la inserción de datos.
	 * @param data es el dato a insertar a la pila
	 * */
	public void push(T data) {
		try {
			stack.push(data);
			System.out.println(String.format(ConstantStructureMessage.ADD_ELEMENT, ConstantStructureName.STACK_NAME, data));
		} catch(FullStructureException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Método de manipulación de la pila que elimina los datos y muestra un mensaje con el dato eliminado.
	 * */
	public void pop() {
		T removedData;
		try {
			removedData = stack.pop();
			System.out.println(String.format(ConstantStructureMessage.REMOVED_ELEMENT, ConstantStructureName.STACK_NAME, removedData));
		} catch (EmptyStructureException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Método de manipulación de pila para ordenamiento
	 * */
	public void sort(String direction) {
		stack.sortStack(direction);
	}
}




















