package math.number_exceptions;

public final class FinalRuntimeExceptionBinaryOperationNotYetImplemented
extends RuntimeException
{

    public FinalRuntimeExceptionBinaryOperationNotYetImplemented()
    {
        super();
    }
    
    public FinalRuntimeExceptionBinaryOperationNotYetImplemented(String message)
    {
        super(message);
    }
    
    public FinalRuntimeExceptionBinaryOperationNotYetImplemented
    (String nameOfOperation, Object firstArgument, Object secondArgument)
    {
        super
        (
              "\nBinary operation not yet implemented:\n"
            + "\"<" + firstArgument.getClass().getName() + ">" 
            + "." + nameOfOperation + "("
            + "<" + secondArgument.getClass().getName() + ">)\""
            + "."
        );
    }
    
}
