package math.number_representations.whole_number.sequence_of_digits;

import math.number_representations.rational_number.SomeInternalRepresentationForRationalNumber;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;

public interface SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
extends SomeInternalRepresentationForWholeNumber
{
	@Override public SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
	

	public abstract SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
        plus(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
        minus(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
        times(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForRationalNumber
    	dividedBy(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForRationalNumber
    	dividedBy(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x,
    			int accuracy);

    public abstract boolean
        isEqualTo(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
    public abstract boolean
    	isSimilarTo(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
    public abstract boolean 
        isBiggerThan(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
    public abstract boolean
        isSmallerThan(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
    
    public abstract boolean 
        hasSameMagnitudeAs(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
    public abstract boolean 
        hasBiggerMagnitudeThan(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
    public abstract boolean
        hasSmallerMagnitudeThan(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x);
}
