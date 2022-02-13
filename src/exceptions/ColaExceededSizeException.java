package exceptions;

public class ColaExceededSizeException extends ArrayIndexOutOfBoundsException {
	public ColaExceededSizeException(String s) {
		super(s);
	}
}
