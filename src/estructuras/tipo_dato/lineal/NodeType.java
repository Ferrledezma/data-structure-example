package estructuras.tipo_dato.lineal;
/**
 * Clase que define la estructura de nodo para estructuras de datos lineales
 * @author Ledezma
 * */
public class NodeType<T> {
	/*Properties*/
	private T data;
	private NodeType<T> nextNode;

	/*Constructs*/
	public NodeType(T data) {
		this(data, null);
	}
	
	public NodeType(T data, NodeType<T> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}

	/*Methods*/
	public T getData() {
		return data;
	}

	public NodeType<T> getNextNode() {
		return nextNode;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNextNode(NodeType<T> nextNode) {
		this.nextNode = nextNode;
	}
	
}
