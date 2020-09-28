package math;

import math.numbers.positive_whole_number.FinalPositiveWholeNumber;
import math.numbers.whole_number.FinalWholeNumber;

public interface WholeNumber
extends SomeNumber,
        // should include all known SUPERsets
        RationalNumber, RealNumber, ComplexNumber
{
	public static WholeNumber of(int x)
	{
		return new FinalWholeNumber(x);
	}
    
    public abstract WholeNumber
        plus(WholeNumber x);
    public abstract WholeNumber
        minus(WholeNumber x);
    public abstract WholeNumber
        times(WholeNumber x);
    public abstract RationalNumber
        dividedBy(WholeNumber x);

    public abstract boolean
        isEqualTo(WholeNumber x);
    
	public abstract boolean 
        isBiggerThan(WholeNumber x);
    public abstract boolean
        isSmallerThan(WholeNumber x);
}
