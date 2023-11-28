package estructuras.lineal.colas.diseño.modelo;

import general.constant.ConstantStructureErrorMessage;
import general.exception.EmptyStructureException;
/**
 * Clase abstracta que de implementación parcial de la interface QueueInterface.
 * @author Ledezma
 * */
public abstract class QueueSemiImpModel<T> implements QueueInterface<T> {
	protected String queueType;
	
	@Override
	public void clear() throws EmptyStructureException{
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.FAILED_EMPTY, queueType));
		
		while(!isEmpty())
			dequeue();
	}
}
