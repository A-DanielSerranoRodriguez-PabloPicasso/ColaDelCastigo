package exceptions;

@SuppressWarnings("serial")
public class ColaExceededSizeException extends ArrayIndexOutOfBoundsException {
	public ColaExceededSizeException(String s) {
		super(s);
	}
}
