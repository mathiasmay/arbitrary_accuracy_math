package math;

import math.numbers.rational_number.FinalRationalNumber;

public interface RationalNumber
extends SomeNumber,
        // should include all known SUPERsets
        RealNumber, ComplexNumber
{
	public static RationalNumber of(int numerator, int denominator)
	{
		return new FinalRationalNumber(numerator, denominator);
	}
	
    public abstract RationalNumber
        plus(RationalNumber x);
    public abstract RationalNumber
        minus(RationalNumber x);
    public abstract RationalNumber
        times(RationalNumber x);
    public abstract RationalNumber
        dividedBy(RationalNumber x);
    
    public abstract boolean
        isEqualTo(RationalNumber x);
    
    public abstract boolean 
        hasSameRealPartAs(RationalNumber x);
    public abstract boolean
        hasBiggerRealPartThan(RationalNumber x);
    public abstract boolean
        hasSmallerRealPartThan(RationalNumber x);
    
    public abstract boolean 
        hasSameMagnitudeAs(RationalNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(RationalNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(RationalNumber x);
    
    public abstract boolean 
        isBiggerThan(RationalNumber x);
    public abstract boolean
        isSmallerThan(RationalNumber x);

}
