package math.number_representations.positive_rational_number.quotient_of_two_positive_whole_numbers;

import math.number_representations.positive_rational_number.SomeInternalRepresentationForPositiveRationalNumber;
import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.rational_number.quotient_of_two_whole_numbers.SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers;
import math.number_representations.whole_number.sequence_of_digits.SomeInternalRepresentationForWholeNumberAsASequenceOfDigits;

public interface SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers
extends          SomeInternalRepresentationForPositiveRationalNumber
{
	@Override public SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
	

	public abstract SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers
        plus(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
    public abstract SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
        minus(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
    public abstract SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers
        times(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
    public abstract SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers
    	dividedBy(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
    public abstract SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers
    	dividedBy(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x,
    			int accuracy);

    public abstract boolean
        isEqualTo(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
    public abstract boolean
    	isSimilarTo(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
    public abstract boolean 
        isBiggerThan(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
    public abstract boolean
        isSmallerThan(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
    
    public abstract boolean 
        hasSameMagnitudeAs(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
    public abstract boolean 
        hasBiggerMagnitudeThan(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
    public abstract boolean
        hasSmallerMagnitudeThan(SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers x);
}
