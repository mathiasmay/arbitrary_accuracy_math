package math.number_representations.signum;

import math.number_representations.Magnitude_is_available_as_FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;
import math.number_representations.Magnitude_is_available_as_FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.Signum_is_available_as_FinalInternalRepresentationForSignum;
import math.number_representations.SomeInternalRepresentation;
import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.real_number.SomeInternalRepresentationForRealNumber;
import math.number_representations.real_number.sequence_of_digits.AlwaysConvertibleTo_FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;

public interface SomeInternalRepresentationForSignum
extends SomeInternalRepresentation,
AlwaysConvertibleTo_FinalInternalRepresentationForRealNumberAsASequenceOfDigits,
Magnitude_is_available_as_FinalInternalRepresentationForRealNumberAsASequenceOfDigits,
Magnitude_is_available_as_FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits,
Signum_is_available_as_FinalInternalRepresentationForSignum
{
	public static SomeInternalRepresentationForSignum of(byte x)
	{
		return new FinalInternalRepresentationForSignum(x);
	}

	public static SomeInternalRepresentationForSignum of(int x)
	{
		return new FinalInternalRepresentationForSignum(x);
	}
	
	public SomeInternalRepresentationForSignum
		clone();
	
	public boolean
		equals(SomeInternalRepresentationForSignum x);
	

	public abstract SomeInternalRepresentationForWholeNumber
        plus(SomeInternalRepresentationForSignum x);
    public abstract SomeInternalRepresentationForWholeNumber
        minus(SomeInternalRepresentationForSignum x);
    public abstract SomeInternalRepresentationForSignum
        times(SomeInternalRepresentationForSignum x);
    public abstract SomeInternalRepresentationForSignum
    	dividedBy(SomeInternalRepresentationForSignum x);
    public abstract SomeInternalRepresentationForSignum
    	dividedBy(SomeInternalRepresentationForSignum x, int accuracy);

    public abstract boolean
		isZero();
    public abstract boolean
		isPositive();
    public abstract boolean
		isNegative();
	public int
		asInt();
    
}