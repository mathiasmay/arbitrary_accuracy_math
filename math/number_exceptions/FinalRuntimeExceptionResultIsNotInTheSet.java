package math.number_exceptions;

public final class FinalRuntimeExceptionResultIsNotInTheSet
extends RuntimeException
{

    public FinalRuntimeExceptionResultIsNotInTheSet()
    {
        super();
    }
    
    public FinalRuntimeExceptionResultIsNotInTheSet(String message)
    {
        super(message);
    }
    
    public FinalRuntimeExceptionResultIsNotInTheSet
    (String operation, String arg_set, Object firstArgument, Object secondArgument)
    {
        super
        (
                "\nResult of the operation <" + operation
              + "> is not in the set <" + arg_set + ">.\n"
              + firstArgument + "." + operation + "("+ secondArgument + ")"
        );
    }
    
}
