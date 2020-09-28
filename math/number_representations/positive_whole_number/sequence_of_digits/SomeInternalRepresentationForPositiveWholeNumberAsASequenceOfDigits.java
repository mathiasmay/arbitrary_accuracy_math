package math.number_representations.positive_whole_number.sequence_of_digits;

import math.number_representations.positive_rational_number.quotient_of_two_positive_whole_numbers.SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers;
import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.rational_number.quotient_of_two_whole_numbers.SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.sequence_of_digits.SomeInternalRepresentationForWholeNumberAsASequenceOfDigits;

public interface SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
extends          SomeInternalRepresentationForPositiveWholeNumber
{
	@Override public SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
	

	public abstract SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        plus(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
        minus(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        times(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    	dividedBy(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    	dividedBy(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x,
    			int accuracy);

    public abstract boolean
        isEqualTo(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
    public abstract boolean
    	isSimilarTo(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
    public abstract boolean 
        isBiggerThan(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
    public abstract boolean
        isSmallerThan(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
    
    
    public abstract boolean 
        hasSameMagnitudeAs(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
    public abstract boolean 
        hasBiggerMagnitudeThan(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
    public abstract boolean
        hasSmallerMagnitudeThan(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x);
}
