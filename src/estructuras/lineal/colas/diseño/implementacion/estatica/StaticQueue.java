package estructuras.lineal.colas.diseño.implementacion.estatica;

import estructuras.lineal.colas.diseño.modelo.QueueSemiImpModel;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;
import general.exception.FullStructureException;
/**
 * Clase que define la estructura de una cola estática.
 * @author Ledezma
 * */
public class StaticQueue<T> extends QueueSemiImpModel<T> {
	private T[] containerData;
	private final int SIZE;
	private int indexLastElement;
	private int numberElements;
	
	public StaticQueue(int size) {
		this(size, ConstantStructureName.QUEUE_STATIC_NAME);
	}
	
	@SuppressWarnings("unchecked")
	public StaticQueue(int size, String queueType) {
		this.SIZE = size;
		this.queueType = queueType;
		this.containerData = (T[]) new Object[SIZE];
		indexLastElement = -1;
		numberElements = 0;
	}
	
	@Override
	public void enqueue(T data) throws FullStructureException{
		if(isFull())
			throw new FullStructureException(String.format(ConstantStructureErrorMessage.ERROR_ADDING_STRUCTURE_FULL, queueType));
		
		indexLastElement = (indexLastElement + 1) % SIZE;
		
		containerData[indexLastElement] = data;
		
		numberElements++;
	}

	@Override
	public T dequeue() throws EmptyStructureException {
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.FAILED_DELETION_STRUCTURE_EMPTY, queueType));
		
		T removedData = containerData[0];
		
		for(int i = 1; i < numberElements; i++) {
			containerData[i - 1] = containerData[i];
		}
		
		containerData[indexLastElement] = null;
		
		indexLastElement = (indexLastElement - 1 + SIZE) % SIZE;
		
		numberElements--;
		
		return removedData;
	}

	@Override
	public int size() {
		return numberElements;
	}

	@Override
	public boolean isEmpty() {
		return numberElements == 0;
	}

	@Override
	public void print() {
		if(isEmpty()) {
			System.out.println(String.format(ConstantStructureErrorMessage.NO_PRINT_STRUCTURE_EMPTY, queueType));
			return;
		}
		
		System.out.println(queueType.toUpperCase());
		System.out.print("\n'");
		
		for(int i = 0; i < numberElements; i++) {
			String space = i + 1 == numberElements ? "" : ", ";
			System.out.print(containerData[i] + space);
		}
		
		System.out.print("'\n");
	}
	
	public boolean isFull() {
		return numberElements == SIZE;
	}
}















