package math;

public interface ComplexNumber
extends SomeNumber
        // should include all known SUPERsets
        // (no known SUPERsets, yet)
{
    public abstract ComplexNumber
        plus(ComplexNumber x);
    public abstract ComplexNumber
        minus(ComplexNumber x);
    public abstract ComplexNumber
        times(ComplexNumber x);
    public abstract ComplexNumber
        dividedBy(ComplexNumber x);
    
    public abstract boolean
        isEqualTo(ComplexNumber x);
    
    public abstract boolean 
        hasSameRealPartAs(ComplexNumber x);
    public abstract boolean
        hasBiggerRealPartThan(ComplexNumber x);
    public abstract boolean
        hasSmallerRealPartThan(ComplexNumber x);
    
    public abstract boolean 
        hasSameMagnitudeAs(ComplexNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(ComplexNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(ComplexNumber x);
}
