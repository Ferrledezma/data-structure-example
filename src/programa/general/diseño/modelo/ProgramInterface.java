package programa.general.diseño.modelo;
/**
 * Interface genérica que define el modelo básico de un programa para manipular estructuras de datos.
 * @author Ledezma
 * */
public interface ProgramInterface<T> {
	/**
	 * Método que corre el menú del programa.
	 * @param message mensaje que se imprimirá en pantalla.
	 * */
	public void runProgram(String message);
	
	/**
	 * Método que direcciona a la opción seleccionada para manipular la lista.
	 * @param selectedOption opción seleccionada que rediccionará al método de la estructura o servicio de estructura que se debe ejecutar.
	 * */
	public void structureOptions(int selectedOption);
	
	/**
	 * Método de ingreso de datos para la inserción de la lista de nodos
	 * @return dato que se insertará en la lista de nodos.
	 * */
	public T generateStructureData();
	
	/**
	 * Método encargado de generar el mensaje final cuando se cierra el programa.
	 * @param option la última opción que fue ingresada.
	 * @param numberOptions cantidad de opciones que estaban disponibles para ser seleccionada.
	 * */
	public void programClosingMessage(Integer option, Integer numberOptions);
	
	/**
	 * Método que cuenta la cantidad de digitos numéricos que posee una cadena de texto.
	 * @param text texto que se le contarán los digitos numéricos.
	 * @return cantidad de digitos de la cadena del parámetro.
	 * */
	public int countTextDigit(String text);
}
