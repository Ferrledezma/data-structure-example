package programa.general.entrada_datos;

import java.util.Scanner;

import programa.general.dato.PersonRecord;
/**
 * Clase encargada de generar los datos que se usarán en los diferentes tipos de programas. 
 * */
public class GenerateData {
	private static GenerateData instance;
	private Scanner input = new Scanner(System.in);

	private GenerateData() {
		
	}

	public static GenerateData generateInstance() {
		if(instance == null) {
			return new GenerateData();
		}
		
		return instance;
	}
	
	public Integer generateInteger(String message) {
		System.out.println(message);
		return input.nextInt();
	}
	public Long generateLong(String message) {
		System.out.println(message);
		return input.nextLong();
	}
	public Double generateDouble(String message) {
		System.out.println(message);
		return input.nextDouble();
	}
	public Character generateCharacter(String message) {
		System.out.println(message);
		return input.next().charAt(0);
	}
	public String generateString(String message) {
		System.out.println(message);
		return input.next();
	}
	public PersonRecord generateRecord() {
		return PersonRecord.builder()
				.lastName(generateString("Last name: "))
				.forName(generateString("Name: "))
				.age(generateInteger("Age"))
				.build();
	}
}


























