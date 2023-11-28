package general.constant;

public class ConstantStructureErrorMessage {
	public static final String FAILED_DELETION_STRUCTURE_EMPTY = "Could not delete because the '%s' " + ConstantStructureMessage.IS_EMPTY;
	public static final String ERROR_ADDING_STRUCTURE_FULL = "Could not add because the '%s' " + ConstantStructureMessage.IS_FULL;
	public static final String NO_SORT_STRUCTURE = "The type stack '%s' not supported the ordered method";
	public static final String FAILED_EMPTY = "\nFailure to empty the '%s' because " + ConstantStructureMessage.IS_EMPTY;
	public static final String NO_PRINT_STRUCTURE_EMPTY = "No print because '%s' " + ConstantStructureMessage.IS_EMPTY;
	public static final String NO_SORT_BY_EMPTY_STRUCTURE = "\nCannot be ordered because '%s' " + ConstantStructureMessage.IS_EMPTY;
	public static final String NOT_VALID_SORT = "The '%s' cannot be ordered by %s it is not valid ordering data";
	public static final String CANNOT_GET_DATA_STRUCTURE_EMPTY = "Cannot get data because '%s' " + ConstantStructureMessage.IS_EMPTY;
	public static final String EMPTY_STRUCTURE_ERROR = "Error when trying to empty the '%s'";
	public static final String NOT_VALID_DATA = "The '%s' cannot insert '%s' because is not valid data";
}
