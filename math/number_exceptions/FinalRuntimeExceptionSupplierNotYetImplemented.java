package math.number_exceptions;

public final class FinalRuntimeExceptionSupplierNotYetImplemented
extends RuntimeException
{

    public FinalRuntimeExceptionSupplierNotYetImplemented()
    {
        super();
    }
    
    public FinalRuntimeExceptionSupplierNotYetImplemented(String message)
    {
        super(message);
    }
    
    public FinalRuntimeExceptionSupplierNotYetImplemented
    (String nameOfOperation, Object firstArgument)
    {
        super
        (
              "\nBinary operation not yet implemented:\n"
            + "\"<" + firstArgument.getClass().getName() + ">" 
            + "." + nameOfOperation + "()\""
            + "."
        );
    }
    
}
