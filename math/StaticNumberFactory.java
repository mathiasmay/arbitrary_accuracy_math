package math;

import math.numbers.real_number.FinalRealNumber;
import math.numbers.whole_number.FinalWholeNumber;

public final class StaticNumberFactory
{
    public static FinalRealNumber newRealNumber(double x)
    {
        return new FinalRealNumber(x);
    }
    
    public static FinalWholeNumber wholeNumber(int x)
    {
        return new FinalWholeNumber(x);
    }
}
