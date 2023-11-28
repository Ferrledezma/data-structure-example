package estructuras.tipo_dato.no_lineal;
/**
 * Clase que define la estructura de un nodo para una estructura de datos no lineal, como un árbol.
 * */
public class TreeNodeType<T extends Comparable<T>> {
	/*Properties*/
	private TreeNodeType<T> leftNode;
	private T data;
	private TreeNodeType<T> rightNode;

	/*Constructs*/
	public TreeNodeType(T data) {
		this.data = data;
		leftNode = rightNode = null;
	}

	/*Getters and setters*/
	public TreeNodeType<T> getLeftNode() {
		return leftNode;
	}

	public T getData() {
		return data;
	}

	public TreeNodeType<T> getRightNode() {
		return rightNode;
	}

	public void setLeftNode(TreeNodeType<T> leftNode) {
		this.leftNode = leftNode;
	}

	public void setRightNode(TreeNodeType<T> rightNode) {
		this.rightNode = rightNode;
	}
}
