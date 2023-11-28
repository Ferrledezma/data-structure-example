package estructuras.lineal.pilas.diseño.implementacion.dinamica.desordenada;

import estructuras.lineal.pilas.diseño.implementacion.dinamica.modelo.DynamicStackNodeModel;
import general.constant.ConstantStructureErrorMessage;

/**
 * Generic class que define la implementación de la clase abstracta DynamicStackNodeModel para generar una pila dinámica que no se puede ordenar.
 * @author Ledezma
 * */
public class DynamicStackNodeCannoSort<T> extends DynamicStackNodeModel<T> {
	public DynamicStackNodeCannoSort() {
		super();
	}
	/**
	 * Método de ordenamiento de datos no se encuentra disponible para este tipo de clase.
	 * @deprecated para usar métodos de ordenamiento, se recomienda usar clases que estén especializadas en el ordenamiento de datos
	 * */
	@Override
	public void sortStack(String direction) {
		System.out.println(String.format(ConstantStructureErrorMessage.NO_SORT_STRUCTURE, typeStack));
	}
}
