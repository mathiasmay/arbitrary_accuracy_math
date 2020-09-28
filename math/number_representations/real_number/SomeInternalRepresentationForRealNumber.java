package math.number_representations.real_number;

import math.number_representations.Magnitude_is_available_as_FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;
import math.number_representations.Magnitude_is_available_as_FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.Signum_is_available_as_FinalInternalRepresentationForSignum;
import math.number_representations.SomeInternalRepresentation;
import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.signum.SomeInternalRepresentationForSignum;

public interface SomeInternalRepresentationForRealNumber
extends SomeInternalRepresentation,
Magnitude_is_available_as_FinalInternalRepresentationForRealNumberAsASequenceOfDigits,
Signum_is_available_as_FinalInternalRepresentationForSignum
{
	public SomeInternalRepresentationForRealNumber
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForRealNumber x);
	

	public abstract SomeInternalRepresentationForRealNumber
        plus(SomeInternalRepresentationForRealNumber x);
    public abstract SomeInternalRepresentationForRealNumber
        minus(SomeInternalRepresentationForRealNumber x);
    public abstract SomeInternalRepresentationForRealNumber
        times(SomeInternalRepresentationForRealNumber x);
    public abstract SomeInternalRepresentationForRealNumber
    	dividedBy(SomeInternalRepresentationForRealNumber x);
    public abstract SomeInternalRepresentationForRealNumber
    	dividedBy(SomeInternalRepresentationForRealNumber x, int accuracy);

    public abstract boolean
        isEqualTo(SomeInternalRepresentationForRealNumber x);
    public abstract boolean
    	isSimilarTo(SomeInternalRepresentationForRealNumber x);
    public abstract boolean 
        isBiggerThan(SomeInternalRepresentationForRealNumber x);
    public abstract boolean
    	isSmallerThan(SomeInternalRepresentationForRealNumber x);
    public abstract boolean
		isZero();
    public abstract boolean
		isPositive();
    
    
    public abstract boolean 
        hasSameMagnitudeAs(SomeInternalRepresentationForRealNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(SomeInternalRepresentationForRealNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(SomeInternalRepresentationForRealNumber x);
}
