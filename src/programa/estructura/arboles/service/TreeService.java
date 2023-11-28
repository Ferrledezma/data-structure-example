package programa.estructura.arboles.service;

import estructuras.no_lineal.arboles.TreeInterface;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureMessage;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;
import general.exception.NotValidDataException;
/**
 * Clase que define la estructura de un servicio para manipular una estructura de árbol.
 * @author Ledezma
 * */
public class TreeService<T extends Comparable<T>> {
	private TreeInterface<T> tree;

	public TreeService(TreeInterface<T> tree) {
		this.tree = tree;
	}

	public void insert(T data) {
		try {
			tree.insert(data);
			System.out.println(String.format(ConstantStructureMessage.ADD_ELEMENT, ConstantStructureName.TREE_NAME, data));
		} catch (NotValidDataException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void clear() {
		try {
			tree.clear();
			
			if(tree.isEmpty())
				System.out.println(String.format(ConstantStructureMessage.EMPTY_STRUCTURE, ConstantStructureName.TREE_NAME));
			else
				System.out.println(String.format(ConstantStructureErrorMessage.EMPTY_STRUCTURE_ERROR, ConstantStructureName.TREE_NAME));
		} catch (EmptyStructureException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void size() {
		int size = tree.size();
		System.out.println(String.format(ConstantStructureMessage.SIZE, ConstantStructureName.TREE_NAME, size));
	}
	
	public void search(T data) {
		boolean contains = tree.exists(data);
		if(contains)
			System.out.println(String.format("The '%s' contains the element '%s'", ConstantStructureName.TREE_NAME, data));
		else
			System.out.println(String.format("The '%s' No contains the element '%s'", ConstantStructureName.TREE_NAME, data));
	}
	
	public void preOrderTraversal() {
		System.out.println(String.format(ConstantStructureMessage.PRINT_ELEMENTS, ConstantStructureName.TREE_NAME));
		System.out.println("pre order method");
		
		tree.preOrderTraversal();
	}
	
	public void inOrderTraversal() {
		System.out.println(String.format(ConstantStructureMessage.PRINT_ELEMENTS, ConstantStructureName.TREE_NAME));
		System.out.println("in order method");
		
		tree.inOrderTraversal();
	}
	
	public void postOrderTraversal() {
		System.out.println(String.format(ConstantStructureMessage.PRINT_ELEMENTS, ConstantStructureName.TREE_NAME));
		System.out.println("post order method");
		
		tree.postOrderTraversal();
	}
}















