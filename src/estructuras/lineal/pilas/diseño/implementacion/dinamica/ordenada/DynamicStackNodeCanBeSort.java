package estructuras.lineal.pilas.diseño.implementacion.dinamica.ordenada;

import java.util.ArrayList;
import java.util.List;

import estructuras.lineal.pilas.diseño.implementacion.dinamica.modelo.DynamicStackNodeModel;
import estructuras.tipo_dato.lineal.NodeType;
import general.constant.ConstantSort;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureMessage;
import general.exception.NotValidDataException;

/**
 * Generic class que define la implementación de la clase DynamicStackNodeModel para generar una pila dinámica que se puede ordenar
 * @author Ledezma
 * */
public class DynamicStackNodeCanBeSort<T extends Comparable<T>> extends DynamicStackNodeModel<T> {

	public DynamicStackNodeCanBeSort() {
		super();
	}

	/**
	 * @throws NotValidDataException lanza la axcepción si la cadena del parámetro no contiene el valor de "ascendente" o "descendente".
	 * */
	@Override
	public void sortStack(String direction) throws NotValidDataException {
		if(isEmpty())
			System.out.println(String.format(ConstantStructureErrorMessage.NO_SORT_BY_EMPTY_STRUCTURE, typeStack));
		
		NodeType<T> currentNode = node;
		
		List<T> list = new ArrayList<>();
		
		while(currentNode != null) {
			list.add(pop());
			currentNode = currentNode.getNextNode();
		}
		
		if(direction.equalsIgnoreCase(ConstantSort.SORT_FROM_UPWARD))
			list.sort((o1, o2) -> o2.compareTo(o1)); //Comparator.naturalOrder()
		else if(direction.equalsIgnoreCase(ConstantSort.SORT_FROM_DESCENDING))
			list.sort((o1, o2) -> o1.compareTo(o2)); //Comparator.reverseOrder()
		else {
			throw new NotValidDataException(String.format(ConstantStructureErrorMessage.NOT_VALID_SORT, typeStack, direction));
		}
		
		for(T data : list) {
			push(data);
		}
		
		System.out.println(String.format(ConstantStructureMessage.SORT_MESSAGE, typeStack, direction));
	}
}












