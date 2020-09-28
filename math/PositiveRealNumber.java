package math;

public interface PositiveRealNumber
extends SomeNumber,
        // should include all known SUPERsets
        RealNumber, ComplexNumber
{
    public abstract PositiveRealNumber
        plus(PositiveRealNumber x);
    public abstract RealNumber
        minus(PositiveRealNumber x);
    public abstract PositiveRealNumber
        times(PositiveRealNumber x);
    public abstract PositiveRealNumber
        dividedBy(PositiveRealNumber x);
    
    public abstract boolean
        isEqualTo(PositiveRealNumber x);
    
    public abstract boolean 
        hasSameRealPartAs(PositiveRealNumber x);
    public abstract boolean
        hasBiggerRealPartThan(PositiveRealNumber x);
    public abstract boolean
        hasSmallerRealPartThan(PositiveRealNumber x);
    
    public abstract boolean 
        hasSameMagnitudeAs(PositiveRealNumber x);
    public abstract boolean 
        hasBiggerMagnitudeThan(PositiveRealNumber x);
    public abstract boolean
        hasSmallerMagnitudeThan(PositiveRealNumber x);
    
    public abstract boolean 
        isBiggerThan(PositiveRealNumber x);
    public abstract boolean
        isSmallerThan(PositiveRealNumber x);
}
