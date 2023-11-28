package programa.estructura.listas.service;

import estructuras.lineal.listas.LinkedListInterface;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;
import programa.estructura.listas.constant.ConstantLinkedListMessage;
import programa.general.service.diseño.modelo.ServiceModel;
/**
 * Clase que define la estructura de un servicio que manipula una lista enlazada.
 * @author Ledezma
 * */
public class LinkedListService<T> extends ServiceModel{
	private LinkedListInterface<T> linkedList;
	
	public LinkedListService(LinkedListInterface<T> linkedList) {
		super(linkedList);
		this.linkedList = linkedList;
	}
	
	public void insertAtFront(T data) {
		linkedList.insertAtFront(data);
		System.out.println(String.format(ConstantLinkedListMessage.INSERT_AT_FRONT, ConstantStructureName.LINKED_LIST_NAME, data));
	}
	
	public void insertAtBack(T data) {
		linkedList.insertAtBack(data);
		System.out.println(String.format(ConstantLinkedListMessage.INSERT_AT_BACK, ConstantStructureName.LINKED_LIST_NAME, data));
	}
	
	public void removedFromFront() {
		try {
			T data = linkedList.removedFromFront();
			System.out.println(String.format(ConstantLinkedListMessage.REMOVED_FROM_FRONT, ConstantStructureName.LINKED_LIST_NAME, data));
		} catch (EmptyStructureException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void removedFromBack() {
		try {
			T data = linkedList.removedFromBack();
			System.out.println(String.format(ConstantLinkedListMessage.REMOVED_FROM_BACK, ConstantStructureName.LINKED_LIST_NAME, data));
		} catch (EmptyStructureException e) {
			System.err.println(e.getMessage());
		}
	}
}


















