package programa.estructura.colas.service;

import estructuras.lineal.colas.diseño.modelo.QueueInterface;
import general.constant.ConstantStructureMessage;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;
import general.exception.FullStructureException;
import programa.general.service.diseño.modelo.ServiceModel;
/**
 * Clase que define la estructura de un servicio para la manipulación de una estructura de tipo Colas
 * @author Ledezma
 * */
public class QueueService<T> extends ServiceModel {
	private QueueInterface<T> queue;

	public QueueService(QueueInterface<T> queue) {
		super(queue);
		this.queue = queue;
	}

	/**
	 * Método que manipula la estructura de cola inserción de elementos.
	 * @param data elemento a insertar en la estructura de cola
	 * */
	public void enqueue(T data) {
		try {
			queue.enqueue(data);
			System.out.println(String.format(ConstantStructureMessage.ADD_ELEMENT, ConstantStructureName.QUEUE_NAME, data));
		} catch (FullStructureException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Método que manipula la estructura de cola para la eliminación de un elemento.
	 * */
	public void dequeue() {
		T removedData;
		try {
			removedData = queue.dequeue();
			System.out.println(String.format(ConstantStructureMessage.REMOVED_ELEMENT, ConstantStructureName.QUEUE_NAME, removedData));
		} catch(EmptyStructureException e) {
			System.err.println(e.getMessage());
		}
	}
}
