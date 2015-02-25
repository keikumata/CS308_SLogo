package errors;

public class CommandNotFoundException extends SLogoException{
	// for serialization
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor that attaches a message of the error
	 * 
	 * @param message
	 */
	public CommandNotFoundException(String message, Object ... values) {
		super(String.format(message+ " is not a valid command", values));
	}

    public CommandNotFoundException (Throwable cause, String message, Object ... values) {
        super(String.format(message, values));
    }

    /**
     * Create an exception based on a caught exception, with no additional message.
     */
    public CommandNotFoundException (Throwable exception) {
        super(exception);
    }
}