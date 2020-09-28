package math;

public interface PositiveRationalNumber
extends SomeNumber,
        // should include all known SUPERsets
        RationalNumber, RealNumber, ComplexNumber
{
    public abstract PositiveRationalNumber
        plus(PositiveRationalNumber x);
    public abstract RationalNumber
        minus(PositiveRationalNumber x);
    public abstract PositiveRationalNumber
        times(PositiveRationalNumber x);
    public abstract PositiveRationalNumber
        dividedBy(PositiveRationalNumber x);
    
    public abstract boolean
        isEqualTo(PositiveRationalNumber x);
    
    public abstract boolean 
        hasSameRealPartAs(PositiveRationalNumber x);
    public abstract boolean
        hasBiggerRealPartThan(PositiveRationalNumber x);
    public abstract boolean
        hasSmallerRealPartThan(PositiveRationalNumber x);
    
    public abstract boolean 
        hasSameMagnitudeAs(PositiveRationalNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(PositiveRationalNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(PositiveRationalNumber x);
    
    public abstract boolean 
        isBiggerThan(PositiveRationalNumber x);
    public abstract boolean
        isSmallerThan(PositiveRationalNumber x);
}
