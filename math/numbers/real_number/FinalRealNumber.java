package math.numbers.real_number;

import math.number_representations.real_number.SomeInternalRepresentationForRealNumber;

public final class FinalRealNumber
extends AbstractNumberReal
{
    // Constructor
    public FinalRealNumber()
    {
        super();
    }
    
    // Constructor
    public FinalRealNumber(Integer x)
    {
        super(x);
    }
    
    // Constructor
    public FinalRealNumber(Double x)
    {
        super(x);
    }
    
    // Constructor
    public FinalRealNumber
    (
            SomeInternalRepresentationForRealNumber
            ArgumentInstanceInternalRepresentationForRealNumber
    )
    {
        super(ArgumentInstanceInternalRepresentationForRealNumber);
    }
    
}
