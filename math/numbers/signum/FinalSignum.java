package math.numbers.signum;

import java.util.Optional;

import math.*;

import math.number_exceptions.*;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;
import math.numbers.whole_number.FinalWholeNumber;

public final class FinalSignum
extends AbstractSignum
{
    public FinalSignum()
    {
        super();
    }
    
    public FinalSignum(int argument_signum)
    {
        super(argument_signum);
    }

    
    // Constructor
    public FinalSignum
    (
            SomeInternalRepresentationForSignum
            ArgumentInstanceInternalRepresentationForSignum
    )
    {
        super(ArgumentInstanceInternalRepresentationForSignum);
    }
    
    
}
