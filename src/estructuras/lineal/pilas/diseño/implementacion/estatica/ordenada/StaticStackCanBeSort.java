package estructuras.lineal.pilas.diseño.implementacion.estatica.ordenada;

import estructuras.lineal.pilas.diseño.implementacion.estatica.modelo.StaticStackModel;
import general.constant.ConstantSort;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureMessage;
import general.constant.ConstantStructureName;
import general.exception.NotValidDataException;

/**
 * Generic class que define la implementación de la clase StaticStackModel para generar una pila estática que se puede ordenar
 * @author Ledezma
 * */
public class StaticStackCanBeSort<T extends Comparable<T>> extends StaticStackModel<T> {
	
	/*Constructs*/
	public StaticStackCanBeSort() {
		this(1);
	}
	
	@SuppressWarnings("unchecked")
	public StaticStackCanBeSort(int size) {
		containerData = (T[]) new Comparable[size];
		topIndex = -1;
		typeStack = ConstantStructureName.STACK_STATIC_SNAME;
	}
	
	public StaticStackCanBeSort(T[] containerData) {
		super(containerData);
	}

	/**
	 * @throws NotValidDataException lanza la axcepción si la cadena del parámetro no contiene el valor de "ascendente" o "descendente".
	 * */
	/*Methods*/
	public void sortStack(String direction) throws NotValidDataException {
		if(isEmpty()) {
			System.out.println(String.format(ConstantStructureErrorMessage.NO_SORT_BY_EMPTY_STRUCTURE, typeStack));
			return;
		}
		
		for(int i = 0; i < topIndex + 1; i++) {
			T aux = containerData[i];
			
			for(int j = 0; j < topIndex + 1; j++) {
				
				if(direction.equalsIgnoreCase(ConstantSort.SORT_FROM_UPWARD)) {
					if(aux.compareTo(containerData[j]) < 0) {
						containerData[i] = containerData[j];
						containerData[j] = aux;
					}
				} else if(direction.equalsIgnoreCase(ConstantSort.SORT_FROM_DESCENDING) || direction == null) {
					if(aux.compareTo(containerData[j]) > 0) {
						containerData[i] = containerData[j];
						containerData[j] = aux;
					}
				} else {
					throw new NotValidDataException(String.format(ConstantStructureErrorMessage.NOT_VALID_SORT, typeStack, direction));
				}
				
				aux = containerData[i];
			}
		}
		System.out.println(String.format(ConstantStructureMessage.SORT_MESSAGE, typeStack, direction));
	}
}


