package math.number_representations.rational_number.quotient_of_two_whole_numbers;

import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.rational_number.SomeInternalRepresentationForRationalNumber;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;

public interface SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
extends SomeInternalRepresentationForRationalNumber
{
	@Override public SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
	
	
	public abstract SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
        plus(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
    public abstract SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
        minus(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
    public abstract SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
        times(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
    public abstract SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    	dividedBy(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
    public abstract SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    	dividedBy(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x,
    			int accuracy);

    public abstract boolean
        isEqualTo(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
    public abstract boolean
    	isSimilarTo(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
    public abstract boolean 
        isBiggerThan(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
    public abstract boolean
        isSmallerThan(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
    
    public abstract boolean 
        hasSameMagnitudeAs(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
    public abstract boolean 
        hasBiggerMagnitudeThan(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
    public abstract boolean
        hasSmallerMagnitudeThan(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x);
}
