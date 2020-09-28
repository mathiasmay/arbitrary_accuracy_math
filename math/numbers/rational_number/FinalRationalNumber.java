package math.numbers.rational_number;

import math.number_representations.rational_number.SomeInternalRepresentationForRationalNumber;

public final class FinalRationalNumber
extends AbstractNumberRational
{

    
    // Constructor
    public FinalRationalNumber(Integer numerator, Integer denominator)
    {
        super(numerator, denominator);
    }
    
    // Constructor
    public FinalRationalNumber(Double x)
    {
        super(x);
    }
    
    // Constructor
    public FinalRationalNumber
    (
            SomeInternalRepresentationForRationalNumber
            ArgumentInstanceInternalRepresentationForRationalNumber
    )
    {
        super(ArgumentInstanceInternalRepresentationForRationalNumber);
    }
}
