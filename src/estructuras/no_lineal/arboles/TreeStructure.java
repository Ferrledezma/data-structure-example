package estructuras.no_lineal.arboles;

import estructuras.tipo_dato.no_lineal.TreeNodeType;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;
import general.exception.NotValidDataException;
/**
 * Clase que implementa la interface TreeInterface que da funcionalidades de una estructura de árbol.
 * @author Ledezma
 * */
public class TreeStructure<T extends Comparable<T>> implements TreeInterface<T> {
	private TreeNodeType<T> root;
	private String treeType;

	public TreeStructure() {
		this(null, ConstantStructureName.TREE_NAME);
	}
	public TreeStructure(T data) {
		this(data, ConstantStructureName.TREE_NAME);
	}
	public TreeStructure(String treeType) {
		this(null, treeType);
	}
	public TreeStructure(T data, String treeType) {
		if(data != null)
			insert(data);
		
		this.treeType = treeType;
	}

	@Override
	public void insert(T data) throws NotValidDataException {
		if(root == null)
			root = new TreeNodeType<>(data);
		else
			insert(root, data);
	}
	
	private void insert(TreeNodeType<T> node, T data) {
		if(data == null) {
			System.out.println(String.format(ConstantStructureErrorMessage.NOT_VALID_DATA, treeType));
			return;
		}
		
		if(data.compareTo(node.getData()) < 0) {
			if(node.getLeftNode() == null)
				node.setLeftNode(new TreeNodeType<T>(data));
			else
				insert(node.getLeftNode(), data);
		} else if(data.compareTo(node.getData()) > 0) {
			if(node.getRightNode() == null)
				node.setRightNode(new TreeNodeType<>(data));
			else
				insert(node.getRightNode(), data);
		}
	}
	
	@Override
	public boolean exists(T data) throws EmptyStructureException {
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.CANNOT_GET_DATA_STRUCTURE_EMPTY, treeType));
		
		return exists(root, data);
	}
	
	private boolean exists(TreeNodeType<T> node, T data) {
		if(node == null)
			return false;
		
		if(data.compareTo(node.getData()) == 0)
			return true;
		
		else if(data.compareTo(node.getData()) < 0)
			return exists(node.getLeftNode(), data);
		
		else
			return exists(node.getRightNode(), data);
	}
	
	@Override
	public void clear() throws EmptyStructureException {
		if(isEmpty())
			throw new EmptyStructureException(String.format(ConstantStructureErrorMessage.EMPTY_STRUCTURE_ERROR, ConstantStructureName.TREE_NAME));
		
		root = null;
	}
	
	@Override
	public int size() {
		return size(root);
	}
	
	private int size(TreeNodeType<T> node) {
		if(node == null)
			return 0;
		
		return 1 + size(node.getLeftNode()) + size(node.getRightNode());
	}
	
	@Override
	public boolean isEmpty() {
		return root == null;
	}
	
	@Override
	public void preOrderTraversal() {
		if(isEmpty()) {
			System.out.println(String.format(ConstantStructureErrorMessage.NO_PRINT_STRUCTURE_EMPTY, treeType));
			return;
		}
		
		preOrderTraversal(root);
	}
	
	private void preOrderTraversal(TreeNodeType<T> node) {
		if(node == null)
			return;
		
		System.out.printf("\n%s",node.getData());
		
		preOrderTraversal(node.getLeftNode());
		
		preOrderTraversal(node.getRightNode());
	}
	
	@Override
	public void inOrderTraversal() {
		if(isEmpty()) {
			System.out.println(String.format(ConstantStructureErrorMessage.NO_PRINT_STRUCTURE_EMPTY, treeType));
			return;
		}
		
		inOrderTraversal(root);
	}
	
	private void inOrderTraversal(TreeNodeType<T> node) {
		if(node == null)
			return;
		
		inOrderTraversal(node.getLeftNode());
		
		System.out.printf("\n%s",node.getData());
		
		inOrderTraversal(node.getRightNode());
	}
	
	@Override
	public void postOrderTraversal() {
		if(isEmpty()) {
			System.out.println(String.format(ConstantStructureErrorMessage.NO_PRINT_STRUCTURE_EMPTY, treeType));
			return;
		}
		
		postOrderTraversal(root);
	}
	
	private void postOrderTraversal(TreeNodeType<T> node) {
		if(node == null)
			return;
		
		postOrderTraversal(node.getLeftNode());
		
		postOrderTraversal(node.getRightNode());
		
		System.out.printf("\n%s",node.getData());
	}

	/*Properties methods*/
	public String getTreeType() {
		return treeType;
	}
	public void setRoot(T data) {
		root = new TreeNodeType<>(data);
	}
}

















