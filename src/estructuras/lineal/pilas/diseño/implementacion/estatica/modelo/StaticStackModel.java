package estructuras.lineal.pilas.diseño.implementacion.estatica.modelo;

import java.lang.reflect.Array;

import estructuras.lineal.pilas.diseño.modelo.SemiImpStackModel;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;
import general.exception.FullStructureException;

/**
 * Generic abstract class que define la implementación parcial de la clase abstracta SemiImpStackModel de una pila estática con un arreglo.
 * @autor Ledezma
 * */
public abstract class StaticStackModel<T> extends SemiImpStackModel<T> {
	/*Properties*/
	protected T[] containerData;
	protected int topIndex;

	
	/*Constructs*/
	public StaticStackModel() {
		this(1);
	}
	/**
	 * Constructor sobrecargado que inicializa la pila. Al iniciar los datos de la pila y a al ser de tipo generic casteamos como (T[]) para poder inicializar
	 * el array contenedor que representa los datos de la pila. instanciamos con la clase Array a través de su método newInstance en el cual tomamos
	 * a la clase Object para indicar que el arreglo contendrá cualquier tipo de dato.
	 * 
	 * @param el dato entero size representa el tamaño máximo de la pila.
	 * */
	@SuppressWarnings("unchecked")
	public StaticStackModel(int size) {
		containerData = (T[]) Array.newInstance(Object.class, size);
		topIndex = -1;
		typeStack = ConstantStructureName.STACK_STATIC_SNAME;
	}
	/**
	 * Constructor sobrecargado.
	 * @param recibe como parámetro un arreglo de tipo T[] el cual representará al array que contiene los datos de la pila.
	 * */
	public StaticStackModel(T[] containerData) {
		this.containerData = containerData;
		topIndex = -1;
		typeStack = ConstantStructureName.STACK_STATIC_SNAME;
	}

	/**
	 * Método de inserción de datos de la pila. Toma el tipo de dato de la pila y comprueba si está se encuentra llena, en caso
	 * de que se encuentre vacía inserta el dato en la pila y en el caso que se encuentre llena lanza una excepción.
	 * 
	 * @throws FullStructureException si la pila se encuentra al tope de su capacidad lanza un excepción para indicar que no se pueden
	 * agregar más elementos a la pila.
	 * */
	/*Methods*/
	@Override
	public void push(T data) throws FullStructureException {
		if(isFull())
			throw new FullStructureException(String.format(ConstantStructureErrorMessage.ERROR_ADDING_STRUCTURE_FULL, typeStack));
		
		topIndex++;
		topData = containerData[topIndex] = data;
	}
	
	@Override
	public T pop() throws EmptyStructureException{
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.FAILED_DELETION_STRUCTURE_EMPTY, typeStack));
		
		T removedData = topData;
		
		containerData[topIndex] = null;
		
		topIndex--;
		
		topData = topIndex < 0 ? null : containerData[topIndex];
		
		return removedData;
	}
	
	@Override
	public int size() {
		int size = 0;
		
		if(!isEmpty()) {
			for(T element : containerData) {
				if(element != null)
					size++;
				else
					break;
			}
		}
		
		return size;
	}
	
	@Override
	public void print() {
		if(isEmpty()) {
			System.out.println(String.format(ConstantStructureErrorMessage.NO_PRINT_STRUCTURE_EMPTY, typeStack));
			return;
		}
		
		int index = 0;
		
		System.out.print("'");
		
		while(index != topIndex + 1) {
			String space = index != topIndex ? ", " : "";
			System.out.print(containerData[index] + space);
			index++;
		}
		
		System.out.print("'\n");
	}
	
	/**
	 * Método que verifica si la pila de datos se encuentra en su máxima capacidad.
	 * 
	 * @return returna un booleano que indica si la pila está llena o no.
	 * */
	public boolean isFull() {
		return topIndex == containerData.length - 1;
	}
}



























