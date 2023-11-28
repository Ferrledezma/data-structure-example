package estructuras.lineal.colas.diseño.implementacion.dinamica;

import estructuras.lineal.colas.diseño.modelo.QueueSemiImpModel;
import estructuras.tipo_dato.lineal.NodeType;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;
/**
 * Clase que define la estructura de una cola dinámica.
 * @author Ledezma
 * */
public class DynamicQueue<T> extends QueueSemiImpModel<T> {
	private NodeType<T> firstNode;
	private NodeType<T> lastNode;

	public DynamicQueue() {
		this(ConstantStructureName.QUEUE_DYNAMIC_NAME);
	}

	public DynamicQueue(String queueType) {
		this.queueType = queueType;
		firstNode = lastNode = null;
	}
	@Override
	public void enqueue(T data) {
		if(isEmpty()) {
			firstNode = lastNode = new NodeType<>(data);
		} else {
			lastNode = new NodeType<>(data, lastNode);
		}
	}

	@Override
	public T dequeue() throws EmptyStructureException{
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.FAILED_DELETION_STRUCTURE_EMPTY, queueType));
		
		T removedData = lastNode.getData();
		
		if(lastNode.equals(firstNode)) {
			firstNode = lastNode = null;
		} else {
			NodeType<T> currentNode = lastNode;
			
			while(!currentNode.equals(firstNode)) {
				currentNode = currentNode.getNextNode();
			}
			
			currentNode.setNextNode(null);
			lastNode = currentNode;
		}
		
		return removedData;
	}

	@Override
	public int size() {
		int size = 0;
		if(!isEmpty()) {
			NodeType<T> currentNode = lastNode;
			
			while(currentNode != null) {
				size++;
				currentNode = currentNode.getNextNode();
			}
		}
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		return firstNode == null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void print() {
		if(isEmpty()) {
			System.out.println(String.format(ConstantStructureErrorMessage.NO_PRINT_STRUCTURE_EMPTY, queueType));
			return;
		}
		
		int size = size();
		
		T[] containerData = (T[]) new Object[size];
		
		NodeType<T> currentNode = lastNode;
		
		for(int i = 0; i < size; i++) {
			containerData[i] = currentNode.getData();
			currentNode = currentNode.getNextNode();
		}
		
		System.out.print("'");
		
		for(int i = (size - 1); i >= 0; i--) {
			String space = i == 0 ? "" : ", ";
			System.out.printf("%s%s", containerData[i], space);
		}
		
		System.out.print("'\n");
	}
}















