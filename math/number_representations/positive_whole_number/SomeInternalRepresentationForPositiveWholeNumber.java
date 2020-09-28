package math.number_representations.positive_whole_number;

import math.number_representations.Magnitude_is_available_as_FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;
import math.number_representations.Magnitude_is_available_as_FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.Signum_is_available_as_FinalInternalRepresentationForSignum;
import math.number_representations.SomeInternalRepresentation;
import math.number_representations.positive_rational_number.SomeInternalRepresentationForPositiveRationalNumber;
import math.number_representations.rational_number.SomeInternalRepresentationForRationalNumber;
import math.number_representations.real_number.SomeInternalRepresentationForRealNumber;
import math.number_representations.real_number.sequence_of_digits.AlwaysConvertibleTo_FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;

public interface SomeInternalRepresentationForPositiveWholeNumber
extends SomeInternalRepresentation,
AlwaysConvertibleTo_FinalInternalRepresentationForRealNumberAsASequenceOfDigits,
Magnitude_is_available_as_FinalInternalRepresentationForRealNumberAsASequenceOfDigits,
Magnitude_is_available_as_FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits,
Signum_is_available_as_FinalInternalRepresentationForSignum
{
	public SomeInternalRepresentationForPositiveWholeNumber
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForPositiveWholeNumber x);
	

	public abstract SomeInternalRepresentationForPositiveWholeNumber
        plus(SomeInternalRepresentationForPositiveWholeNumber x);
    public abstract SomeInternalRepresentationForWholeNumber
        minus(SomeInternalRepresentationForPositiveWholeNumber x);
    public abstract SomeInternalRepresentationForPositiveWholeNumber
        times(SomeInternalRepresentationForPositiveWholeNumber x);
    public abstract SomeInternalRepresentationForRationalNumber
    	dividedBy(SomeInternalRepresentationForPositiveWholeNumber x);
    public abstract SomeInternalRepresentationForRationalNumber
    	dividedBy(SomeInternalRepresentationForPositiveWholeNumber x, int accuracy);

    public abstract boolean
        isEqualTo(SomeInternalRepresentationForPositiveWholeNumber x);
    public abstract boolean
    	isSimilarTo(SomeInternalRepresentationForPositiveWholeNumber x);
    public abstract boolean 
        isBiggerThan(SomeInternalRepresentationForPositiveWholeNumber x);
    public abstract boolean
    	isSmallerThan(SomeInternalRepresentationForPositiveWholeNumber x);
    public abstract boolean
    	isZero();
    
    public abstract boolean 
        hasSameMagnitudeAs(SomeInternalRepresentationForPositiveWholeNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(SomeInternalRepresentationForPositiveWholeNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(SomeInternalRepresentationForPositiveWholeNumber x);
}
