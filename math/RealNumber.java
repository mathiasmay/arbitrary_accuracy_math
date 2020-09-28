package math;

import math.number_representations.real_number.sequence_of_digits.FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.numbers.real_number.FinalRealNumber;

public interface RealNumber
extends SomeNumber,
        // should include all known SUPERsets
        ComplexNumber
{
	public enum InternalRepresentation
		{SEQUENCE_OF_DIGITS, RATIONAL_NUMBER}
	
	public static RealNumber of(double x)
	{
		return new FinalRealNumber(x);
	}
	
	public static RealNumber of
	(double x, InternalRepresentation internalRepresentation)
	{
		RealNumber result = null;
		
		switch(internalRepresentation)
		{
			case SEQUENCE_OF_DIGITS:
				result = new FinalRealNumber
				(
					new FinalInternalRepresentationForRealNumberAsASequenceOfDigits(x)
				);
				break;
			case RATIONAL_NUMBER:
				throw new RuntimeException("Not yet implemented");
//				break;
			default:
				result = new FinalRealNumber(x);
		}
		
		return result;
	}
	
//	public static RealNumber of
//	(int x, InternalRepresentation internalRepresentation)
//	{
//		RealNumber result = null;
//		
//		switch(internalRepresentation)
//		{
//			case SEQUENCE_OF_DIGITS:
//				result = new FinalRealNumber
//				(
//					new FinalInternalRepresentationForRealNumberAsASequenceOfDigits(x)
//				);
//				break;
//			case RATIONAL_NUMBER:
//				throw new RuntimeException("Not yet implemented");
////				break;
//			default:
//				result = new FinalRealNumber(x);
//		}
//		
//		return result;
//	}
	
    public abstract Signum 
    getSignum();
    
    public abstract RealNumber
        plus(RealNumber x);
    public abstract RealNumber
        minus(RealNumber x);
    public abstract RealNumber
        times(RealNumber x);
    public abstract RealNumber
        dividedBy(RealNumber x);

    public abstract boolean
        isEqualTo(RealNumber x);
    public abstract boolean
    	isSimilarTo(RealNumber x);
    
    public abstract boolean 
        hasSameMagnitudeAs(RealNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(RealNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(RealNumber x);
    
    public abstract boolean 
        isBiggerThan(RealNumber x);
    public abstract boolean
        isSmallerThan(RealNumber x);
}
