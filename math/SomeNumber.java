package math;

import java.util.Optional;

public interface SomeNumber
{

//    public abstract boolean
//        setValueIfPossibleOrReturnFalse(Integer x);
//    public abstract void
//        setValueIfPossibleOrThrowException(Integer x);
//    public abstract boolean
//        setValueIfPossibleOrReturnFalse(Double x);
//    public abstract void
//        setValueIfPossibleOrThrowException(Double x);


    

    // TODO public abstract String toString();

    // equals() is needed in the convenience interfaces,
    // because some tests require it to compare Objects
    @Override
	boolean equals(Object obj);

    // TODO public abstract void print(); using .toString()
    
    

    public abstract Optional<Integer>
        getValueAsIntegerIfPossible();
    public abstract Optional<Double>
        getValueAsDoubleIfPossible();
    

    // getMagnitude() can't be in the interfaces for specific number-types,
    // since it causes method declarations with same signature and different
    // return types
    public abstract PositiveRealNumber
        getMagnitude();
    

    public abstract SomeNumber
        plus(SomeNumber x);
    public abstract SomeNumber
        minus(SomeNumber x);
    public abstract SomeNumber
        times(SomeNumber x);
    public abstract SomeNumber
        dividedBy(SomeNumber x);
    
    public abstract boolean
        isEqualTo(SomeNumber x);
}
