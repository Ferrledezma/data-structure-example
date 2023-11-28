package estructuras.lineal.pilas.diseño.implementacion.estatica.desordenada;

import estructuras.lineal.pilas.diseño.implementacion.estatica.modelo.StaticStackModel;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureName;

/**
 * Generic class que define la implementación de la clase StaticStackModel para generar una pila estática que no se puede ordenar.
 * @author Ledezma
 * */
public class StaticStackCannotSort<T> extends StaticStackModel<T> {
	
	public StaticStackCannotSort() {
		this(1);
	}
	
	@SuppressWarnings("unchecked")
	public StaticStackCannotSort(int size) {
		containerData = (T[]) new Comparable[size];
		topIndex = -1;
		typeStack = ConstantStructureName.STACK_STATIC_SNAME;
	}
	
	public StaticStackCannotSort(T[] containerData) {
		super(containerData);
	}

	@Override
	public void sortStack(String direction) {
		System.out.println(String.format(ConstantStructureErrorMessage.NO_SORT_STRUCTURE, typeStack));
	}

}
