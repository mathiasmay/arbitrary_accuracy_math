package math.number_representations.real_number.sequence_of_digits;

import math.number_representations.real_number.SomeInternalRepresentationForRealNumber;

public interface SomeInternalRepresentationForRealNumberAsASequenceOfDigits
extends SomeInternalRepresentationForRealNumber,
AlwaysConvertibleTo_FinalInternalRepresentationForRealNumberAsASequenceOfDigits
{
	@Override public SomeInternalRepresentationForRealNumberAsASequenceOfDigits
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
	

	public abstract SomeInternalRepresentationForRealNumberAsASequenceOfDigits
        plus(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForRealNumberAsASequenceOfDigits
        minus(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForRealNumberAsASequenceOfDigits
        times(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForRealNumberAsASequenceOfDigits
    	dividedBy(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
    public abstract SomeInternalRepresentationForRealNumberAsASequenceOfDigits
    	dividedBy(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x,
    			int accuracy);

    public abstract boolean
        isEqualTo(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
    public abstract boolean
    	isSimilarTo(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
    public abstract boolean 
        isBiggerThan(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
    public abstract boolean
        isSmallerThan(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
    
    public abstract boolean 
        hasSameMagnitudeAs(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
    public abstract boolean 
        hasBiggerMagnitudeThan(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
    public abstract boolean
        hasSmallerMagnitudeThan(SomeInternalRepresentationForRealNumberAsASequenceOfDigits x);
}
