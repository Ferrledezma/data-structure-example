package estructuras.lineal.pilas.diseño.implementacion.dinamica.modelo;

import estructuras.lineal.pilas.diseño.modelo.SemiImpStackModel;
import estructuras.tipo_dato.lineal.NodeType;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;

/**
 * Generic abstract class que define la implementación parcial de la clase SemiImpStackModel para generar una pila dinámica de nodos.
 * @author Ledezma
 * */
public abstract class DynamicStackNodeModel<T> extends SemiImpStackModel<T> {
	/*Properties*/
	protected NodeType<T> node;

	/**
	 * Constructor que inicializa la pila, el nodo se establece como nulo y se le genera un nombre preestablecido a la pila.
	 * /
	/*Constructs*/
	public DynamicStackNodeModel() {
		node = null;
		typeStack = ConstantStructureName.STACK_DYNAMIC_NAME;
	}

	/*Methods*/
	
	@Override
	public void push(T data){
		node = isEmpty() ? new NodeType<T>(data) : new NodeType<T>(data, node);
		
		topData = node.getData();
	}

	@Override
	public T pop() throws EmptyStructureException {
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.FAILED_DELETION_STRUCTURE_EMPTY, typeStack));
		
		T removedData = topData;
		
		node = node.getNextNode();
		
		topData = (node == null) ? null : node.getData();
		
		return removedData;
	}
	
	@Override
	public int size() {
		int size = 0;
		if(!isEmpty()) {
			NodeType<T> currentNode = node;
			
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
			System.out.println(String.format(ConstantStructureErrorMessage.NO_PRINT_STRUCTURE_EMPTY, typeStack));
			return;
		}
		
		System.out.print('"');
		
		NodeType<T> currentNode = node;
		
		while(currentNode != null) {
			String space = currentNode.getNextNode() != null ? ", " : "";
			
			System.out.print(currentNode.getData() + space);
			
			currentNode = currentNode.getNextNode();
		}
		
		System.out.print('"' + "\n");
	}
}













