package math.number_exceptions;

public final class FinalRuntimeExceptionIllegalArgumentException
extends IllegalArgumentException
{

    public FinalRuntimeExceptionIllegalArgumentException()
    {
        super();
    }
    
    public FinalRuntimeExceptionIllegalArgumentException(String message)
    {
        super(message);
    }
    
    public FinalRuntimeExceptionIllegalArgumentException
    (Object value, Object classTheValueWasAttemptedToBeAssignedTo)
    {
        super
        (
              "\nThe value " + value + " can not be assigned to a "
            + classTheValueWasAttemptedToBeAssignedTo.getClass().getName()
        );
    }
    
}
