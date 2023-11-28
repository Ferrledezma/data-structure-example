package estructuras.lineal.pilas.diseño.modelo;

import general.constant.ConstantStructureErrorMessage;
import general.exception.EmptyStructureException;

/**
 * Generic abstract class que define la implementación parcial de la interface StackInteface para generar una pila.
 * @author Ledezma
 * */
public abstract class SemiImpStackModel<T> implements StackInterface<T>{
	/*Properties*/
	protected T topData;
	protected String typeStack;
	
	/*Methods*/
	@Override
	public void clear() throws EmptyStructureException {
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.FAILED_EMPTY, typeStack));
		
		while(!isEmpty())
			pop();
	}
	
	@Override
	public boolean isEmpty() {
		return topData == null;
	}
	
	@Override
	public T peek() {
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.CANNOT_GET_DATA_STRUCTURE_EMPTY, typeStack));
		
		return topData;
	}
	
}















