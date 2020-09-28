package math.number_representations.positive_rational_number;

import math.number_representations.Signum_is_available_as_FinalInternalRepresentationForSignum;
import math.number_representations.SomeInternalRepresentation;
import math.number_representations.rational_number.SomeInternalRepresentationForRationalNumber;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;

public interface SomeInternalRepresentationForPositiveRationalNumber
extends SomeInternalRepresentation,
Signum_is_available_as_FinalInternalRepresentationForSignum
{
	public SomeInternalRepresentationForPositiveRationalNumber
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForPositiveRationalNumber x);
	

	public abstract SomeInternalRepresentationForPositiveRationalNumber
        plus(SomeInternalRepresentationForPositiveRationalNumber x);
    public abstract SomeInternalRepresentationForRationalNumber
        minus(SomeInternalRepresentationForPositiveRationalNumber x);
    public abstract SomeInternalRepresentationForPositiveRationalNumber
        times(SomeInternalRepresentationForPositiveRationalNumber x);
    public abstract SomeInternalRepresentationForPositiveRationalNumber
    	dividedBy(SomeInternalRepresentationForPositiveRationalNumber x);
    public abstract SomeInternalRepresentationForPositiveRationalNumber
    	dividedBy(SomeInternalRepresentationForPositiveRationalNumber x, int accuracy);

    public abstract boolean
        isEqualTo(SomeInternalRepresentationForPositiveRationalNumber x);
    public abstract boolean
    	isSimilarTo(SomeInternalRepresentationForPositiveRationalNumber x);
    public abstract boolean 
        isBiggerThan(SomeInternalRepresentationForPositiveRationalNumber x);
    public abstract boolean
    	isSmallerThan(SomeInternalRepresentationForPositiveRationalNumber x);
    public abstract boolean
    	isZero();
    
    
    public abstract boolean 
        hasSameMagnitudeAs(SomeInternalRepresentationForPositiveRationalNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(SomeInternalRepresentationForPositiveRationalNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(SomeInternalRepresentationForPositiveRationalNumber x);
}
