package math;

import math.numbers.signum.FinalSignum;

public interface Signum
extends SomeNumber,
        // should include all known SUPERsets
        WholeNumber, RationalNumber, RealNumber, ComplexNumber
{
    
	public static Signum of(int x)
	{
		return new FinalSignum(x);
	}
	
	
    public abstract WholeNumber
        plus(Signum x);
    public abstract WholeNumber
        minus(Signum x);
    public abstract Signum
        times(Signum x);
    public abstract Signum
        dividedBy(Signum x);
    
    public abstract boolean
        isEqualTo(Signum x);
    
    public abstract boolean 
        hasSameRealPartAs(Signum x);
    public abstract boolean
        hasBiggerRealPartThan(Signum x);
    public abstract boolean
        hasSmallerRealPartThan(Signum x);
    
    public abstract boolean 
        hasSameMagnitudeAs(Signum x);
    public abstract boolean 
        hasBiggerMagnitudeThan(Signum x);
    public abstract boolean
        hasSmallerMagnitudeThan(Signum x);
    
    public abstract boolean 
        isBiggerThan(Signum x);
    public abstract boolean
        isSmallerThan(Signum x);
}
