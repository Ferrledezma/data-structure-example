package estructuras.lineal.listas;

import estructuras.tipo_dato.lineal.NodeType;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;
/**
 * Clase que define la estructura de una estructura de datos de listas enlazadas.
 * @author Ledezma
 * */
public class LinkedListStructure<T> implements LinkedListInterface<T>{
	private NodeType<T> firstNode;
	private NodeType<T> lastNode;
	private String linkedListName;

	public LinkedListStructure() {
		this(ConstantStructureName.LINKED_LIST_NAME);
	}
	
	public LinkedListStructure(String linkedListName) {
		firstNode = lastNode = null;
		this.linkedListName = linkedListName;
	}

	@Override
	public void insertAtFront(T data) {
		if(isEmpty())
			firstNode = lastNode = new NodeType<>(data);
		else
			firstNode = new NodeType<>(data, firstNode);
	}
	
	@Override
	public void insertAtBack(T data) {
		if(isEmpty()) {
			firstNode = lastNode = new NodeType<>(data);
		}
		else {
			lastNode.setNextNode(new NodeType<>(data));
			lastNode = lastNode.getNextNode();
		}
	}
	
	@Override
	public T removedFromFront() throws EmptyStructureException{
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.FAILED_DELETION_STRUCTURE_EMPTY, linkedListName));
		
		T removedData = firstNode.getData();
		
		if(firstNode.equals(lastNode))
			firstNode = lastNode = null;
		else
			firstNode = firstNode.getNextNode();
		
		return removedData;
	}
	
	@Override
	public T removedFromBack() throws EmptyStructureException{
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.FAILED_DELETION_STRUCTURE_EMPTY, linkedListName));
		
		T removedData = lastNode.getData();
		
		if(firstNode.equals(lastNode)) {
			firstNode = lastNode = null;
		} else {
			NodeType<T> currentNode = firstNode;
			
			while(currentNode.getNextNode() != lastNode) {
				currentNode = currentNode.getNextNode();
			}
			
			currentNode.setNextNode(null);
			lastNode = currentNode;
		}
		
		return removedData;
	}
	
	@Override
	public void clear() throws EmptyStructureException {
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.FAILED_EMPTY, linkedListName));
		
		while(!isEmpty())
			removedFromFront();
	}
	
	@Override
	public int size() {
		int size = 0;
		if(!isEmpty()) {
			NodeType<T> currentNode = firstNode;
			
			while(currentNode != null) {
				size++;
				currentNode = currentNode.getNextNode();
			}
		}
		
		return size;
	}
	
	@Override
	public void print() {
		if(isEmpty()) {
			System.out.println(String.format(ConstantStructureErrorMessage.NO_PRINT_STRUCTURE_EMPTY, linkedListName));
			return;
		}
		
		NodeType<T> currentNode = firstNode;
		System.out.print("'");
		
		while(currentNode != null) {
			String space = currentNode.getNextNode() == null ? "" : ", ";
			System.out.printf("%s%s", currentNode.getData(), space);
			currentNode = currentNode.getNextNode();
		}
		System.out.print("'\n");
	}
	
	@Override
	public boolean isEmpty() {
		return firstNode == null;
	}
	
	/*Getters*/
	public String getLinkedListName() {
		return linkedListName;
	}
}














