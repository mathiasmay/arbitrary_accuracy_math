package math.number_exceptions;

public final class FinalRuntimeExceptionNotYetImplemented
extends RuntimeException
{

    public FinalRuntimeExceptionNotYetImplemented()
    {
        super();
    }
    
    public FinalRuntimeExceptionNotYetImplemented(String message)
    {
        super(message);
    }
    
    public FinalRuntimeExceptionNotYetImplemented
    (String nameOfOperation, Object firstArgument, Object secondArgument)
    {
        super
        (
              "\nOperation not yet implemented for these arguments:\n"
            + "\"<" + firstArgument.getClass().getName() + ">" 
            + "." + nameOfOperation + "("
            + "<" + secondArgument.getClass().getName() + ">)\""
            + "."
        );
    }
    
}
