package math.number_representations.rational_number;

import math.PositiveWholeNumber;
import math.Signum;
import math.WholeNumber;
import math.number_representations.Signum_is_available_as_FinalInternalRepresentationForSignum;
import math.number_representations.SomeInternalRepresentation;
import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;

public interface SomeInternalRepresentationForRationalNumber
extends SomeInternalRepresentation,
Signum_is_available_as_FinalInternalRepresentationForSignum
{
	public SomeInternalRepresentationForRationalNumber
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForRationalNumber x);
	


	
	public abstract SomeInternalRepresentationForRationalNumber
        plus(SomeInternalRepresentationForRationalNumber x);
    public abstract SomeInternalRepresentationForRationalNumber
        minus(SomeInternalRepresentationForRationalNumber x);
    public abstract SomeInternalRepresentationForRationalNumber
        times(SomeInternalRepresentationForRationalNumber x);
    public abstract SomeInternalRepresentationForRationalNumber
    	dividedBy(SomeInternalRepresentationForRationalNumber x);
    public abstract SomeInternalRepresentationForRationalNumber
    	dividedBy(SomeInternalRepresentationForRationalNumber x, int accuracy);

    public abstract boolean
        isEqualTo(SomeInternalRepresentationForRationalNumber x);
    public abstract boolean
    	isSimilarTo(SomeInternalRepresentationForRationalNumber x);
    public abstract boolean 
        isBiggerThan(SomeInternalRepresentationForRationalNumber x);
    public abstract boolean
    	isSmallerThan(SomeInternalRepresentationForRationalNumber x);
    public abstract boolean
    	isZero();
    
    public abstract boolean 
        hasSameMagnitudeAs(SomeInternalRepresentationForRationalNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(SomeInternalRepresentationForRationalNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(SomeInternalRepresentationForRationalNumber x);
}
