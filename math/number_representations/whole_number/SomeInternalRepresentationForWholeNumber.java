package math.number_representations.whole_number;

import math.number_representations.Magnitude_is_available_as_FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;
import math.number_representations.Magnitude_is_available_as_FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.Signum_is_available_as_FinalInternalRepresentationForSignum;
import math.number_representations.SomeInternalRepresentation;
import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.rational_number.SomeInternalRepresentationForRationalNumber;
import math.number_representations.real_number.SomeInternalRepresentationForRealNumber;
import math.number_representations.real_number.sequence_of_digits.AlwaysConvertibleTo_FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.sequence_of_digits.FinalInternalRepresentationForWholeNumberAsASequenceOfDigits;

public interface SomeInternalRepresentationForWholeNumber
extends SomeInternalRepresentation,
AlwaysConvertibleTo_FinalInternalRepresentationForRealNumberAsASequenceOfDigits,
Magnitude_is_available_as_FinalInternalRepresentationForRealNumberAsASequenceOfDigits,
Magnitude_is_available_as_FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits,
Signum_is_available_as_FinalInternalRepresentationForSignum
{
	public static SomeInternalRepresentationForWholeNumber of(int x)
	{
		return
			new FinalInternalRepresentationForWholeNumberAsASequenceOfDigits(x);
	}
	
	public SomeInternalRepresentationForWholeNumber
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForWholeNumber x);
	

	public abstract SomeInternalRepresentationForWholeNumber
        plus(SomeInternalRepresentationForWholeNumber x);
    public abstract SomeInternalRepresentationForWholeNumber
        minus(SomeInternalRepresentationForWholeNumber x);
    public abstract SomeInternalRepresentationForWholeNumber
        times(SomeInternalRepresentationForWholeNumber x);
    public abstract SomeInternalRepresentationForRationalNumber
    	dividedBy(SomeInternalRepresentationForWholeNumber x);
    public abstract SomeInternalRepresentationForRationalNumber
    	dividedBy(SomeInternalRepresentationForWholeNumber x, int accuracy);

    public abstract boolean
        isEqualTo(SomeInternalRepresentationForWholeNumber x);
    public abstract boolean
    	isSimilarTo(SomeInternalRepresentationForWholeNumber x);
    public abstract boolean 
        isBiggerThan(SomeInternalRepresentationForWholeNumber x);
    public abstract boolean
    	isSmallerThan(SomeInternalRepresentationForWholeNumber x);
    public abstract boolean
    	isZero();
    
    public abstract boolean 
        hasSameMagnitudeAs(SomeInternalRepresentationForWholeNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(SomeInternalRepresentationForWholeNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(SomeInternalRepresentationForWholeNumber x);
}
