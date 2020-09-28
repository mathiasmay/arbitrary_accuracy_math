package math.number_exceptions;

public final class FinalRuntimeExceptionEqualityCheckNotYetImplemented
extends RuntimeException
{

    public FinalRuntimeExceptionEqualityCheckNotYetImplemented()
    {
        super();
    }
    
    public FinalRuntimeExceptionEqualityCheckNotYetImplemented(String message)
    {
        super(message);
    }
    
    public FinalRuntimeExceptionEqualityCheckNotYetImplemented
    (String nameOfOperation, Object firstArgument, Object secondArgument)
    {
        super
        (
              "\nEquality check not yet implemented:\n"
            + "\"<" + firstArgument.getClass().getName() + ">" 
            + "." + nameOfOperation + "("
            + "<" + secondArgument.getClass().getName() + ">)\""
            + "."
        );
    }
    
}
