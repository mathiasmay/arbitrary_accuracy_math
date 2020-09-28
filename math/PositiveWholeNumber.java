package math;

import math.numbers.positive_whole_number.FinalPositiveWholeNumber;

public interface PositiveWholeNumber
extends SomeNumber,
        // should include all known SUPERsets
        WholeNumber, RationalNumber, RealNumber, ComplexNumber
{
	public static PositiveWholeNumber of(int x)
	{
		return new FinalPositiveWholeNumber(x);
	}
    
    public abstract PositiveWholeNumber
        plus(PositiveWholeNumber x);
    public abstract WholeNumber
        minus(PositiveWholeNumber x);
    public abstract PositiveWholeNumber
        times(PositiveWholeNumber x);
    public abstract RationalNumber
        dividedBy(PositiveWholeNumber x);
    
    public abstract boolean
        isEqualTo(PositiveWholeNumber x);
    
    public abstract boolean 
        hasSameRealPartAs(PositiveWholeNumber x);
    public abstract boolean
        hasBiggerRealPartThan(PositiveWholeNumber x);
    public abstract boolean
        hasSmallerRealPartThan(PositiveWholeNumber x);
    
    public abstract boolean 
        hasSameMagnitudeAs(PositiveWholeNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(PositiveWholeNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(PositiveWholeNumber x);
    
    public abstract boolean 
        isBiggerThan(PositiveWholeNumber x);
    public abstract boolean
        isSmallerThan(PositiveWholeNumber x);
}
